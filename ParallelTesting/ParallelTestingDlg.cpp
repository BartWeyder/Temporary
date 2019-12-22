
// ParallelTestingDlg.cpp : implementation file
//

#include "stdafx.h"
#include "ParallelTesting.h"
#include "ParallelTestingDlg.h"
#include "afxdialogex.h"
#include <mutex>
#include <algorithm>

#ifdef _DEBUG
#define new DEBUG_NEW
#endif

// CAboutDlg dialog used for App About

class CAboutDlg : public CDialogEx
{
public:
	CAboutDlg();

// Dialog Data
#ifdef AFX_DESIGN_TIME
	enum { IDD = IDD_ABOUTBOX };
#endif

	protected:
	virtual void DoDataExchange(CDataExchange* pDX);    // DDX/DDV support

// Implementation
protected:
	DECLARE_MESSAGE_MAP()
};

CAboutDlg::CAboutDlg() : CDialogEx(IDD_ABOUTBOX)
{
}

void CAboutDlg::DoDataExchange(CDataExchange* pDX)
{
	CDialogEx::DoDataExchange(pDX);
}

BEGIN_MESSAGE_MAP(CAboutDlg, CDialogEx)
END_MESSAGE_MAP()


// CParallelTestingDlg dialog



CParallelTestingDlg::CParallelTestingDlg(CWnd* pParent /*=nullptr*/)
	: CDialogEx(IDD_PARALLELTESTING_DIALOG, pParent)
   , m_threadsCount(_T(""))
   , m_testSuiteName(_T(""))
{
	m_hIcon = AfxGetApp()->LoadIcon(IDR_MAINFRAME);
}

void CParallelTestingDlg::DoDataExchange(CDataExchange* pDX)
{
   CDialogEx::DoDataExchange(pDX);
   DDX_Text(pDX, IDC_THREADS_COUNT_EDIT, m_threadsCount);
   DDV_MaxChars(pDX, m_threadsCount, 3);
   DDX_Control(pDX, IDC_TESTSUITE_COMBO, m_testSuiteCombo);
   DDX_CBString(pDX, IDC_TESTSUITE_COMBO, m_testSuiteName);
   DDX_Control(pDX, IDC_RESULT_STATIC, m_resultStatic);
   DDX_Control(pDX, IDC_TIME_STATIC, m_timeSpent);
   DDX_Control(pDX, IDC_RUN, m_runBtn);
   DDX_Control(pDX, IDC_STOP, m_stopBtn);
}

BEGIN_MESSAGE_MAP(CParallelTestingDlg, CDialogEx)
	ON_WM_SYSCOMMAND()
	ON_WM_PAINT()
	ON_WM_QUERYDRAGICON()
   ON_CBN_SELCHANGE(IDC_TESTSUITE_COMBO, &CParallelTestingDlg::OnCbnSelchangeTestsuiteCombo)
   ON_BN_CLICKED(IDC_RUN, &CParallelTestingDlg::OnBnClickedRun)
   ON_BN_CLICKED(IDC_STOP, &CParallelTestingDlg::OnBnClickedStop)
   ON_MESSAGE(WM_USER + 1, HandleThreadEnded)
   ON_CBN_KILLFOCUS(IDC_TESTSUITE_COMBO, &CParallelTestingDlg::OnCbnKillfocusTestsuiteCombo)
END_MESSAGE_MAP()


// CParallelTestingDlg message handlers

BOOL CParallelTestingDlg::OnInitDialog()
{
	CDialogEx::OnInitDialog();

	// Add "About..." menu item to system menu.

	// IDM_ABOUTBOX must be in the system command range.
	ASSERT((IDM_ABOUTBOX & 0xFFF0) == IDM_ABOUTBOX);
	ASSERT(IDM_ABOUTBOX < 0xF000);

	CMenu* pSysMenu = GetSystemMenu(FALSE);
	if (pSysMenu != nullptr)
	{
		BOOL bNameValid;
		CString strAboutMenu;
		bNameValid = strAboutMenu.LoadString(IDS_ABOUTBOX);
		ASSERT(bNameValid);
		if (!strAboutMenu.IsEmpty())
		{
			pSysMenu->AppendMenu(MF_SEPARATOR);
			pSysMenu->AppendMenu(MF_STRING, IDM_ABOUTBOX, strAboutMenu);
		}
	}

	// Set the icon for this dialog.  The framework does this automatically
	//  when the application's main window is not a dialog
	SetIcon(m_hIcon, TRUE);			// Set big icon
	SetIcon(m_hIcon, FALSE);		// Set small icon

   m_testSuite = std::make_unique<GSuite::TestSuite>(m_testSuiteName.GetString());

	return TRUE;  // return TRUE  unless you set the focus to a control
}

void CParallelTestingDlg::OnSysCommand(UINT nID, LPARAM lParam)
{
	if ((nID & 0xFFF0) == IDM_ABOUTBOX)
	{
		CAboutDlg dlgAbout;
		dlgAbout.DoModal();
	}
	else
	{
		CDialogEx::OnSysCommand(nID, lParam);
	}
}

// If you add a minimize button to your dialog, you will need the code below
//  to draw the icon.  For MFC applications using the document/view model,
//  this is automatically done for you by the framework.

void CParallelTestingDlg::OnPaint()
{
	if (IsIconic())
	{
		CPaintDC dc(this); // device context for painting

		SendMessage(WM_ICONERASEBKGND, reinterpret_cast<WPARAM>(dc.GetSafeHdc()), 0);

		// Center icon in client rectangle
		int cxIcon = GetSystemMetrics(SM_CXICON);
		int cyIcon = GetSystemMetrics(SM_CYICON);
		CRect rect;
		GetClientRect(&rect);
		int x = (rect.Width() - cxIcon + 1) / 2;
		int y = (rect.Height() - cyIcon + 1) / 2;

		// Draw the icon
		dc.DrawIcon(x, y, m_hIcon);
	}
	else
	{
		CDialogEx::OnPaint();
	}
}

// The system calls this function to obtain the cursor to display while the user drags
//  the minimized window.
HCURSOR CParallelTestingDlg::OnQueryDragIcon()
{
	return static_cast<HCURSOR>(m_hIcon);
}

LRESULT CParallelTestingDlg::HandleThreadEnded(WPARAM wParam, LPARAM lParam)
{
   static const auto resultTemplate = "Result: %d/%d succeded";
   static const auto timeTemplate = "Time spent: %f seconds";

   if (++finished == m_threads.size())
   {
      m_endTime = std::chrono::system_clock::now();
      const std::chrono::duration<double> diff = m_endTime - m_startTime;

      CString str;
      const auto size = m_testSuite->TestCasesCount();
      str.Format(resultTemplate, size - m_failed, size);
      setWindowText(&m_resultStatic, str);

      str.Format(timeTemplate, diff.count());
      setWindowText(&m_timeSpent, str);
      m_runBtn.EnableWindow();
      m_stopBtn.EnableWindow(FALSE);
   }
   
   UpdateData(FALSE);
   return LRESULT();
}



void CParallelTestingDlg::OnCbnSelchangeTestsuiteCombo()
{
   UpdateData();
   m_testSuite = std::make_unique<GSuite::TestSuite>(m_testSuiteName.GetString());

   setWindowText(GetDlgItem(IDC_TESTS_COUNT), ("Test cases: " + std::to_string(m_testSuite->TestCasesCount())).c_str());
}

void CParallelTestingDlg::OnBnClickedRun()
{
   UpdateData();
   setWindowText(&m_resultStatic, "Result:");
   setWindowText(&m_timeSpent, "Time spent:");
   m_startTime = std::chrono::system_clock::now();
   finished = 0;
   const auto size = m_testSuite->TestCasesCount();
   const auto threadsCount = std::atoi(m_threadsCount);
   VERIFY(threadsCount > 0);
   const auto chunkSize = size % threadsCount == 0 ? size / threadsCount : size / threadsCount + 1;
   ASSERT(chunkSize > 0);

   size_t end = chunkSize;
   terminateThreads();
   m_cancelTokens = std::vector<std::atomic_bool>(threadsCount);
   for (size_t begin = 0; begin < size; begin += chunkSize)
   {
      end = end > size ? size : end;
      const auto index = m_threads.size();
      m_threads.emplace_back([this, begin, end, index]()
      {
         static std::mutex mu;
         const auto& tests = m_testSuite->GetTestsMap();
         for (size_t i = begin; i < end; i++)
         {
            if (!tests[i]())
            {
               std::scoped_lock lock(mu);
               m_failed++;
            }
            if (m_cancelTokens[index]) 
            { 
               return; 
            }
         }
         std::scoped_lock lock(mu);
         PostMessage(WM_USER + 1);
      });
      end += chunkSize;
   }

   m_runBtn.EnableWindow(FALSE);
   m_stopBtn.EnableWindow();
}


void CParallelTestingDlg::OnBnClickedStop()
{
   terminateThreads();
   m_runBtn.EnableWindow();
   m_stopBtn.EnableWindow(FALSE);

}


void CParallelTestingDlg::OnCbnKillfocusTestsuiteCombo()
{
   OnCbnSelchangeTestsuiteCombo();
   const auto processors = std::thread::hardware_concurrency();
   const auto atomicPercent = 1. / m_testSuite->TestCasesCount();
   const auto gustav = atomicPercent + (1 - atomicPercent) * processors;
   const auto amdal = 1. / (atomicPercent + (1 - atomicPercent) / processors);

   static const auto messageTemplate = "Processors count: %d\n"
      "Gustav rate: %f performance improvement\n"
      "Amdal rate: %f performance improvement\n";
   m_threadsCount =
      std::to_string(m_testSuite->TestCasesCount() >= processors ? processors : m_testSuite->TestCasesCount()).c_str();
   UpdateData(FALSE);
   CString str;
   str.Format(messageTemplate, processors, gustav, amdal);
   MessageBox(str, "Performance", MB_OK);
}

void CParallelTestingDlg::terminateThreads()
{
   std::for_each(m_cancelTokens.begin(), m_cancelTokens.end(), [](std::atomic_bool& value) { value = true; });
   std::for_each(m_threads.begin(), m_threads.end(), [](std::thread& thread) { if(thread.joinable()) thread.join(); });
   m_threads.clear();
}

void CParallelTestingDlg::setWindowText(CWnd * i_control, LPCSTR i_text)
{
   i_control->SetWindowText(i_text);
   CRect rect;
   i_control->GetWindowRect(&rect);
   ScreenToClient(&rect);
   InvalidateRect(&rect);
   UpdateWindow();
}
