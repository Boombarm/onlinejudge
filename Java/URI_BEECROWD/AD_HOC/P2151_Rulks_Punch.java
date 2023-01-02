package URI.Accepted.AD_HOC.sourcecode;
/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: AD-HOC
 * @Problem: 2151 - Rulk's Punch
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2151
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory:
 * @Submission: 1/2/19, 1:14:03 PM
 * @Runtime: 0.136s
 * @Solution:
 * @Note:
 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class P2151_Rulks_Punch {

    static int N, M;
    static int[][] wall;
    static int[][] wall2;
    static boolean[][] visited;

    private static class Point {
        int x, y;
        int value;

        public Point(int y, int x, int value) {
            this.x = x;
            this.y = y;
            this.value = value;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = sc.nextInt();
        for (int k = 1; k <= t; k++) {
            M = sc.nextInt();
            N = sc.nextInt();
            int Y = sc.nextInt();
            int X = sc.nextInt();
            wall = new int[M + 1][N + 1];
            wall2 = new int[M + 1][N + 1];
            visited = new boolean[M + 1][N + 1];
            for (int y = 1; y <= M; y++) {
                for (int x = 1; x <= N; x++) {
                    int value = sc.nextInt();
                    wall[y][x] = value;
                }
            }

            LinkedList<Point> Q = new LinkedList<>();
            Q.add(new Point(Y, X, 10));
            visited[Y][X] = true;
            while (!Q.isEmpty()) {
                Point p = Q.pollFirst();
                SetValue(p.y, p.x, p.value);
                int nextVar = p.value - 1;

                if (hasTop(p)) {
                    Q.add(new Point(p.y - 1, p.x, nextVar));
                    visited[p.y - 1][p.x] = true;
                }

                if (hasRight(p)) {
                    Q.add(new Point(p.y, p.x + 1, nextVar));
                    visited[p.y][p.x + 1] = true;
                }

                if (hasBottom(p)) {
                    Q.add(new Point(p.y + 1, p.x, nextVar));
                    visited[p.y + 1][p.x] = true;
                }

                if (hasLeft(p)) {
                    Q.add(new Point(p.y, p.x - 1, nextVar));
                    visited[p.y][p.x - 1] = true;
                }

                if (hasTopLeft(p)) {
                    Q.add(new Point(p.y - 1, p.x - 1, nextVar));
                    visited[p.y - 1][p.x - 1] = true;
                }

                if (hasTopRight(p)) {
                    Q.add(new Point(p.y - 1, p.x + 1, nextVar));
                    visited[p.y - 1][p.x + 1] = true;
                }

                if (hasBottomLeft(p)) {
                    Q.add(new Point(p.y + 1, p.x - 1, nextVar));
                    visited[p.y + 1][p.x - 1] = true;
                }

                if (hasBottomRight(p)) {
                    Q.add(new Point(p.y + 1, p.x + 1, nextVar));
                    visited[p.y + 1][p.x + 1] = true;
                }

            }
            merge();

            bw.append("Parede " + k + ":\n");
            for (int y = 1; y <= M; y++) {
                bw.append("" + wall[y][1]);
                for (int x = 2; x <= N; x++) {
                    bw.append(" " + wall[y][x]);
                }
                bw.newLine();
            }

        }
        bw.flush();
    }

    static void SetValue(int y, int x, int value) {
        wall2[y][x] += value;
        if (wall2[y][x] < 1) wall2[y][x] = 1;
    }


    static boolean hasTop(Point p) {
        return p.y > 1 && !visited[p.y - 1][p.x];
    }

    static boolean hasTopLeft(Point p) {
        return p.y > 1 && p.x > 1 && !visited[p.y - 1][p.x - 1];
    }

    static boolean hasTopRight(Point p) {
        return p.y > 1 && p.x < N && !visited[p.y - 1][p.x + 1];
    }

    static boolean hasRight(Point p) {
        return p.x < N && !visited[p.y][p.x + 1];
    }

    static boolean hasLeft(Point p) {
        return p.x > 1 && !visited[p.y][p.x - 1];
    }

    static boolean hasBottom(Point p) {
        return p.y < M && !visited[p.y + 1][p.x];
    }

    static boolean hasBottomRight(Point p) {
        return p.y < M && p.x < N && !visited[p.y + 1][p.x + 1];
    }

    static boolean hasBottomLeft(Point p) {
        return p.y < M && p.x > 1 && !visited[p.y + 1][p.x - 1];
    }

    static void merge() {
        for (int i = 1; i <= M; i++) {
            for (int j = 0; j <= N; j++) {
                wall[i][j] = wall[i][j] + wall2[i][j];
            }
        }
    }


}
