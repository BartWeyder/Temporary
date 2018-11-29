#include "result.h"
#include <QString>

Result::Result(QObject *parent)
    : QAbstractTableModel(parent)
{
}

int Result::rowCount(const QModelIndex &parent) const
{
    return result.size();
}

int Result::columnCount(const QModelIndex &parent) const
{
    if (rowCount() > 0)
        return result.begin()->size();
    return 0;
}

QVariant Result::data(const QModelIndex &index, int role) const
{
    if(role == Qt::DisplayRole)
    {
        if (result[index.row()][index.column()] < 0.0)
            return QString("-");
        return QString::number(result[index.row()][index.column()]);
    }
    return QVariant();
}

bool Result::insertRows(int row, int count, const QModelIndex &parent)
{
    beginInsertRows(parent, row, row + count - 1);
    std::vector<double> tmp(columnCount());
    for(auto i = 0; i < count; ++i)
        result.push_back(tmp);
    endInsertRows();
    return true;
}

bool Result::insertColumns(int column, int count, const QModelIndex &parent)
{
    beginInsertColumns(parent, column, column + count - 1);
    for(auto &i : result)
        i.resize(columnCount() + count);
    endInsertColumns();
    return true;
}

bool Result::removeRows(int row, int count, const QModelIndex &parent)
{
    beginRemoveRows(parent, row, row + count - 1);
    for(auto i = 0; i < count; ++i)
        result.pop_back();
    endRemoveRows();
    return true;
}

bool Result::removeColumns(int column, int count, const QModelIndex &parent)
{
    beginRemoveColumns(parent, column, column + count - 1);
    for(auto &i : result)
        i.resize(columnCount() - count);
    endRemoveColumns();
    return true;
}

void Result::setRows(const int &size)
{
    int difference = rowCount() - size;
    if(difference < 0)
        insertRows(rowCount() - 1, abs(difference));
    else
        removeRows(rowCount() - 1 - difference, difference);
}

void Result::setCols(const int &size)
{
    int difference = columnCount() - size;
    if(difference < 0)
        insertColumns(columnCount() - 1, abs(difference));
    else
        removeColumns(columnCount() - 1 - difference, difference);
}
