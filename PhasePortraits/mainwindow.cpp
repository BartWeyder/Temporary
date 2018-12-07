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

    // pick function
    std::function<std::pair<std::vector<double>, std::vector<double>>(double, double)> f_;

    switch(ui->comboBox->currentIndex())
    {
    case 0:
        f_ = pp::getPhaseCurveConst;
        break;
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
                std::vector<double>(start_x, end_x), std::vector<double>(start_y, end_y),
                f_));
            start_x += part_size;
            end_x += part_size;
            start_y += part_size;
            end_y += part_size;
        }

    // give work for final thread
    v.push_back(std::async(std::launch::async, calcPoints,
        std::vector<double>(start_x, startPoints.first.end()), std::vector<double>(start_y, startPoints.second.end()),
        f_));

    // container to store curves objects, shared_ptr used for auto delete
    std::list<std::shared_ptr<QCPCurve>> curves;

    QVector<double> t(pp::N);
    for(size_t i = 0; i < pp::N; ++i)
        t[i] = i;
    for (auto &i : v)
    {
        auto points = i.get();
        for (auto &point_set : points)
        {
            QCPCurve *curve = new QCPCurve(ui->widget->xAxis, ui->widget->yAxis);
            curves.emplace_back(curve);
            curve->setData(t, QVector<double>::fromStdVector(point_set.first),
                                       QVector<double>::fromStdVector(point_set.second));
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
