#ifndef ADDCURVEDIALOG_H
#define ADDCURVEDIALOG_H

#include <QDialog>
#include "startpoints.h"

namespace Ui {
class AddCurveDialog;
}

class AddCurveDialog : public QDialog
{
    Q_OBJECT

public:
    explicit AddCurveDialog(QWidget *parent = nullptr, size_t costs = 10);
    ~AddCurveDialog();

    std::pair<std::vector<double>, std::vector<double>> getValues();

private:
    Ui::AddCurveDialog *ui;
    StartPoints *sp;
};

#endif // ADDCURVEDIALOG_H
