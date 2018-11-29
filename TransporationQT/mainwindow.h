#ifndef MAINWINDOW_H
#define MAINWINDOW_H

#include <QMainWindow>
#include "costs.h"
#include "needs.h"
#include "production.h"
#include "result.h"

namespace Ui {
class MainWindow;
}

class MainWindow : public QMainWindow
{
    Q_OBJECT

public:
    explicit MainWindow(QWidget *parent = nullptr);
    ~MainWindow();

public slots:
    void setRows(const int &size);
    void setCols(const int &size);
    void calculate();

private:
    Ui::MainWindow *ui;
    Costs *costs;
    Needs *needs;
    Production *production;
    Result *result;
};

#endif // MAINWINDOW_H
