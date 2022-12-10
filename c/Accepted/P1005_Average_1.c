#include <stdio.h>

double a, b;

int main() {
    scanf("%lf %lf", &a, &b);
    double w1 = 3.5;
    double w2 = 7.5;
    printf("MEDIA = %.5f\n", (((a * w1) + (b * w2)) / (w1 + w2)));
    return 0;
}

