#include "tasksolutionmodel.h"

TaskSolutionModel::TaskSolutionModel(QObject *parent)
    : QAbstractTableModel(parent)
{
    solution.set_size(5);
    solution.zeros();
}

int TaskSolutionModel::rowCount(const QModelIndex &/*parent*/) const
{
    return solution.n_elem;
}

int TaskSolutionModel::columnCount(const QModelIndex &/*parent*/) const
{
    return 1;
}

QVariant TaskSolutionModel::data(const QModelIndex &index, int role) const
{
    if (role == Qt::DisplayRole)
    {
        return solution(index.row());
    }
    return QVariant();
}
