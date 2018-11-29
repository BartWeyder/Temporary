#ifndef RESULT_H
#define RESULT_H

#include <QAbstractTableModel>

class Result : public QAbstractTableModel
{
    Q_OBJECT

public:
    explicit Result(QObject *parent = nullptr);

    // Basic functionality:
    int rowCount(const QModelIndex &parent = QModelIndex()) const override;
    int columnCount(const QModelIndex &parent = QModelIndex()) const override;

    QVariant data(const QModelIndex &index, int role = Qt::DisplayRole) const override;

    // Add data:
    bool insertRows(int row, int count, const QModelIndex &parent = QModelIndex()) override;
    bool insertColumns(int column, int count, const QModelIndex &parent = QModelIndex()) override;

    // Remove data:
    bool removeRows(int row, int count, const QModelIndex &parent = QModelIndex()) override;
    bool removeColumns(int column, int count, const QModelIndex &parent = QModelIndex()) override;

    void setRows(const int &size);
    void setCols(const int &size);

    std::vector<std::vector<double>> result;
};

#endif // RESULT_H
