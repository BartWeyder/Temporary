#ifndef MAINWINDOW_H
#define MAINWINDOW_H

#include <QMainWindow>
#include <future>
#include <list>
#include <functional>
#include "qcustomplot.h"

namespace Ui {
class MainWindow;
}

class MainWindow : public QMainWindow
{
    Q_OBJECT

public:
    explicit MainWindow(QWidget *parent = nullptr);
    ~MainWindow();
    void draw(std::pair<std::vector<double>, std::vector<double> > &startPoints);

    static constexpr size_t THREADS = 4;

private slots:
    void on_setStartPointsButton_clicked();

private:
    static std::list<std::pair<QVector<double>, QVector<double> > > calcPoints(
            std::vector<double>::iterator x_start, std::vector<double>::iterator x_end,  std::vector<double>::iterator y_start,
            std::function<std::pair<QVector<double>, QVector<double>>(double, double)> f);

    Ui::MainWindow *ui;
    std::list<std::shared_ptr<QCPCurve>> curves;
};

#endif // MAINWINDOW_H
