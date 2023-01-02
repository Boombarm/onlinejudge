#include <iostream>

using namespace std;

int i, j, n, x, d, john, mary;

int main() {
    cin >> n;
    for (i = 0; i < n; i++) {
        john = mary = 0;

        for (j = 0; j < 3; j++) {
            cin >> x >> d;
            john += (x * d);
        }

        for (j = 0; j < 3; j++) {
            cin >> x >> d;
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