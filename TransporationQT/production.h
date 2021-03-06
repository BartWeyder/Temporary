#ifndef PRODUCTION_H
#define PRODUCTION_H

#include <QAbstractTableModel>
#include <vector>

class Production : public QAbstractTableModel
{
    Q_OBJECT

public:
    explicit Production(QObject *parent = nullptr);

    // Basic functionality:
    int rowCount(const QModelIndex &parent = QModelIndex()) const override;
    int columnCount(const QModelIndex &parent = QModelIndex()) const override;

    QVariant data(const QModelIndex &index, int role = Qt::DisplayRole) const override;

    // Editable:
    bool setData(const QModelIndex &index, const QVariant &value,
                 int role = Qt::EditRole) override;

    Qt::ItemFlags flags(const QModelIndex& index) const override;

    // Add data:
    bool insertRows(int row, int count, const QModelIndex &parent = QModelIndex()) override;

    // Remove data:
    bool removeRows(int row, int count, const QModelIndex &parent = QModelIndex()) override;

    void setSize(const int & size);

    const std::vector<double>& production() { return prod; }
private:
    std::vector<double> prod;
};

#endif // PRODUCTION_H
