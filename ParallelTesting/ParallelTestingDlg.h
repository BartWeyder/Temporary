
// ParallelTestingDlg.h : header file
//

#pragma once

#include "TestSuite.h"
#include <thread>
#include <chrono>
#include <mutex>
#include <atomic>

// CParallelTestingDlg dialog
class CParallelTestingDlg : public CDialogEx
{
// Construction
public:
	CParallelTestingDlg(CWnd* pParent = nullptr);	// standard constructor

// Dialog Data
#ifdef AFX_DESIGN_TIME
	enum { IDD = IDD_PARALLELTESTING_DIALOG };
#endif

	protected:
	virtual void DoDataExchange(CDataExchange* pDX);	// DDX/DDV support


// Implementation
protected:
	HICON m_hIcon;

	// Generated message map functions
	virtual BOOL OnInitDialog();
	afx_msg void OnSysCommand(UINT nID, LPARAM lParam);
	afx_msg void OnPaint();
	afx_msg HCURSOR OnQueryDragIcon();
   afx_msg LRESULT HandleThreadEnded(WPARAM wParam, LPARAM lParam); 
   DECLARE_MESSAGE_MAP()
public:
   // Defines how many threads do we need to use   // Defines how many threads do we need to use
   afx_msg void OnCbnSelchangeTestsuiteCombo();
   afx_msg void OnBnClickedRun();
   afx_msg void OnBnClickedStop();
   afx_msg void OnCbnKillfocusTestsuiteCombo();

private:
   void terminateThreads();
   void setWindowText(CWnd* i_control, LPCSTR i_text);


   CString m_threadsCount;
   // Combo control to pick test suite
   CComboBox m_testSuiteCombo;
   CString m_testSuiteName;
   std::unique_ptr<GSuite::TestSuite> m_testSuite;
   std::vector<std::thread> m_threads;
   std::vector<std::atomic_bool> m_cancelTokens;
   size_t m_failed = 0;
   std::mutex mu;
   size_t finished = 0;
   std::chrono::time_point<std::chrono::system_clock> m_startTime;
   std::chrono::time_point<std::chrono::system_clock> m_endTime;
   // Result Text
   CStatic m_resultStatic;
   // Time spent
   CStatic m_timeSpent;
   CButton m_runBtn;
   CButton m_stopBtn;
};
