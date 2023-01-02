#include <stdio.h>

int n, answer;

int main(void) {
    scanf("%d", &n);
    answer = (n + 1) * (n + 2) / 2;
    printf("%d\n", answer);
    return 0;
}

