#include <iostream>

using namespace std;
int n, h, d, g;

int main() {
    cin >> n;
    while (n-- > 0) {
        cin >> h >> d >> g;
        if(h >= 200 && h <= 300 && d >= 50 && g >= 150){
            cout << "Sim" << endl;
        }
        else{
            cout << "Nao" << endl;
        }
    }
    return 0;
}

