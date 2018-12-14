#ifndef FRACTALSET_H
#define FRACTALSET_H

#include <complex>
#include <functional>
#include <QVector>
#include <QColor>
#include <vector>
#include <QImage>

class FractalSet
{
public:
    struct FractalParams
    {
        FractalParams(double xMin, double xMax, double yMin, double yMax,
                      int width, int height, short type, int power, short color,
                      std::complex<double> c = std::complex<double>(-0.511, 0.541));
        double xMin, xMax, yMin, yMax;
        int width, height, power;
        std::function<int(std::complex<double>, std::complex<double>, int, double)> f;
        std::complex<double> c;
        std::vector<double> x, y;
        short color;
    };

    static void generate_fractal_set(FractalSet::FractalParams * params, QImage *image);

private:
    static constexpr int iterations = 256;
    static int get_mandelbrot_pixel(std::complex<double> z, std::complex<double> c, int power, double bound = 4);
    static int get_julia_pixel(std::complex<double> z, std::complex<double> c, int power, double bound = 4);
    static void calc_part(int start, int end, QImage *image, FractalSet::FractalParams *params);
};

#endif // FRACTALSET_H
