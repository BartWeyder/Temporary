#include "mainwindow.h"
#include "ui_mainwindow.h"
#include "fractalset.h"

MainWindow::MainWindow(QWidget *parent) :
    QMainWindow(parent),
    ui(new Ui::MainWindow)
{
    ui->setupUi(this);
}

MainWindow::~MainWindow()
{
    delete ui;
    //if (pixmap) delete pixmap;
}

void MainWindow::on_pushButton_clicked()
{
    auto params = new FractalSet::FractalParams(
                ui->xMin->value(),
                ui->xMax->value(),
                ui->yMin->value(),
                ui->yMax->value(),
                ui->width->value(),
                ui->height->value(),
                ui->comboBox->currentIndex(),
                ui->power->value(),
                ui->colorComboBox->currentIndex()
                );

    auto image = new QImage(params->width, params->height, QImage::Format::Format_RGB32);
    FractalSet::generate_fractal_set(params, image);

    ui->imageLabel->resize(params->width, params->height);

    ui->imageLabel->setPixmap(QPixmap::fromImage(*image));
    delete params;
    delete image;
}
