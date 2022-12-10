#include <stdio.h>
#include <math.h>

const double pi = 3.14159;
double r;

int main(void) {
    scanf("%lf", &r);
    double answer = pi * pow(r, 2);
    printf("A=%.4f\n", answer);
    return 0;
}
