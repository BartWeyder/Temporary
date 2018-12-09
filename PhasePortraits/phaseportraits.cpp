#include "phaseportraits.h"


std::pair<QVector<double>, QVector<double> > PhasePortraits::getPhaseCurveConst(
        double x_, double y_/*, double alphaX, double alphaY*/)
{
    double alphaX = 0.001, alphaY = 0.001;
    QVector<double> x(1), y(1);
    x.reserve(N);
    y.reserve(N);
    x[0] = x_;
    y[0] = y_;
    for (size_t i = 1; i < N; ++i)
    {
        double Vx = P(x[i - 1], y[i - 1]), Vy = Q(x[i - 1], y[i - 1]);

        x.push_back(x[i - 1] + alphaX * Vx_norm(Vx, Vy));
        y.push_back(y[i - 1] + alphaY * Vy_norm(Vx, Vy));

    }
    return std::make_pair(x, y);
}

std::pair<QVector<double>, QVector<double> > PhasePortraits::getPhaseCurveNorm(double x_, double y_)
{
    // start alpha value
    double alpha = 0.001;
    size_t i = 1;
    // getting first three points and than start loop
    QVector<double> x(1), y(1);
    x.reserve(N);
    y.reserve(N);
    x[0] = x_;
    y[0] = y_;
    double Vx, Vy;
    for(; i < 3; ++i)
    {
        Vx = P(x[i - 1], y[i - 1]);
        Vy = Q(x[i - 1], y[i - 1]);
        x.push_back(x[i - 1] + alpha * Vx_norm(Vx, Vy));
        y.push_back(y[i - 1] + alpha * Vy_norm(Vx, Vy));

    }
    for(; i < N; ++i)
    {
        Vx = P(x[i - 1], y[i - 1]);
        Vy = Q(x[i - 1], y[i - 1]);
        alpha += std::sqrt(std::pow(x[i - 1] - x[i - 2], 2) + std::pow(y[i - 1] - y[i - 2], 2)) -
                std::sqrt(std::pow(x[i - 2] - x[i - 3], 2) + std::pow(y[i - 2] - y[i - 3], 2));
        x.push_back(x[i - 1] + alpha * Vx_norm(Vx, Vy));
        y.push_back(y[i - 1] + alpha * Vy_norm(Vx, Vy));
    }
    return std::make_pair(x, y);
}

std::pair<QVector<double>, QVector<double> > PhasePortraits::getPhaseCurveTan(double x_, double y_)
{
    // start alpha value
    double alpha = 0.001;
    size_t i = 1;
    // getting first three points and than start loop
    QVector<double> x(1), y(1);
    x[0] = x_;
    y[0] = y_;
    x.reserve(N);
    y.reserve(N);
    double Vx, Vy;
    for(; i < 3; ++i)
    {
        Vx = P(x[i - 1], y[i - 1]);
        Vy = Q(x[i - 1], y[i - 1]);
        x.push_back(x[i - 1] + alpha * Vx_norm(Vx, Vy));
        y.push_back(y[i - 1] + alpha * Vy_norm(Vx, Vy));

    }

    for(; i < N; ++i)
    {
        Vx = P(x[i - 1], y[i - 1]);
        Vy = Q(x[i - 1], y[i - 1]);
        alpha += std::tan(std::sqrt(std::pow(x[i - 1] - x[i - 2], 2) + std::pow(y[i - 1] - y[i - 2], 2)) -
                std::sqrt(std::pow(x[i - 2] - x[i - 3], 2) + std::pow(y[i - 2] - y[i - 3], 2)));
        x.push_back(x[i - 1] + alpha * Vx_norm(Vx, Vy));
        y.push_back(y[i - 1] + alpha * Vy_norm(Vx, Vy));
    }
    return std::make_pair(x, y);
}
