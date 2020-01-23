
// ProjectLinea.h : main header file for the PROJECT_NAME application
//

#pragma once

#ifndef __AFXWIN_H__
	#error "include 'pch.h' before including this file for PCH"
#endif

#include "resource.h"		// main symbols


// CProjectLineaApp:
// See ProjectLinea.cpp for the implementation of this class
//

class CProjectLineaApp : public CWinApp
{
public:
	CProjectLineaApp();

// Overrides
public:
	virtual BOOL InitInstance();

// Implementation

	DECLARE_MESSAGE_MAP()
};

extern CProjectLineaApp theApp;
