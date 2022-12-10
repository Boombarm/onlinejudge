#include <iostream>
#include <math.h>
#include <iomanip>

using namespace std;

const double pi = 3.14159;
double r;

int main() {
    cin >> r;
    double answer = pi * pow(r, 2);
    cout << fixed << setprecision(4) << "A=" << answer << endl;
    return 0;
}

