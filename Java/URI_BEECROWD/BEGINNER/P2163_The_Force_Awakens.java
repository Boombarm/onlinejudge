/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2163 The Force Awakens
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2163
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 11/9/16, 9:46:06 AM
 * @Runtime: 0.764s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2163_The_Force_Awakens {

    static BufferedReader br;
    static int n, m;

    static class IndexResult {

        int x = 0;
        int y = 0;

        public IndexResult(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        n = Integer.parseInt(st[0]);
        m = Integer.parseInt(st[1]);
        String[][] patternTable = new String[n][m];
        for (int i = 0; i < n; i++) {
            patternTable[i] = br.readLine().split(" ");
        }
        IndexResult result = findPattle(patternTable);
        System.out.println(result.x + " " + result.y);
    }

    static IndexResult findPattle(String patternTable[][]) {
        int x = 0, y = 0;
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < m - 1; j++) {
                if (patternTable[i][j].equals("42")) {
                    if (!patternTable[i - 1][j - 1].equals("7")) {//left top
                        continue;
                    }
                    if (!patternTable[i - 1][j].equals("7")) {//top
                        continue;
                    }
                    if (!patternTable[i - 1][j + 1].equals("7")) {//right top
                        continue;
                    }
                    if (!patternTable[i - 1][j].equals("7")) {//left
                        continue;
                    }
                    if (!patternTable[i][j + 1].equals("7")) {//right
                        continue;
                    }
                    if (!patternTable[i + 1][j - 1].equals("7")) {//left bottom
                        continue;
                    }
                    if (!patternTable[i + 1][j].equals("7")) {//bottom
                        continue;
                    }
                    if (!patternTable[i + 1][j + 1].equals("7")) {//right bottom
                        continue;
                    }
                    x = i + 1;
                    y = j + 1;
                    break;
                }
            }
        }
        return new IndexResult(x, y);
    }
}
