//
// Created by Teerapat on 21/04/2020.
//
#include <iostream>

using namespace std;

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

int main() {
    while (1) {
        c = getchar();
        if (c == EOF) { break; }
        printf("%c", decrypt(c));
    }
    printf("\n");
    return 0;
}