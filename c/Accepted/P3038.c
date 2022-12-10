
#include <stdio.h>

char c;

char decrypt(char c) {
    switch (c) {
        case '@':
            return 'a';
        case '&':
            return 'e';
        case '!':
            return 'i';
        case '*':
            return 'o';
        case '#':
            return 'u';
        default:
            return c;
    }
}

int main(void) {
    while (1) {
        c = getchar();
        if (c == EOF) { break; }
        printf("%c", decrypt(c));
    }
    printf("\n");

    return 0;
}

