#include "costs.h"
#include <iostream>

Costs::Costs(QObject *parent)
    : QAbstractTableModel(parent)
{
    constexpr size_t COLS = 5;
    constexpr size_t ROWS = 4;
    std::vector<double> tmp(COLS);
    for(size_t i = 0; i < ROWS; ++i)
        costs_.push_back(tmp);
}

int Costs::rowCount(const QModelIndex &parent) const
{
    return costs_.size();
}

int Costs::columnCount(const QModelIndex &parent) const
{
    if (rowCount() > 0)
        return costs_.begin()->size();
    return 0;
}

QVariant Costs::data(const QModelIndex &index, int role) const
{
    if(role == Qt::DisplayRole)
        return costs_[index.row()][index.column()];
    return QVariant();
}

bool Costs::setData(const QModelIndex &index, const QVariant &value, int role)
{
    bool * ok = new bool();
    double convertedValue = value.toDouble(ok);
    if (role == Qt::EditRole && *ok && data(index, role) != convertedValue)
    {
        costs_[index.row()][index.column()] = convertedValue;
        return true;
    }
    std::cout << '\a';
    return false;
}

Qt::ItemFlags Costs::flags(const QModelIndex &index) const
{
    return Qt::ItemIsEditable | QAbstractTableModel::flags(index);
}

bool Costs::insertRows(int row, int count, const QModelIndex &parent)
{
    beginInsertRows(parent, row, row + count - 1);
    std::vector<double> tmp(columnCount());
    for(auto i = 0; i < count; ++i)
        costs_.push_back(tmp);
    endInsertRows();
    return true;
}

bool Costs::insertColumns(int column, int count, const QModelIndex &parent)
{
    beginInsertColumns(parent, column, column + count - 1);
    for(auto &i : costs_)
        i.resize(columnCount() + count);
    endInsertColumns();
    return true;
}

bool Costs::removeRows(int row, int count, const QModelIndex &parent)
{
    beginRemoveRows(parent, row, row + count - 1);
    for(auto i = 0; i < count; ++i)
        costs_.pop_back();
    endRemoveRows();
    return true;
}

bool Costs::removeColumns(int column, int count, const QModelIndex &parent)
{
    beginRemoveColumns(parent, column, column + count - 1);
    for(auto &i : costs_)
        i.resize(columnCount() - count);
    endRemoveColumns();
    return true;
}

void Costs::setRows(const int &size)
{
    int difference = rowCount() - size;
    if(difference < 0)
        insertRows(rowCount() - 1, abs(difference));
    else
        removeRows(rowCount() - 1 - difference, difference);
}

void Costs::setCols(const int &size)
{
    int difference = columnCount() - size;
    if(difference < 0)
        insertColumns(columnCount() - 1, abs(difference));
    else
        removeColumns(columnCount() - 1 - difference, difference);

}
