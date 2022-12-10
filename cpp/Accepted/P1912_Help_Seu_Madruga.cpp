/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: PARADIGMS
 * @Problem: 1912 - Help Seu Madruga
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1912
 * @Timelimit: 4 sec
 * @Language: C++ (g++ 4.8.5, -std=c++11 -O2 -lm) [+0s]
 * @Status: Accepted
 * @Submission: 3/25/18, 4:24:58 PM
 * @Runtime: 0.320s
 * @Solution:
 * @Note:
 */

#include <iostream>
#include <iomanip>
#include <algorithm>
#include <math.h>

#define EPS 1e-4
using namespace std;

double bs(int data[], int n, int a) {
    double b = 0;
    double e = (double) data[n - 1];
    double h;

    while (b <= e) {
        h = (b + e) / 2.0;
        double c = 0.0;
        for (int i = n - 1; i >= 0; --i) {
            if (h >= data[i]) break;
            c += (double) data[i] - h;
        }

        if (fabs(c - (double) a) < EPS) return h;

        if (c < a) e = h;
        else b = h;

    }
    return -1;
}

int main() {
    char buf[100];
    cout << setprecision(4) << fixed;
    int a, n;
    int data[100006];
    while ((cin >> n >> a)) {
        if (!n && !a)
            return 0;

        int sum = 0;
        for (int i = 0; i < n; ++i) {
            cin >> data[i];
            sum += data[i];
        }

        if (sum < a) {
            cout << "-.-" << endl;
            continue;
        }
        if (sum == a) {
            cout << ":D" << endl;
            continue;
        }

        sort(data, data + n);
        cout << bs(data, n, a) << endl;
    }
}
