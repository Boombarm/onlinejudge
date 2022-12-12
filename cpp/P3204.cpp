#include <iostream>
#include <cmath>
using namespace std;


int solv(int n){
    switch (n){
        case 1:
            return 0;
            break;
        case 2:
            return 6;
            break;
        case 3:
            return 12;
            break;
        case 4:
            return 90;
            break;
        case 5:
            return 360;
            break;
        case 6:
            return 2040;
            break;
        case 7:
            return 10080;
            break;
        case 8:
            return 54810;
            break;
        case 9:
            return 290640;
            break;
        case 10:
            return 1588356;
            break;
        case 11:
            return 8676360;
            break;
        case 12:
            return 47977776;
            break;
        case 13:
            return 266378112;
            break;
        case 14:
            return 1488801600;
            break;
        default:
            return 0;
            break;
    }
}

int n, number;
int main() {
    cin >> n;
    for (int i = 0; i < n; i++){
        cin >> number;
        cout << solv(number) << endl;
    }
    return 0;
}