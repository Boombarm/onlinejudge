#include <stdio.h>

int n, h, d, g;

int main() {
    scanf("%d", &n);
    while (n-- > 0){
        scanf("%d %d %d", &h, &d, &g);
        if( h >= 200 && h <= 300 && d >= 50 && g >= 150){
            printf("Sim\n");
        }else{
            printf("Nao\n");
        }
    }
    return 0;
}

