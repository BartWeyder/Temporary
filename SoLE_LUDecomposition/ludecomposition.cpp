#include "ludecomposition.h"
#include <armadillo>

LUDecomposition::LUDecomposition(const arma::mat &A, const arma::vec &b, bool localMethod)
{
    // check if it's square
    if(A.n_rows != A.n_cols)
        throw std::logic_error("Only square matrix allowed");

    bool isFine = localMethod ? lu(L, U, A) : arma::lu(L, U, A);

    if(isFine)
    {
        x_.set_size(arma::size(b));
        y_.set_size(arma::size(b));
        //solving Ly = b
        double sum = 0;
        for(size_t i = 0; i < L.n_cols; ++i)
        {
            // in this case we can't use LU-decomposition due to obvious reasons
            if(L(i,i) == 0)
                throw std::logic_error("LU-decomposition failed (divide by 0). Try another method");
            sum = b(i);
            for(size_t j = 0; j < i; ++j)
            {
                sum -= L(i, j) * y_[j];
            }
            y_(i) = sum / L(i, i);
        }
        //solving Ux = y
        for(int i = U.n_cols - 1; i >= 0; --i)
        {
            if(U(i, i) == 0)
                throw std::logic_error("LU-decomposition failed (divide by 0). Try another method");
            sum = y_[i];
            for(int j = i + 1; j < U.n_cols; ++j)
            {
                sum -= U(i, j) * x_[j];
            }
            x_(i) = sum / U(i, i);
        }
    }
    else if(localMethod)
        throw std::logic_error("LU-decomposition failed: \n Diagonal element == 0, try another method.");
    else
        throw std::logic_error("LU-decomposition failed. Try another method");
}

const arma::mat &LUDecomposition::lower()
{
    return L;
}

const arma::mat &LUDecomposition::upper()
{
    return U;
}

const arma::vec &LUDecomposition::y()
{
    return y_;
}

const arma::vec &LUDecomposition::x()
{
    return x_;
}

bool LUDecomposition::lu(arma::mat &L, arma::mat &U, const arma::mat &A)
{
    // prep
    L.set_size(arma::size(A));
    L.zeros();
    U.set_size(arma::size(A));
    U.zeros();
    // calc
    if ((L(0, 0) = A(0, 0)) == 0)
        return false;
    for (size_t i = 0; i < A.n_cols; i++)
    {
        U(0, i) = A(0, i) / L(0, 0);
        U(i, i) = 1;
    }

    for (size_t i = 1; i < A.n_rows; i++)
    {
        if (!A(i, i))
            return false;
        L(i, 0) = A(i, 0);
        for (size_t j = 1; j <= i; j++)
        {
            L(i, j) = A(i, j);
            for (size_t k = 0; k < j; k++)
                L(i, j) -= L(i, k) * U(k, j);
        }
        for (size_t j = i + 1; j < A.n_cols; j++)
        {
            U(i, j) = A(i, j);
            for (size_t k = 0; k < i; k++)
                U(i, j) -= L(i, k) * U(k, j);
            U(i, j) /= L(i, i);
        }
    }

    return true;
}
