#include "inputmatrix.h"

InputMatrix::InputMatrix(QObject *parent)
    : QAbstractTableModel(parent)
{
    input_matrix_data.set_size(rows_, cols_);
    input_matrix_data.zeros();
}

QVariant InputMatrix::headerData(int section, Qt::Orientation orientation, int role) const
{
    if (role == Qt::DisplayRole)
    {
        if (orientation == Qt::Horizontal) {
            return QString("X").append(QString::number(section + 1));
        }
    }
    return QVariant();
}


int InputMatrix::rowCount(const QModelIndex &/*parent*/) const
{
    return rows_;
}

int InputMatrix::columnCount(const QModelIndex &/*parent*/) const
{
    return cols_;
}

QVariant InputMatrix::data(const QModelIndex &index, int role) const
{
    if (role == Qt::DisplayRole)
    {
        return input_matrix_data(index.row(), index.column());
    }
    return QVariant();
}

bool InputMatrix::setData(const QModelIndex &index, const QVariant &value, int role)
{
    bool * ok = new bool();
    double convertedValue = value.toDouble(ok);
    if(role == Qt::EditRole && *ok)
    {
        input_matrix_data(index.row(), index.column()) = convertedValue;
        delete ok;
        return true;
    }
    delete ok;
    std::cout << "\a";
    return false;
}

Qt::ItemFlags InputMatrix::flags(const QModelIndex &index) const
{
    return Qt::ItemIsEditable | QAbstractTableModel::flags(index);
}

const arma::mat &InputMatrix::matrix()
{
    return input_matrix_data;
}

bool InputMatrix::insertColumn(const QModelIndex &parent)
{
    beginInsertColumns(parent, cols_, cols_);
    ++cols_;
    input_matrix_data.resize(rows_, cols_);
    for(int i = 0; i < rows_; ++i)
        input_matrix_data(i, cols_ - 1) = 0;
    endInsertColumns();
    return true;
}

bool InputMatrix::insertRow(const QModelIndex &parent)
{
    beginInsertRows(parent, rows_, rows_);
    ++rows_;
    input_matrix_data.resize(rows_, cols_);
    for(int i = 0; i < cols_; ++i)
        input_matrix_data(rows_ - 1, i) = 0;
    endInsertRows();
    return true;
}

bool InputMatrix::removeColumn(const QModelIndex &parent)
{
    beginRemoveColumns(parent, cols_ - 1, cols_ - 1);
    --cols_;
    input_matrix_data.resize(rows_, cols_);
    endRemoveColumns();
    return true;
}

bool InputMatrix::removeRow(const QModelIndex &parent)
{
    beginRemoveRows(parent, rows_ - 1, rows_ - 1);
    --rows_;
    input_matrix_data.resize(rows_, cols_);
    endRemoveRows();
    return true;
}

void InputMatrix::reshapeTable(const int &size)
{
    int difference = rows_ - size;
    if(difference < 0)
    {
        for(int i = 0; i < abs(difference); ++i)
        {
            insertColumn();
            insertRow();
        }
    }
    else
    {
        for(int i = 0; i < difference; ++i)
        {
            removeColumn();
            removeRow();
        }
    }
}
