#include <stdio.h>

int i, j, n, x, d, john, mary;

int main(void) {
    scanf("%d", &n);

    for (i = 0; i < n; i++) {
        john = mary = 0;

        for (j = 0; j < 3; j++) {
            scanf("%d %d", &x, &d);
            john += (x * d);
        }

        for (j = 0; j < 3; j++) {
            scanf("%d %d", &x, &d);
            mary += (x * d);
        }

        if (john >= mary) {
            printf("JOAO\n");
        } else {
            printf("MARIA\n");
        }
    }
    return 0;
}


