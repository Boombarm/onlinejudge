/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: DATASTRUCTURE AND LIBRALIES
 * @Problem: 2916 - The  Note
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2916
 * @Timelimit:
 * @Language: C++ (g++ 4.8.5, -std=c++11 -O2 -lm) [+0s]
 * @Status: Accepted
 * @Submission: 2/13/19, 10:30:28 PM
 * @Runtime: 0.624s
 * @Solution:
 * @Note:
 */

#include <iostream>
#include <algorithm>

using namespace std;
int n, k;
int number[1001000];
long long int mod = 1000000007;

int main() {
    while (cin >> n >> k) {
        for (int i = 0; i < n; i++) {
            cin >> number[i];
        }

        sort(number,number + n, greater<int>());
        long long int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += number[i];
        }
        cout << sum % mod << endl;
    }
    return 0;
}




