
// ProjectLineaDlg.cpp : implementation file
//

#include "pch.h"
#include "framework.h"
#include "ProjectLinea.h"
#include "ProjectLineaDlg.h"
#include "afxdialogex.h"
#include <memory>

#ifdef _DEBUG
#define new DEBUG_NEW
#endif

namespace
{
   BOOL CALLBACK EnumWidowsProc(HWND i_hWnd, LPARAM i_lParam)
   {
      TCHAR text[256];
      const auto result = ::SendMessage(i_hWnd, WM_GETTEXT, sizeof(text), LPARAM(text));
      if (result)
      {
         CString str(text);
         if (str == _T("Sartorius Powertools"))
         {
            theApp.DoMessageBox(_T("Found"), MB_OK, 0);
            *reinterpret_cast<HWND*>(i_lParam) = i_hWnd;
            return FALSE;
         }
      }
      return TRUE;
   }

   BOOL CALLBACK EnumWidowsProcResult(HWND i_hWnd, LPARAM i_lParam)
   {
      static constexpr auto sc_classIdentifier = _T("Powertools.exe");
      TCHAR text[256];
      TCHAR classNameRaw[256];

      const auto result = ::SendMessage(i_hWnd, WM_GETTEXT, sizeof(text), LPARAM(text));
      const auto classNameResult = ::GetClassName(i_hWnd, classNameRaw, sizeof(text));


      if (result && classNameResult)
      {
         CString str(text);
         CString className(classNameRaw);
         // Caption is RESULT, and we know that this window belongs to Powertools.exe process
         if (str == _T("RESULT") && className.Find(sc_classIdentifier) >= 0)
         {
            theApp.DoMessageBox(_T("Found"), MB_OK, 0);
            *reinterpret_cast<HWND*>(i_lParam) = i_hWnd;
            return FALSE;
         }
      }
      return TRUE;
   }
}

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


// CProjectLineaDlg dialog



CProjectLineaDlg::CProjectLineaDlg(CWnd* pParent /*=nullptr*/)
	: CDialogEx(IDD_PROJECTLINEA_DIALOG, pParent)
{
	m_hIcon = AfxGetApp()->LoadIcon(IDR_MAINFRAME);
}

void CProjectLineaDlg::DoDataExchange(CDataExchange* pDX)
{
	CDialogEx::DoDataExchange(pDX);
}

BEGIN_MESSAGE_MAP(CProjectLineaDlg, CDialogEx)
	ON_WM_SYSCOMMAND()
	ON_WM_PAINT()
	ON_WM_QUERYDRAGICON()
   ON_BN_CLICKED(IDC_GetSnapshot, &CProjectLineaDlg::OnBnClickedGetsnapshot)
   ON_BN_CLICKED(IDC_GET_RESULT, &CProjectLineaDlg::OnBnClickedGetResult)
END_MESSAGE_MAP()


// CProjectLineaDlg message handlers

BOOL CProjectLineaDlg::OnInitDialog()
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

	// TODO: Add extra initialization here

	return TRUE;  // return TRUE  unless you set the focus to a control
}

void CProjectLineaDlg::OnSysCommand(UINT nID, LPARAM lParam)
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

void CProjectLineaDlg::OnPaint()
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
HCURSOR CProjectLineaDlg::OnQueryDragIcon()
{
	return static_cast<HCURSOR>(m_hIcon);
}

void CProjectLineaDlg::OnBnClickedGetsnapshot()
{
   auto foundHwnd = std::make_unique<HWND>();
   EnumWindows(EnumWidowsProc, LPARAM(foundHwnd.get()));
   if (foundHwnd && *foundHwnd)
   {
      auto image = std::make_unique<ATL::CImage>();
      RECT rect;
      ::GetWindowRect(*foundHwnd, &rect);
      image->Create(rect.right - rect.left, rect.bottom - rect.top, 32);
      auto dc = image->GetDC();
      ::PrintWindow(*foundHwnd, dc, PW_CLIENTONLY);
      image->Save(_T("main.png"));
      image->ReleaseDC();
   }
}


void CProjectLineaDlg::OnBnClickedGetResult()
{
   auto foundHwnd = std::make_unique<HWND>();
   EnumWindows(EnumWidowsProcResult, LPARAM(foundHwnd.get()));
   if (foundHwnd && *foundHwnd)
   {
      auto image = std::make_unique<ATL::CImage>();
      RECT rect;
      ::GetWindowRect(*foundHwnd, &rect);
      image->Create(rect.right - rect.left, rect.bottom - rect.top, 32);
      auto dc = image->GetDC();
      ::PrintWindow(*foundHwnd, dc, 0x0);
      image->Save(_T("result.png"));
      image->ReleaseDC();
   }
}
