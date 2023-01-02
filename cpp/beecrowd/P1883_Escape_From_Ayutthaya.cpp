/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: AD-HOC
 * @Problem: 1883 - Zoeiro Keyboard
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1883
 * @Timelimit: 1 sec
 * @LANGUAGE: C++17
 * @Status: Accepted
 * @Submission: 3/21/18, 2:13:14 AM
 * @Runtime: 0.412s
 * @Solution: BFS
 * @Note:
 */

#include <iostream>
#include <queue>

using namespace std;

const int MX = 1005;
const int BURNED = -1;
const int VISITED = 1;
const char WALL = '#';

char board[MX][MX];
int fire[MX][MX], n, m;
bool visit[MX][MX];

struct point {
    int x, y, t;

    point() {}

    point(int tx, int ty) : x(tx), y(ty) {}

    point(int tx, int ty, int tt) : x(tx), y(ty), t(tt) {}

};

int mx[] = {1, 0, -1, 0};
int my[] = {0, 1, 0, -1};

void fireSpread(vector<point> &f) {
    queue<point> Q;
    for (int j = 0; j < f.size(); ++j) {
        Q.push(f[j]);
        fire[f[j].x][f[j].y] = 1;
    }

    while (!Q.empty()) {
        point tm = Q.front();
        Q.pop();
        int t = tm.t + 1;
        for (int i = 0; i < 4; i++) {
            int tx = tm.x + mx[i];
            int ty = tm.y + my[i];
            if (tx >= 0 && tx < n
                && ty >= 0 && ty < m
                && board[tx][ty] != WALL
                && fire[tx][ty] == BURNED) {
                fire[tx][ty] = t;
                Q.push(point(tx, ty, t));
            }
        }
    }
}

bool escape(point &s, point &e) {
    queue<point> Q;
    Q.push(s);
    visit[s.x][s.y] = VISITED;
    while (!Q.empty()) {
        point tm = Q.front();
        Q.pop();
        if (tm.x == e.x && tm.y == e.y) {
            return true;
        }
        int t = tm.t + 1;
        for (int i = 0; i < 4; i++) {
            int tx = tm.x + mx[i];
            int ty = tm.y + my[i];
            if (tx >= 0 && tx < n
                && ty >= 0 && ty < m
                && board[tx][ty] != WALL
                && t < fire[tx][ty]
                && visit[tx][ty] == 0) {
                visit[tx][ty] = VISITED;
                Q.push(point(tx, ty, t));
            }
        }
    }
    return false;
}

int main() {
    int t;
    cin >> t;
    while (t--) {
        cin >> n >> m;
        vector<point> vf;
        point st, en;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cin >> board[i][j];
                switch (board[i][j]) {
                    case 'F' :
                        vf.push_back(point(i, j, 1));
                        break;
                    case 'S':
                        st = point(i, j, 1);
                        break;
                    case 'E':
                        en = point(i, j);
                        break;
                }
                fire[i][j] = BURNED;
                visit[i][j] = 0;
            }
        }
        fireSpread(vf);
        cout << (escape(st, en) ? "Y" : "N") << endl;
    }
    return 0;
}
