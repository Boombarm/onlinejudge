package URI.Accepted.BEGINNER.sourcecode;
/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: BEGINNER
 * @Problem: 2687- Bacterial Domination
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2687
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/29/18, 12:19:42 PM
 * @Runtime: 0.028s
 * @Solution: Backtracking
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.LinkedList;

class P2687_Bacterial_Domination {

    class Point {
        int i, j;

        public Point(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

    public P2687_Bacterial_Domination() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        DecimalFormat df = new DecimalFormat("0.00");
        LinkedList<Point> move = new LinkedList<>();
        int[][] map;
        boolean[][] visit;
        int Q = Integer.parseInt(br.readLine());
        while (Q > 0) {
            int L = Integer.parseInt(br.readLine());
            map = new int[L][L];
            visit = new boolean[L][L];
            int totalPoint = L * L;
            int securePoint = 0;
            String[] st;
            for (int i = 0; i < L; i++) {
                st = br.readLine().split(" ");
                for (int j = 0; j < L; j++) {
                    map[i][j] = Integer.parseInt(st[j]);
                    if ((i == 0 || i == L - 1) && map[i][j] == 0) {
                        move.add(new Point(i, j));
                        visit[i][j] = true;
                        securePoint++;
                    }
                }
                if (!visit[i][0] && map[i][0] == 0) {
                    move.add(new Point(i, 0));
                    visit[i][0] = true;
                    securePoint++;
                }

                if (!visit[i][L - 1] && map[i][L - 1] == 0) {
                    move.add(new Point(i, L - 1));
                    visit[i][L - 1] = true;
                    securePoint++;
                }
            }


            while (!move.isEmpty()) {
                Point p = move.pollFirst();
                int i = p.i, j = p.j;
                //find Top
                if (i > 0 && !visit[i - 1][j] && map[i - 1][j] != 1) {
                    move.add(new Point(i - 1, j));
                    visit[i - 1][j] = true;
                    securePoint++;
                }
                //find Left
                if (j > 0 && !visit[i][j - 1] && map[i][j - 1] == 0) {
                    move.add(new Point(i, j - 1));
                    visit[i][j - 1] = true;
                    securePoint++;
                }
                //find Right
                if (j < L - 1 && !visit[i][j + 1] && map[i][j + 1] == 0) {
                    move.add(new Point(i, j + 1));
                    visit[i][j + 1] = true;
                    securePoint++;
                }
                //find Bot
                if (i < L - 1 && !visit[i + 1][j] && map[i + 1][j] == 0) {
                    move.add(new Point(i + 1, j));
                    visit[i + 1][j] = true;
                    securePoint++;
                }
            }

            bw.append(df.format((totalPoint - securePoint) / 2.0) + "\n");
            if (--Q == 0) {
                break;
            }
            move.clear();
        }
        bw.flush();
    }


}
