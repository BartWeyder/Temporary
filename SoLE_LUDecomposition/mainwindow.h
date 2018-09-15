#ifndef MAINWINDOW_H
#define MAINWINDOW_H

#include <QMainWindow>
#include "inputmatrix.h"
#include "bvectormodel.h"
#include "tasksolutionmodel.h"

namespace Ui {
class MainWindow;
}

class MainWindow : public QMainWindow
{
    Q_OBJECT

public:
    explicit MainWindow(QWidget *parent = 0);
    ~MainWindow();

private:
    Ui::MainWindow *ui;
    InputMatrix *input_matrix;
    BVectorModel *bVec;
    TaskSolutionModel *solution;

public slots:
    void calculate();
};

#endif // MAINWINDOW_H
