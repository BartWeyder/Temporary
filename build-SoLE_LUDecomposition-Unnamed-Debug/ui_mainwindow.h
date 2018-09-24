/********************************************************************************
** Form generated from reading UI file 'mainwindow.ui'
**
** Created by: Qt User Interface Compiler version 5.6.3
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_MAINWINDOW_H
#define UI_MAINWINDOW_H

#include <QtCore/QVariant>
#include <QtWidgets/QAction>
#include <QtWidgets/QApplication>
#include <QtWidgets/QButtonGroup>
#include <QtWidgets/QHeaderView>
#include <QtWidgets/QLabel>
#include <QtWidgets/QMainWindow>
#include <QtWidgets/QMenuBar>
#include <QtWidgets/QPushButton>
#include <QtWidgets/QSpinBox>
#include <QtWidgets/QStatusBar>
#include <QtWidgets/QTableView>
#include <QtWidgets/QToolBar>
#include <QtWidgets/QWidget>

QT_BEGIN_NAMESPACE

class Ui_MainWindow
{
public:
    QWidget *centralWidget;
    QTableView *mainMatrix;
    QPushButton *calculateButton;
    QTableView *answerVector;
    QSpinBox *dimension;
    QLabel *dimensionLabel;
    QLabel *matrixLabel;
    QLabel *answerLabel;
    QTableView *bVector;
    QLabel *label;
    QMenuBar *menuBar;
    QToolBar *mainToolBar;
    QStatusBar *statusBar;

    void setupUi(QMainWindow *MainWindow)
    {
        if (MainWindow->objectName().isEmpty())
            MainWindow->setObjectName(QStringLiteral("MainWindow"));
        MainWindow->setEnabled(true);
        MainWindow->resize(770, 341);
        centralWidget = new QWidget(MainWindow);
        centralWidget->setObjectName(QStringLiteral("centralWidget"));
        mainMatrix = new QTableView(centralWidget);
        mainMatrix->setObjectName(QStringLiteral("mainMatrix"));
        mainMatrix->setGeometry(QRect(10, 60, 551, 191));
        calculateButton = new QPushButton(centralWidget);
        calculateButton->setObjectName(QStringLiteral("calculateButton"));
        calculateButton->setEnabled(true);
        calculateButton->setGeometry(QRect(260, 260, 75, 23));
        answerVector = new QTableView(centralWidget);
        answerVector->setObjectName(QStringLiteral("answerVector"));
        answerVector->setGeometry(QRect(670, 60, 91, 191));
        answerVector->horizontalHeader()->setVisible(false);
        answerVector->verticalHeader()->setVisible(false);
        dimension = new QSpinBox(centralWidget);
        dimension->setObjectName(QStringLiteral("dimension"));
        dimension->setGeometry(QRect(170, 10, 42, 22));
        dimension->setMinimum(2);
        dimension->setMaximum(5);
        dimension->setValue(3);
        dimensionLabel = new QLabel(centralWidget);
        dimensionLabel->setObjectName(QStringLiteral("dimensionLabel"));
        dimensionLabel->setGeometry(QRect(70, 10, 91, 20));
        matrixLabel = new QLabel(centralWidget);
        matrixLabel->setObjectName(QStringLiteral("matrixLabel"));
        matrixLabel->setGeometry(QRect(270, 40, 61, 16));
        answerLabel = new QLabel(centralWidget);
        answerLabel->setObjectName(QStringLiteral("answerLabel"));
        answerLabel->setGeometry(QRect(700, 40, 47, 13));
        bVector = new QTableView(centralWidget);
        bVector->setObjectName(QStringLiteral("bVector"));
        bVector->setGeometry(QRect(570, 60, 91, 191));
        bVector->horizontalHeader()->setVisible(false);
        bVector->horizontalHeader()->setHighlightSections(true);
        bVector->verticalHeader()->setVisible(false);
        label = new QLabel(centralWidget);
        label->setObjectName(QStringLiteral("label"));
        label->setGeometry(QRect(600, 40, 41, 16));
        MainWindow->setCentralWidget(centralWidget);
        menuBar = new QMenuBar(MainWindow);
        menuBar->setObjectName(QStringLiteral("menuBar"));
        menuBar->setGeometry(QRect(0, 0, 770, 21));
        MainWindow->setMenuBar(menuBar);
        mainToolBar = new QToolBar(MainWindow);
        mainToolBar->setObjectName(QStringLiteral("mainToolBar"));
        MainWindow->addToolBar(Qt::TopToolBarArea, mainToolBar);
        statusBar = new QStatusBar(MainWindow);
        statusBar->setObjectName(QStringLiteral("statusBar"));
        MainWindow->setStatusBar(statusBar);

        retranslateUi(MainWindow);

        QMetaObject::connectSlotsByName(MainWindow);
    } // setupUi

    void retranslateUi(QMainWindow *MainWindow)
    {
        MainWindow->setWindowTitle(QApplication::translate("MainWindow", "MainWindow", Q_NULLPTR));
        calculateButton->setText(QApplication::translate("MainWindow", "Calculate", Q_NULLPTR));
        dimensionLabel->setText(QApplication::translate("MainWindow", "Matrix Dimension:", Q_NULLPTR));
        matrixLabel->setText(QApplication::translate("MainWindow", "Task Matrix", Q_NULLPTR));
        answerLabel->setText(QApplication::translate("MainWindow", "Answer", Q_NULLPTR));
        label->setText(QApplication::translate("MainWindow", "Vector b", Q_NULLPTR));
    } // retranslateUi

};

namespace Ui {
    class MainWindow: public Ui_MainWindow {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_MAINWINDOW_H
