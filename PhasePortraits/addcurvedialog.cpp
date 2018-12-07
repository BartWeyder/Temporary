#include "addcurvedialog.h"
#include "ui_addcurvedialog.h"

AddCurveDialog::AddCurveDialog(QWidget *parent, size_t costs) :
    QDialog(parent),
    ui(new Ui::AddCurveDialog)
{
    ui->setupUi(this);

    sp = new StartPoints(this, costs);
    ui->tableView->setModel(sp);
    ui->tableView->horizontalHeader()->setSectionResizeMode(QHeaderView::Stretch);

}

AddCurveDialog::~AddCurveDialog()
{
    delete ui;
    delete sp;
}

std::pair<std::vector<double>, std::vector<double> > AddCurveDialog::getValues()
{
    return sp->data_;
}
