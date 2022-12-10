#include <stdio.h>

int i, n, swap;
char coin;

int main(void) {
    scanf("%d %s", &n, &coin);
    for (i = 0; i < n; i++) {
        scanf("%d", &swap);
        if (swap == 1) {
            if (coin == 'A') {
                coin = 'B';
            } else if (coin == 'B') {
                coin = 'A';
            }
        } else if (swap == 2) {
            if (coin == 'B') {
                coin = 'C';
            } else if (coin == 'C') {
                coin = 'B';
            }
        } else if (swap == 3) {
            if (coin == 'A') {
                coin = 'C';
            } else if (coin == 'C') {
                coin = 'A';
            }
        }
    }

    printf("%c\n", coin);
    return 0;
}

