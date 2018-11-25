#include "mainwindow.h"
#include "ui_mainwindow.h"

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

    //signals-slots
    connect(ui->colCount, SIGNAL(valueChanged(int)), this, SLOT(setCols(int)));
    connect(ui->rowCount, SIGNAL(valueChanged(int)), this, SLOT(setRows(int)));
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


