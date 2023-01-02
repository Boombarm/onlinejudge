/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: PARADIGMS
 * @Problem: 2720 - Large Presents
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1912
 * @Timelimit: 4 sec
 * @Language: C++ (g++ 4.8.5, -std=c++11 -O2 -lm) [+0s]
 * @Status: Accepted
 * @Submission: 2/11/19, 1:04:42 AM
 * @Runtime: 0.972s
 * @Solution:
 * @Note:
 */

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int t;
int n, k, id, h, w, l;

int main() {
    cin >> t;
    while (t--) {
        cin >> n >> k;
        vector<pair<int, int>> gift;
        for (int i = 0; i < n; i++) {
            cin >> id >> h >> w >> l;
            gift.push_back({-(h * w * l), id});
        }

        vector<int> v;

        sort(gift.begin(), gift.end());

        for (int i = 0; i < k; i++) {
            v.push_back(gift[i].second);
        }

        sort(v.begin(), v.end());

        cout << v[0];
        for (int i = 1; i < k; i++) {
            cout << ' ' << v[i];
        }
        cout << endl;
    }

    return 0;
}
