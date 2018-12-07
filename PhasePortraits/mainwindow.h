#ifndef MAINWINDOW_H
#define MAINWINDOW_H

#include <QMainWindow>
#include <future>
#include <list>
#include <functional>

namespace Ui {
class MainWindow;
}

class MainWindow : public QMainWindow
{
    Q_OBJECT

public:
    explicit MainWindow(QWidget *parent = nullptr);
    ~MainWindow();
    void draw(std::pair<std::vector<double>, std::vector<double>> startPoints);

    static constexpr size_t THREADS = 4;

private slots:
    void on_setStartPointsButton_clicked();

private:
    static std::list<std::pair<std::vector<double>, std::vector<double>>> calcPoints(
            std::vector<double> x, std::vector<double> y,
            std::function<std::pair<std::vector<double>, std::vector<double>>(double, double)> f);

    Ui::MainWindow *ui;
};

#endif // MAINWINDOW_H
