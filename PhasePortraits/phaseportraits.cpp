#include "phaseportraits.h"


std::pair<std::vector<double>, std::vector<double> > PhasePortraits::getPhaseCurveConst(
        double x_, double y_/*, double alphaX, double alphaY*/)
{
    double alphaX = 0.001, alphaY = 0.001;
    std::vector<double> x(1), y(1);
    x.reserve(N);
    y.reserve(N);
    x[0] = x_;
    y[0] = y_;
    for (size_t i = 1; i < N; ++i)
    {
        double Vx = P(x[i - 1], y[i - 1]), Vy = Q(x[i - 1], y[i - 1]);

        x.push_back(x[i - 1] + alphaX * Vx_norm(Vx, Vy));
        y.push_back(y[i - 1] + alphaY * Vy_norm(Vx, Vy));

//        if(x[i] <= -bound || y[i] <= -bound || x[i] >= bound || y[i] >= bound)
//            break;
    }
    return std::make_pair(x, y);
}
