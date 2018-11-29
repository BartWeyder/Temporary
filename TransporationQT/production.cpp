#include "production.h"
#include <iostream>

Production::Production(QObject *parent)
    : QAbstractTableModel(parent)
{
//    constexpr size_t ROWS = 4;
//    prod.resize(ROWS);
    prod = { 16,12,14,18 };
}

int Production::rowCount(const QModelIndex &parent) const
{
    return prod.size();
}

int Production::columnCount(const QModelIndex &parent) const
{
    return 1;
}

QVariant Production::data(const QModelIndex &index, int role) const
{
    if(role == Qt::DisplayRole)
        return prod[index.row()];
    return QVariant();
}

bool Production::setData(const QModelIndex &index, const QVariant &value, int role)
{
    bool * ok = new bool();
    double convertedValue = value.toDouble(ok);
    if (role == Qt::EditRole && *ok && data(index, role) != convertedValue)
    {
        prod[index.row()] = convertedValue;
        return true;
    }
    std::cout << '\a';
    return false;
}

Qt::ItemFlags Production::flags(const QModelIndex &index) const
{
    return Qt::ItemIsEditable | QAbstractTableModel::flags(index);
}

bool Production::insertRows(int row, int count, const QModelIndex &parent)
{
    beginInsertRows(parent, row, row + count - 1);
    prod.resize(prod.size() + count);
    endInsertRows();
    return true;
}

bool Production::removeRows(int row, int count, const QModelIndex &parent)
{
    beginRemoveRows(parent, row, row + count - 1);
    prod.resize(prod.size() - count);
    endRemoveRows();
    return true;
}

void Production::setSize(const int &size)
{
    int difference = prod.size() - size;
    if(difference < 0)
        insertRows(rowCount() - 1, abs(difference));
    else
        removeRows(rowCount() - 1 - difference, difference);
}
