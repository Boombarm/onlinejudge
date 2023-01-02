#include <iostream>

using namespace std;

int i, n, command;
char coin;

int main() {
    cin >> n >> coin;
    for (i = 0; i < n; i++) {
        cin >> command;
        if (command == 1) {
            if (coin == 'A') {
                coin = 'B';
            } else if (coin == 'B') {
                coin = 'A';
            }
        } else if (command == 2) {
            if (coin == 'B') {
                coin = 'C';
            } else if (coin == 'C') {
                coin = 'B';
            }
        } else if (command == 3) {
            if (coin == 'A') {
                coin = 'C';
            } else if (coin == 'C') {
                coin = 'A';
            }
        }
    }

    cout << coin << endl;
    return 0;
}
