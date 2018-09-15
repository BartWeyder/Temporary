#include "bvectormodel.h"

BVectorModel::BVectorModel(QObject *parent)
    : QAbstractTableModel(parent)
{
    b_.set_size(size_);
    b_.zeros();
}

int BVectorModel::rowCount(const QModelIndex &/*parent*/) const
{
    return size_;
}

int BVectorModel::columnCount(const QModelIndex &/*parent*/) const
{
    return 1;
}

QVariant BVectorModel::data(const QModelIndex &index, int role) const
{
    if (role == Qt::DisplayRole)
    {
        return b_(index.row());
    }
    return QVariant();
}

bool BVectorModel::setData(const QModelIndex &index, const QVariant &value, int role)
{
    bool * ok = new bool();
    double convertedValue = value.toDouble(ok);
    if(role == Qt::EditRole && *ok)
    {
        b_(index.row()) = convertedValue;
        delete ok;
        return true;
    }
    delete ok;
    std::cout << "\a";
    return false;
}

Qt::ItemFlags BVectorModel::flags(const QModelIndex &index) const
{
    return Qt::ItemIsEditable | QAbstractTableModel::flags(index);
}

bool BVectorModel::insertRows(int row, int count, const QModelIndex &parent)
{
    beginInsertRows(parent, row, row + count - 1);
    size_ += count;
    b_.resize(size_);
    endInsertRows();
    return true;
}

bool BVectorModel::removeRows(int row, int count, const QModelIndex &parent)
{
    beginRemoveRows(parent, row, row + count - 1);
    size_ -= count;
    b_.resize(size_);
    endRemoveRows();
    return true;
}

bool BVectorModel::resizeVec(int size, const QModelIndex &parent)
{
    int difference = size_ - size;
    if(difference < 0)
        insertRows(size_, abs(difference), parent);
    else
        removeRows(size_ - difference - 1, difference, parent);
    return true;
}

const arma::vec &BVectorModel::b()
{
    return b_;
}

void BVectorModel::resize(int size)
{
    resizeVec(size);
}
