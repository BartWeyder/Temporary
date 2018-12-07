#include "startpoints.h"
#include <iostream>

StartPoints::StartPoints(QObject *parent, size_t count)
    : QAbstractTableModel(parent)
{
    count_ = count;
    data_ = std::make_pair(std::vector<double>(count), std::vector<double>(count));
}

QVariant StartPoints::headerData(int section, Qt::Orientation orientation, int /*role*/) const
{
    if(orientation == Qt::Orientation::Horizontal)
    {
        if(section == 0)
            return 'x';
        return 'y';
    }
    return QVariant();
}


int StartPoints::rowCount(const QModelIndex &/*parent*/) const
{
    return count_;
}

int StartPoints::columnCount(const QModelIndex &/*parent*/) const
{
    return 2;
}

QVariant StartPoints::data(const QModelIndex &index, int role) const
{
    if(role == Qt::DisplayRole)
    {
        if(index.column() == 0)
            return data_.first[index.row()];
        return data_.second[index.row()];
    }
    return QVariant();
}

bool StartPoints::setData(const QModelIndex &index, const QVariant &value, int role)
{
    bool * ok = new bool();
    double convertedValue = value.toDouble(ok);
    if (role == Qt::EditRole && *ok && data(index, role) != convertedValue)
    {
        if(index.column() == 0)
            data_.first[index.row()] = convertedValue;
        else
            data_.second[index.row()] = convertedValue;
        return true;
    }
    std::cout << '\a';
    return false;
}

Qt::ItemFlags StartPoints::flags(const QModelIndex &index) const
{
    return Qt::ItemIsEditable | QAbstractTableModel::flags(index);
}
