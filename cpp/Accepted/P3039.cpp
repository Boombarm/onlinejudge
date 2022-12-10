//
// Created by Teerapat on 21/04/2020.
//
#include <iostream>

using namespace std;

int n, i, mcount, fcount;
char gen;
string name;

int main(void) {
    cin >> n;
    mcount = fcount = 0;
    for (i = 0; i < n; i++) {
        cin >> name >> gen;
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
