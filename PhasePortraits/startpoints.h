#ifndef STARTPOINTS_H
#define STARTPOINTS_H

#include <QAbstractTableModel>
#include <vector>

class StartPoints : public QAbstractTableModel
{
    Q_OBJECT

public:
    explicit StartPoints(QObject *parent = nullptr, size_t count = 10);

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

    std::pair<std::vector<double>, std::vector<double>> data_;

private:
    size_t count_;
};

#endif // STARTPOINTS_H
