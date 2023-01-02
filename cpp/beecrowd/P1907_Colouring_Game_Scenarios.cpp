/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: GRAPH
 * @Problem: 1907 - Colouring Game Scenarios
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1907
 * @Timelimit: 1 sec
 * @Language: C++ (g++ 4.8.5, -std=c++11 -O2 -lm) [+0s]
 * @Status: Accepted
 * @Submission: 1/30/19, 2:52:07 PM
 * @Runtime: 0.116s
 * @Solution: BFS
 * @Note:
 */


#include <iostream>

using namespace std;
int R, C;
char paper[1025][1025];
int v[1025][1025];


bool hasPoint(int r, int c);
void BFS(int r , int c);


void BFS(int r , int c){
    //top
    if (r > 0 && hasPoint(r - 1, c)) {
        v[r - 1][c] = 1;
        BFS(r - 1, c);
    }

    //left
    if (c > 0 && hasPoint(r, c - 1)) {
        v[r][c - 1] = 1;
        BFS(r, c - 1);
    }

    //right
    if (c < C - 1 && hasPoint(r, c + 1)) {
        v[r][c + 1] = 1;
        BFS(r, c + 1);
    }

    //bottom
    if (r < R - 1 && hasPoint(r + 1, c)) {
        v[r + 1][c] = 1;
        BFS(r + 1, c);
    }
}

bool hasPoint(int r, int c) {
    return paper[r][c] == '.' && v[r][c] == 0;
}


int main() {
    cin >> R >> C;
    for(int i = 0; i < R;i++){
        for(int j = 0; j < C; j++){
            cin >> paper[i][j];
            v[i][j] = 0;
        }
    }

    int totalClick = 0;
    for (int i = 0; i < R; i++) {
        for (int j = 0; j < C; j++) {
            if (paper[i][j] == '.' && v[i][j] == 0) {
                v[i][j] = 1;
                BFS(i, j);
                totalClick++;
            }
        }
    }
    cout << totalClick << endl;
    return 0;
}

