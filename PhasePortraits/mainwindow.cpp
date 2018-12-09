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
    std::vector<double> v1{-4,-3.5,-3.4, -3.2,-2.8,-2.5,-2.2,-2,-1.8,-1.5,-1.2,-1,-0.5,1.0001,0.999,1,1};
    std::vector<double> v2{4,4,4,4,4,4,4,4,4,4,4,4,4,0,0,0.0001, -0.0001};
    auto p = std::make_pair(v1,v2);
    draw(p);
}

MainWindow::~MainWindow()
{
    delete ui;
}

void MainWindow::draw(std::pair<std::vector<double>, std::vector<double> >& startPoints)
{
    std::vector<std::future<std::list<std::pair<QVector<double>, QVector<double>>>>> v;
    v.reserve(THREADS);
    const size_t part_size = startPoints.first.size() / THREADS;

    auto start_x = startPoints.first.begin();
    auto end_x = start_x + part_size;
    auto start_y = startPoints.second.begin();
    //auto end_y = start_x + part_size;

    // pick function
    auto f_ = pp::getPhaseCurveConst;

    switch(ui->comboBox->currentIndex())
    {
    case 1:
        f_ = pp::getPhaseCurveNorm;
        break;
    case 2:
        f_ = pp::getPhaseCurveTan;
        break;
    default:
        f_ = pp::getPhaseCurveConst;
        break;
    }

    // divide work between threads
    if (part_size)
        for(size_t i = 0; i < part_size - 1; ++i)
        {
            v.push_back(std::async(std::launch::async, calcPoints,
                start_x, end_x, start_y,
                f_));
            start_x += part_size;
            end_x += part_size;
            start_y += part_size;
            //end_y += part_size;
        }

    // give work for final thread
    v.push_back(std::async(std::launch::async, calcPoints,
        start_x, startPoints.first.end(), start_y,
        f_));

    // container to store curves objects, shared_ptr used for auto delete


    QVector<double> t(pp::N);
    for(size_t i = 0; i < pp::N; ++i)
        t[i] = i;
    for (auto &i : v)
    {
        auto points = i.get();
        for (auto &point_set : points)
        {
            QCPCurve *curve = new QCPCurve(ui->widget->xAxis, ui->widget->yAxis);
            //curves.emplace_back(curve);
            curve->setData(t, point_set.first,
                                       point_set.second);
        }
    }

    // set plot widget style
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
        ui->widget->clearPlottables();
        auto val = addCurveDialog.getValues();
        draw(val);
    }
}

// TODO: change logic
std::list<std::pair<QVector<double>, QVector<double> > > MainWindow::calcPoints(
        std::vector<double>::iterator x_start, std::vector<double>::iterator x_end,
        std::vector<double>::iterator y_start,
        std::function<std::pair<QVector<double>, QVector<double>>(double, double)> f)
{
    std::list<std::pair<QVector<double>, QVector<double> > > list;
    for(; x_start != x_end; ++x_start)
    {
        list.push_back(f(*x_start, *y_start));
        ++y_start;
    }
    return list;
}
