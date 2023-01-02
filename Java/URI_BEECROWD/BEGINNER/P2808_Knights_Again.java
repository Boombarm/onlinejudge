package URI.Accepted.BEGINNER.sourcecode;



/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: BEGINNER
 * @Problem: 2808 - Knights Again
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2808
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory:
 * @Submission: 7/2/18, 11:42:24 AM
 * @Runtime: 0.060s
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class P2808_Knights_Again {

    static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static Map<String, Point> positionMap = new HashMap<>();

    static {
        positionMap.put("a1", new Point(1, 1));
        positionMap.put("a2", new Point(1, 2));
        positionMap.put("a3", new Point(1, 3));
        positionMap.put("a4", new Point(1, 4));
        positionMap.put("a5", new Point(1, 5));
        positionMap.put("a6", new Point(1, 6));
        positionMap.put("a7", new Point(1, 7));
        positionMap.put("a8", new Point(1, 8));

        positionMap.put("b1", new Point(2, 1));
        positionMap.put("b2", new Point(2, 2));
        positionMap.put("b3", new Point(2, 3));
        positionMap.put("b4", new Point(2, 4));
        positionMap.put("b5", new Point(2, 5));
        positionMap.put("b6", new Point(2, 6));
        positionMap.put("b7", new Point(2, 7));
        positionMap.put("b8", new Point(2, 8));

        positionMap.put("c1", new Point(3, 1));
        positionMap.put("c2", new Point(3, 2));
        positionMap.put("c3", new Point(3, 3));
        positionMap.put("c4", new Point(3, 4));
        positionMap.put("c5", new Point(3, 5));
        positionMap.put("c6", new Point(3, 6));
        positionMap.put("c7", new Point(3, 7));
        positionMap.put("c8", new Point(3, 8));

        positionMap.put("d1", new Point(4, 1));
        positionMap.put("d2", new Point(4, 2));
        positionMap.put("d3", new Point(4, 3));
        positionMap.put("d4", new Point(4, 4));
        positionMap.put("d5", new Point(4, 5));
        positionMap.put("d6", new Point(4, 6));
        positionMap.put("d7", new Point(4, 7));
        positionMap.put("d8", new Point(4, 8));

        positionMap.put("e1", new Point(5, 1));
        positionMap.put("e2", new Point(5, 2));
        positionMap.put("e3", new Point(5, 3));
        positionMap.put("e4", new Point(5, 4));
        positionMap.put("e5", new Point(5, 5));
        positionMap.put("e6", new Point(5, 6));
        positionMap.put("e7", new Point(5, 7));
        positionMap.put("e8", new Point(5, 8));

        positionMap.put("f1", new Point(6, 1));
        positionMap.put("f2", new Point(6, 2));
        positionMap.put("f3", new Point(6, 3));
        positionMap.put("f4", new Point(6, 4));
        positionMap.put("f5", new Point(6, 5));
        positionMap.put("f6", new Point(6, 6));
        positionMap.put("f7", new Point(6, 7));
        positionMap.put("f8", new Point(6, 8));

        positionMap.put("g1", new Point(7, 1));
        positionMap.put("g2", new Point(7, 2));
        positionMap.put("g3", new Point(7, 3));
        positionMap.put("g4", new Point(7, 4));
        positionMap.put("g5", new Point(7, 5));
        positionMap.put("g6", new Point(7, 6));
        positionMap.put("g7", new Point(7, 7));
        positionMap.put("g8", new Point(7, 8));

        positionMap.put("h1", new Point(8, 1));
        positionMap.put("h2", new Point(8, 2));
        positionMap.put("h3", new Point(8, 3));
        positionMap.put("h4", new Point(8, 4));
        positionMap.put("h5", new Point(8, 5));
        positionMap.put("h6", new Point(8, 6));
        positionMap.put("h7", new Point(8, 7));
        positionMap.put("h8", new Point(8, 8));
    }

    public P2808_Knights_Again() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        Point a = positionMap.get(st[0]);
        Point b = positionMap.get(st[1]);
        System.out.println(knightsMove(a, b) ? "VALIDO" : "INVALIDO");
    }

    static boolean knightsMove(Point a, Point b) {
        if ((a.y + 2) == b.y) {
            //top left
            if ((a.x - 1) == b.x) {
                return true;
            }
            //top right
            if ((a.x + 1) == b.x) {
                return true;
            }
        }

        if ((a.x - 2) == b.x) {

            //left top
            if (((a.y + 1) == b.y)) {
                return true;
            }

            //left bottom
            if ((a.y - 1) == b.y) {
                return true;
            }
        }

        if ((a.y - 2) == b.y) {
            //bottom left
            if ((a.x - 1) == b.x) {
                return true;
            }
            //bottom right
            if ((a.x + 1) == b.x) {
                return true;
            }
        }

        if ((a.x + 2) == b.x) {
            //right top
            if ((a.y + 1) == b.y) {
                return true;
            }
            //right bottom
            if ((a.y - 1) == b.y) {
                return true;
            }
        }

        return false;
    }


}
