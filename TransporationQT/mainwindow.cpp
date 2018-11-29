#include "mainwindow.h"
#include "ui_mainwindow.h"
#include "TransportationProblem.h"

MainWindow::MainWindow(QWidget *parent) :
    QMainWindow(parent),
    ui(new Ui::MainWindow)
{
    ui->setupUi(this);
    //costs table
    costs = new Costs(this);
    ui->costsView->setModel(costs);
    ui->costsView->horizontalHeader()->setSectionResizeMode(QHeaderView::Stretch);

    //needs table
    needs = new Needs(this);
    ui->needsView->setModel(needs);
    ui->needsView->horizontalHeader()->setSectionResizeMode(QHeaderView::Stretch);

    //production table
    production = new Production(this);
    ui->productionView->setModel(production);
    ui->productionView->horizontalHeader()->setSectionResizeMode(QHeaderView::Stretch);

    // init Result var
    result = new Result();
    ui->resultView->horizontalHeader()->setSectionResizeMode(QHeaderView::Stretch);

    //signals-slots
    connect(ui->colCount, SIGNAL(valueChanged(int)), this, SLOT(setCols(int)));
    connect(ui->rowCount, SIGNAL(valueChanged(int)), this, SLOT(setRows(int)));
    connect(ui->calculateButton, SIGNAL(clicked(bool)), this, SLOT(calculate()));
}

MainWindow::~MainWindow()
{
    delete ui;
}

void MainWindow::setRows(const int &size)
{
    costs->setRows(size);
    production->setSize(size);
}

void MainWindow::setCols(const int &size)
{
    costs->setCols(size);
    needs->setSize(size);
}

void MainWindow::calculate()
{
    try {
        result->result = TransportationProblem::potentialMethod(costs->costs(),
                                                                production->production(), needs->needs());
        ui->resultView->setModel(result);
        ui->fValue->setText(QString("F = ") +
                            QString::number(TransportationProblem::calcFunctionValue(costs->costs(), result->result)));
    } catch (std::logic_error e) {
        ui->fValue->setText(e.what());
    }

}
