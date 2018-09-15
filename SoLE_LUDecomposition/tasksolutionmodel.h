#ifndef TASKSOLUTIONMODEL_H
#define TASKSOLUTIONMODEL_H

#include <QAbstractTableModel>
#include "ludecomposition.h"

class TaskSolutionModel : public QAbstractTableModel
{
    Q_OBJECT

public:
    explicit TaskSolutionModel(QObject *parent = 0);

    // Basic functionality:
    int rowCount(const QModelIndex &parent = QModelIndex()) const override;
    int columnCount(const QModelIndex &parent = QModelIndex()) const override;

    QVariant data(const QModelIndex &index, int role = Qt::DisplayRole) const override;

    arma::vec solution;

private:
};

#endif // TASKSOLUTIONMODEL_H
