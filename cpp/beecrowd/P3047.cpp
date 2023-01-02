
#include <iostream>

using namespace std;

int m, a, b, c;

int main() {
    cin >> m >> a >> b;
    c = m - (a + b);
    int brother = max(max(a, b), c);
    cout << brother << endl;
    return 0;
}
