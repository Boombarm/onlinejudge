#include <stdio.h>

int n, i, mcount, fcount;
char gen;
char string[100];

int main(void) {
    scanf("%d", &n);
    mcount = fcount = 0;
    for (i = 0; i < n; i++) {
        scanf("%s%*c%c", string, &gen);
        if (gen == 'M') {
            mcount++;
        } else {
            fcount++;
        }
    }
    printf("%d carrinhos\n", mcount);
    printf("%d bonecas\n", fcount);
    return 0;
}