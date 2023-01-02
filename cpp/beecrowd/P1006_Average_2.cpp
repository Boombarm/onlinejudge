#include <iostream>
#include <iomanip>

using namespace std;
double a, b, c;
int w1 = 2, w2 = 3, w3 = 5;

int main() {
    cin >> a >> b >> c;
    double answer = ((a * w1) + (b * w2) + (c * w3)) / (w1 + w2 + w3);
    cout << fixed << setprecision(1) << "MEDIA = " << answer << endl;
    return 0;
}

