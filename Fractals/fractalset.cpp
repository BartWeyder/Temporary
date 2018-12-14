#include "fractalset.h"
#include <list>
//#include <thread>
#include <future>

#define THREADS 4

FractalSet::FractalParams::FractalParams(double xMin, double xMax, double yMin,
                                         double yMax, int width, int height, short type,
                                         int power, short color, std::complex<double> c)

    : xMin(xMin), xMax(xMax), yMin(yMin), yMax(yMax), width(width),
      height(height), power(power), color(color), c(c)
{
   x.reserve(width);
   y.reserve(height);
   for (auto i = 0; i < width; ++i)
       x.push_back(xMin + (xMax - xMin) * i / width);
   for (auto i = 0; i < height; ++i)
       y.push_back(yMin + (yMax - yMin) * i / height);

   f = (type == 0) ? FractalSet::get_mandelbrot_pixel : FractalSet::get_julia_pixel;
}

void FractalSet::generate_fractal_set(FractalSet::FractalParams *params, QImage *image)
{
    auto part_size = params->height / THREADS;

    std::list<std::thread> thread_list;
    int start = 0;
    int end = start + part_size;

    if(part_size)
        for (auto i = 0; i < THREADS - 1; ++i)
        {
            thread_list.emplace_back(calc_part, start, end, image, params);
            start += part_size;
            end += part_size;
        }
    thread_list.emplace_back(calc_part, start, params->height, image, params);
    for (auto &t : thread_list)
        t.join();

}

int FractalSet::get_mandelbrot_pixel(std::complex<double> z, std::complex<double> c, int power, double bound)
{
    size_t i = 0;

    while (i < FractalSet::iterations && std::abs(z) <= bound)
    {
        z = std::pow(z, power) + c;
        ++i;
    }
    return i - 1;
}

int FractalSet::get_julia_pixel(std::complex<double> z, std::complex<double> c, int power, double bound)
{
    z = std::sinh(z);
    size_t i = 0;
    while (i < FractalSet::iterations && std::abs(z) <= bound)
    {
        z = std::pow(z, power) + c;
        ++i;
    }
    return i - 1;
}

// borrowed method of getting rgb color; I'm ashamed, but that's life
void FractalSet::calc_part(int start, int end, QImage *image, FractalSet::FractalParams *params)
{
    std::function<int(int, int, FractalSet::FractalParams *)> f =
            [](int start, int i, FractalSet::FractalParams *params)
    {
        return qRgb(255 - int(std::pow((double)params->f(
                                     std::complex<double>(params->x[i], params->y[start]), params->c,
                                     params->power, 4)/255, 0.25) * 255), 0, 0);
    };
    if (params->color == 1)
        f = [](int start, int i, FractalSet::FractalParams *params)
        {
            return qRgb(0, 255 - int(std::pow((double)params->f(
                                         std::complex<double>(params->x[i], params->y[start]), params->c,
                                         params->power, 4)/255, 0.25) * 255), 0);
        };
    else if (params->color == 2)
        f = [](int start, int i, FractalSet::FractalParams *params)
        {
            return qRgb(0, 0, 255 - int(std::pow((double)params->f(
                                         std::complex<double>(params->x[i], params->y[start]), params->c,
                                         params->power, 4)/255, 0.25) * 255));
        };
    else if (params->color == 3)
        f = [](int start, int i, FractalSet::FractalParams *params)
        {
            auto chanel = int(std::pow((double)params->f(
                                           std::complex<double>(params->x[i], params->y[start]), params->c,
                                           params->power, 4)/255, 0.25) * 255);
            return qRgb(chanel, chanel, chanel);
        };

    for (; start < end; ++start)
        for (auto i = 0; i < params->width; ++i)
            image->setPixel(i, start, f(start, i, params));
}
