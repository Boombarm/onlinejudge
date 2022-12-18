/*
Author : Teerapat Phokhonwong
Problem: 2428 - Capital
Link: https://www.beecrowd.com.br/judge/en/problems/view/2428
Answer: Accepted
Submission: 12/18/22, 4:38:28 PM
Runtime: 0.000s
*/
#include <iostream>
using namespace std;

float a, b, c, d;
int main()
{
    cin >> a >> b >> c >> d;
    if (a / b == c / d || a / b == d / c || a / c == b / d || a / c == d / b || a / d == b / c || a / d == c / b){
        cout << "S" << endl;
    }
    else{
        cout << "N" << endl;
    }
    return 0;
}