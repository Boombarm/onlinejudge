#include <stdio.h>

int a, b, c, d;

int main() {
    scanf("%d %d %d %d", &a, &b, &c, &d);
    int answer = (a * b) - (c * d);
    printf("DIFERENCA = %d\n", answer);
    return 0;
}

