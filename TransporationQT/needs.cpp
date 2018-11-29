#include "needs.h"
#include <iostream>

Needs::Needs(QObject *parent)
    : QAbstractTableModel(parent)
{
//    constexpr size_t COLS = 5;
//    needs_.resize(COLS);
    needs_ = { 7,8,4,11,30 };
}

int Needs::rowCount(const QModelIndex &parent) const
{
    return 1;
}

int Needs::columnCount(const QModelIndex &parent) const
{
    return needs_.size();
}

QVariant Needs::data(const QModelIndex &index, int role) const
{
    if(role == Qt::DisplayRole)
        return needs_[index.column()];
    return QVariant();
}

bool Needs::setData(const QModelIndex &index, const QVariant &value, int role)
{
    bool * ok = new bool();
    double convertedValue = value.toDouble(ok);
    if (role == Qt::EditRole && *ok && data(index, role) != convertedValue)
    {
        needs_[index.column()] = convertedValue;
        return true;
    }
    std::cout << '\a';
    return false;
}

Qt::ItemFlags Needs::flags(const QModelIndex &index) const
{
    return Qt::ItemIsEditable | QAbstractTableModel::flags(index);
}

bool Needs::insertColumns(int column, int count, const QModelIndex &parent)
{
    beginInsertColumns(parent, column, column + count - 1);
    needs_.resize(needs_.size() + count);
    endInsertColumns();
}

bool Needs::removeColumns(int column, int count, const QModelIndex &parent)
{
    beginRemoveColumns(parent, column, column + count - 1);
    needs_.resize(needs_.size() - count);
    endRemoveColumns();
}

void Needs::setSize(const int &size)
{
    int difference = needs_.size() - size;
    if(difference < 0)
        insertColumns(columnCount() - 1, abs(difference));
    else
        removeColumns(columnCount() - 1 - difference, difference);
}
