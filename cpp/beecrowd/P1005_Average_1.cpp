#include <iostream>
#include <iomanip>

using namespace std;

double a, b;
double w1 = 3.5;
double w2 = 7.5;

int main() {
    cin >> a >> b;
    double answer = ((a * w1) + (b * w2)) / (w1 + w2);
    cout << fixed << setprecision(5) << "MEDIA = " << answer << endl;
    return 0;
}
