#include <stdio.h>

double a, b, c;

int main() {
    scanf("%lf %lf %lf", &a, &b, &c);
    double w1 = 2, w2 = 3, w3 = 5;
    double answer = ((a * w1) + (b * w2) + (c * w3)) / (w1 + w2 + w3);
    printf("MEDIA = %.1f\n", answer);
    return 0;
}

