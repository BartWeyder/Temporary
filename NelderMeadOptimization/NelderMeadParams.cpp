#include "pch.h"
#include "NelderMeadParams.h"

NelderMeadParams::NelderMeadParams(const double alpha, const double beta, const double gamma,
                                   const std::array<size_t, 6> kod, const std::array<double, 6> est)
	: alpha(alpha), beta(beta), gamma(gamma), kod(kod), est(est)
{
	if (alpha < 0) this->alpha = 1;
	if (beta < 0) this->beta = 0.5;
	if (gamma < 0) this->gamma = 2;
}
