#include "mainwindow.h"
#include "ui_mainwindow.h"
#include "ludecomposition.h"
#include <QMessageBox>

MainWindow::MainWindow(QWidget *parent) :
    QMainWindow(parent),
    ui(new Ui::MainWindow)
{
    ui->setupUi(this);
    input_matrix = new InputMatrix(this);
    bVec = new BVectorModel(this);
    solution = new TaskSolutionModel(this);
    ui->mainMatrix->setModel(input_matrix);
    ui->bVector->setModel(bVec);
    ui->answerVector->setModel(solution);
    connect(ui->dimension, SIGNAL(valueChanged(int)), input_matrix, SLOT(reshapeTable(int)));
    connect(ui->dimension, SIGNAL(valueChanged(int)), bVec, SLOT(resize(int)));
    connect(ui->calculateButton, SIGNAL(clicked(bool)), this, SLOT(calculate()));
}

MainWindow::~MainWindow()
{
    delete ui;
}

void MainWindow::calculate()
{
    LUDecomposition * decomposition;
    try
    {
        decomposition = new LUDecomposition(input_matrix->matrix(), bVec->b());
    }
    catch(std::logic_error er)
    {
        QMessageBox msgBox;
        msgBox.setText(er.what());
        msgBox.exec();
        return;
    }

    // ----------------------  in purpose of debug: ----------------------------//
    decomposition->lower().print("Lower:");
    decomposition->upper().print("Upper:");
    (decomposition->lower() * decomposition->upper()).print("Lower * Upper:");
    // ------------------------------------------------------------------------ //

    solution->solution = decomposition->x();
    emit solution->layoutChanged();
    delete decomposition;
}
