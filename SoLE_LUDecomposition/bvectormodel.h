#ifndef BVECTORMODEL_H
#define BVECTORMODEL_H

#include <QAbstractTableModel>
#include <armadillo>

class BVectorModel : public QAbstractTableModel
{
    Q_OBJECT

public:
    explicit BVectorModel(QObject *parent = 0);

    // Basic functionality:
    int rowCount(const QModelIndex &parent = QModelIndex()) const override ;
    int columnCount(const QModelIndex &parent = QModelIndex()) const override;

    QVariant data(const QModelIndex &index, int role = Qt::DisplayRole) const override;

    bool setData(const QModelIndex &index, const QVariant &value,
                 int role = Qt::EditRole) override;

    Qt::ItemFlags flags(const QModelIndex& index) const override;

    // Add data:
    bool insertRows(int row, int count, const QModelIndex &parent = QModelIndex()) override;

    // Remove data:
    bool removeRows(int row, int count, const QModelIndex &parent = QModelIndex()) override;

    bool resizeVec(int size, const QModelIndex &parent = QModelIndex());

    const arma::vec & b();

private:
    arma::vec b_;
    int size_ = 3;

public slots:
    void resize(int size);
};

#endif // BVECTORMODEL_H
