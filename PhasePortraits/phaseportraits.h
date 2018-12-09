#ifndef PHASEPORTRAITS_H
#define PHASEPORTRAITS_H

#include <cmath>
#include <QVector>
#include "qcustomplot.h"

class PhasePortraits
{
public:
    static std::pair<QVector<double>, QVector<double> > getPhaseCurveConst(
            double x_, double y_/*, double alphaX, double alphaY*/
            );
    static std::pair<QVector<double>, QVector<double>> getPhaseCurveNorm(
            double x_, double y_
            );

    static std::pair<QVector<double>, QVector<double> > getPhaseCurveTan(
            double x_, double y_
            );

    static constexpr size_t N = 100000;

private:
    static double P(double x, double y) { return (x + y) * (x + y) - 1; }
    static double Q(double x, double y) { return 1 - x * x - y * y; }
    static double Vx_norm(double Vx, double Vy) { return Vx / std::sqrt(Vx*Vx + Vy*Vy); }
    static double Vy_norm(double Vx, double Vy) { return Vy / std::sqrt(Vx*Vx + Vy*Vy); }
};

#endif // PHASEPORTRAITS_H
