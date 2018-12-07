#include "mainwindow.h"
#include "ui_mainwindow.h"
#include "addcurvedialog.h"
#include "phaseportraits.h"
#include <QVector>

using pp = PhasePortraits;

MainWindow::MainWindow(QWidget *parent) :
    QMainWindow(parent),
    ui(new Ui::MainWindow)
{
    ui->setupUi(this);
}

MainWindow::~MainWindow()
{
    delete ui;
}

void MainWindow::draw(std::pair<std::vector<double>, std::vector<double> > startPoints)
{
    std::vector<std::future<std::list<std::pair<std::vector<double>, std::vector<double>>>>> v;
    v.reserve(THREADS);
    const size_t part_size = startPoints.first.size() / THREADS;

    auto start_x = startPoints.first.begin();
    auto end_x = start_x + part_size;
    auto start_y = startPoints.second.begin();
    auto end_y = start_x + part_size;

    if (part_size)
        for(size_t i = 0; i < part_size - 1; ++i)
        {
            v.push_back(std::async(std::launch::async, calcPoints,
                std::vector<double>(start_x, end_x), std::vector<double>(start_y, end_y),
                pp::getPhaseCurveConst));
            start_x += part_size;
            end_x += part_size;
            start_y += part_size;
            end_y += part_size;
        }

    v.push_back(std::async(std::launch::async, calcPoints,
        std::vector<double>(start_x, startPoints.first.end()), std::vector<double>(start_y, startPoints.second.end()),
        pp::getPhaseCurveConst));

    size_t j = 0;
    QVector<double> t(pp::N);
    for(int i = 0; i < pp::N; ++i)
        t[i] = i;
    for (auto &i : v)
    {
        auto points = i.get();
        for (auto &point : points)
        {
            ui->widget->addGraph();
//            ui->widget->graph(j)->setData(QVector<double>::fromStdVector(point.first),
//                                          QVector<double>::fromStdVector(point.second));
            QCPCurve *fermatSpiral1 = new QCPCurve(ui->widget->xAxis, ui->widget->yAxis);
            fermatSpiral1->setData(t, QVector<double>::fromStdVector(point.first),
                                       QVector<double>::fromStdVector(point.second));
//            QVector<QCPCurveData> lll(5);
//            lll[0] = QCPCurveData(0, 1.0,0);
//            lll[1] = QCPCurveData(1, 0,-1);
//            lll[2] = QCPCurveData(2, -1.0,-2);
//            lll[3] = QCPCurveData(3, 0.0,2);
//            lll[4] = QCPCurveData(4, 1.0,3);
//            fermatSpiral1->data()->set(lll, true);
            //ui->widget->graph(j)->addData({1.0, 0, -1, 0, 1}, {0, -1, -2, 2, 3}, true);
//            ++j;
        }
    }

    ui->widget->xAxis->setLabel("x");
    ui->widget->yAxis->setLabel("y");
    ui->widget->xAxis->setRange(-4,4);
    ui->widget->yAxis->setRange(-4,4);
    ui->widget->setInteractions(QCP::iRangeDrag | QCP::iRangeZoom | QCP::iSelectPlottables);
    ui->widget->replot();
}

void MainWindow::on_setStartPointsButton_clicked()
{
    AddCurveDialog addCurveDialog(this, ui->startPointsCount->value());
    addCurveDialog.setModal(true);
    if(addCurveDialog.exec())
    {
        auto val = addCurveDialog.getValues();
        draw(val);
    }
}

// TODO: change logic
std::list<std::pair<std::vector<double>, std::vector<double> > > MainWindow::calcPoints(
        std::vector<double> x, std::vector<double> y,
        std::function<std::pair<std::vector<double>, std::vector<double>>(double, double)> f)
{
    std::list<std::pair<std::vector<double>, std::vector<double> > > list;
    for(size_t i = 0; i < x.size(); ++i)
    {
        list.push_back(f(x[i], y[i]));
    }
    return list;
}
