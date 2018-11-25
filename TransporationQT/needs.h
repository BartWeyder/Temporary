#ifndef NEEDS_H
#define NEEDS_H

#include <QAbstractTableModel>
#include <vector>

class Needs : public QAbstractTableModel
{
    Q_OBJECT

public:
    explicit Needs(QObject *parent = nullptr);

    // Basic functionality:
    int rowCount(const QModelIndex &parent = QModelIndex()) const override;
    int columnCount(const QModelIndex &parent = QModelIndex()) const override;

    QVariant data(const QModelIndex &index, int role = Qt::DisplayRole) const override;

    // Editable:
    bool setData(const QModelIndex &index, const QVariant &value,
                 int role = Qt::EditRole) override;

    Qt::ItemFlags flags(const QModelIndex& index) const override;

    // Add data:
    bool insertColumns(int row, int count, const QModelIndex &parent = QModelIndex()) override;

    // Remove data:
    bool removeColumns(int row, int count, const QModelIndex &parent = QModelIndex()) override;

    void setSize(const int& size);

    const std::vector<double>& needs() { return needs_; }

private:
    std::vector<double> needs_;
};

#endif // NEEDS_H
