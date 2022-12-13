/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: GRAPH
 * @Problem: 2485 - Bicho da Goiaba    
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2485
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 4/18/17, 5:08:56 PM
 * @Runtime: 0.052s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.GRAPH.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class P2485_Bicho_da_Goiaba {

    static int[][] tree;
    static boolean[][] closed;
    static int n, m;
    static String[] in;
    static LinkedList<Point> queue, nextQueue;

    static class Point {

        int x, y;

        public Point(int y, int x) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

    }

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            in = br.readLine().split(" ");
            n = Integer.parseInt(in[0]);
            m = Integer.parseInt(in[1]);
            tree = new int[n + 1][m + 1];
            closed = new boolean[n + 1][m + 1];
            queue = new LinkedList<Point>();
            nextQueue = new LinkedList<Point>();
            int infected = 0;
            for (int i = 1; i <= n; i++) {
                in = br.readLine().split(" ");
                for (int j = 1; j <= m; j++) {
                    int now = Integer.parseInt(in[j - 1]);
                    if (now == 1) {
                        infected++;

                    } else {
                        closed[i][j] = true;
                    }
                    tree[i][j] = now;
                }
            }
            int days = 0;
            in = br.readLine().split(" ");
            int y = Integer.parseInt(in[0]);
            int x = Integer.parseInt(in[1]);
            nextQueue.add(new Point(y, x));
            closed[y][x] = true;
            loop:
            do {
                queue.addAll(nextQueue);
                nextQueue = new LinkedList<Point>();
                while (!queue.isEmpty()) {
                    Point p = queue.removeFirst();
                    y = p.getY();
                    x = p.getX();
                    infected--;
                    if (infected == 0) {
                        break loop;
                    }
                    if (y > 1) {
                        moveTop(y, x);
                    }
                    if (x < m) {
                        moveRight(y, x);
                    }
                    if (x > 1) {
                        moveleft(y, x);
                    }
                    if (y < n) {
                        moveBottom(y, x);
                    }
                }
                days++;
            } while (!nextQueue.isEmpty());
            bw.append(days + "\n");
        }
        bw.flush();
    }

    static void moveTop(int y, int x) {
        //top left 
        if (x > 1 && !closed[y - 1][x - 1]) {
            nextQueue.add(new Point(y - 1, x - 1));
            closed[y - 1][x - 1] = true;
        }
        //top mid
        if (!closed[y - 1][x]) {
            nextQueue.add(new Point(y - 1, x));
            closed[y - 1][x] = true;
        }
        //top Right
        if (x < m && !closed[y - 1][x + 1]) {
            nextQueue.add(new Point(y - 1, x + 1));
            closed[y - 1][x + 1] = true;
        }
    }

    static void moveleft(int y, int x) {
        if (!closed[y][x - 1]) {
            nextQueue.add(new Point(y, x - 1));
            closed[y][x - 1] = true;
        }
    }

    static void moveRight(int y, int x) {
        if (!closed[y][x + 1]) {
            nextQueue.add(new Point(y, x + 1));
            closed[y][x + 1] = true;
        }
    }

    static void moveBottom(int y, int x) {
        //Bottom left 
        if (x > 1 && !closed[y + 1][x - 1]) {
            nextQueue.add(new Point(y + 1, x - 1));
            closed[y + 1][x - 1] = true;
        }
        //Bottom mid
        if (!closed[y + 1][x]) {
            nextQueue.add(new Point(y + 1, x));
            closed[y + 1][x] = true;
        }
        //Bottom Right
        if (x < m && !closed[y + 1][x + 1]) {
            nextQueue.add(new Point(y + 1, x + 1));
            closed[y + 1][x + 1] = true;
        }
    }

}
