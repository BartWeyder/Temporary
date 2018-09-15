#ifndef InputMatrix_H
#define InputMatrix_H

#include <QAbstractTableModel>
#include <armadillo>

class InputMatrix : public QAbstractTableModel
{
    Q_OBJECT

public:
    explicit InputMatrix(QObject *parent = 0);

    // Header:
    QVariant headerData(int section, Qt::Orientation orientation, int role = Qt::DisplayRole) const override;

    // Basic functionality:
    int rowCount(const QModelIndex &parent = QModelIndex()) const override;
    int columnCount(const QModelIndex &parent = QModelIndex()) const override;

    QVariant data(const QModelIndex &index, int role = Qt::DisplayRole) const override;

    // Editable:
    bool setData(const QModelIndex &index, const QVariant &value,
                 int role = Qt::EditRole) override;

    Qt::ItemFlags flags(const QModelIndex& index) const override;

    const arma::mat & matrix();

private:
    int rows_ = 3, cols_ = 3;
    arma::mat input_matrix_data;
    bool insertColumn(const QModelIndex &parent = QModelIndex());
    bool insertRow(const QModelIndex &parent = QModelIndex());
    bool removeColumn(const QModelIndex &parent = QModelIndex());
    bool removeRow(const QModelIndex &parent = QModelIndex());

public slots:
    void reshapeTable(const int & size);
};

#endif // InputMatrix_H
