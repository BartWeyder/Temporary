#pragma once
#include <armadillo>

#ifndef LUDECOMPOSITION_H
#define LUDECOMPOSITION_H

class LUDecomposition
{
public:
    LUDecomposition(const arma::mat & A, const arma::vec &b, bool localMethod = true);
    const arma::mat &lower();
    const arma::mat & upper();
    const arma::vec & y();
    const arma::vec & x();
    static bool lu(arma::mat & L, arma::mat & U, const arma::mat &A);
private:
    arma::mat L, U;
    arma::vec y_, x_;
};

#endif // LUDECOMPOSITION_H
