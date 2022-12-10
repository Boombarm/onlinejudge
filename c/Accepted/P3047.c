#include <stdio.h>

int m, a, b, c;

int max(int a, int b);

int main(void) {
    scanf("%d %d %d", &m, &a, &b);
    c = m - (a + b);
    int brother = max(max(a, b), c);
    printf("%d\n", brother);
    return 0;
}

int max(int a, int b) {
    return a > b ? a : b;
}

