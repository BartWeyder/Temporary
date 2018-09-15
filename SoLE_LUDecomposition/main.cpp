#include "mainwindow.h"
#include <QApplication>
#include "ludecomposition.h"
#include <iostream>

int main(int argc, char *argv[])
{
    // for example we'll take matrix

    QApplication a(argc, argv);
    MainWindow w;
    w.show();

//    arma::mat input_matrix(3, 3);
//    input_matrix << -3 << 1 << 3 << arma::endr << 0 << -3 << -1 << arma::endr << 3 << 1 << -3;
//    arma::vec b(3);
//    b << 1 << -4 << 1;
//    LUDecomposition dec(input_matrix, b);
//    std::cout << "test" << std::endl;
//    (dec.x()).print("answer:");

    return a.exec();
}
