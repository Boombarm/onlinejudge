package URI.Accepted.GRAPH.sourcecode.MST;


/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: GRAPH
 * @Problem: 1552 - Rescue in Free Fall
 * @Subject: Minimum Spanning Tree
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1552
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 2/26/19, 4:32:46 PM
 * @Runtime: 2.412s
 * @Solution: MST - Kruskal's algorithm
 * @Note: หาระยะห่างของจุดแต่ละจุด และหา minimum length of web
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Comparator;
import java.util.PriorityQueue;

public class P1552_Rescue_in_Free_Fall {

    static int n;
    static Computer[] computer;
    static int[][] v;
    static int[] p;

    private static class Computer {
        int id;
        int positionX, positionY;

        public Computer(int id, int x, int y) {
            this.id = id;
            this.positionX = x;
            this.positionY = y;
        }
    }

    private static class Connection {
        Computer source;
        Computer destination;
        double cost;

        public Connection(Computer source, Computer destination, double cost) {
            this.source = source;
            this.destination = destination;
            this.cost = cost;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        DecimalFormat df = new DecimalFormat("0.00");
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            computer = new Computer[n];
            p = new int[n];
            v = new int[n][n];
            for (int i = 0; i < n; i++) {
                String[] st = br.readLine().split(" ");
                int x = Integer.parseInt(st[0]);
                int y = Integer.parseInt(st[1]);
                computer[i] = new Computer(i, x, y);
            }

            for (int i = 0; i < n; i++) {
                p[i] = i;
            }


            Comparator<Connection> comparator = new Comparator<Connection>() {
                @Override
                public int compare(Connection conn1, Connection conn2) {
                    if (conn1.cost < conn2.cost) {
                        return -1;
                    } else if (conn1.cost > conn2.cost) {
                        return 1;
                    }
                    return 0;
                }
            };
            PriorityQueue<Connection> minHeap = new PriorityQueue<>(comparator);

            //find all wire
            for (int i = 0; i < n; i++) {
                Computer comA = computer[i];
                for (int j = 0; j < n; j++) {
                    if (i != j && v[i][j] == 0) {
                        Computer comB = computer[j];
                        double cost = Math.sqrt(Math.pow(comA.positionX - comB.positionX, 2) + Math.pow(comA.positionY - comB.positionY, 2));//wire distance 2 computer
                        Connection conn = new Connection(comA, comB, cost);
                        minHeap.add(conn);
                        v[i][j] = 1;
                        v[j][i] = 1;
                    }
                }
            }

            double sum = 0.00;
            while (!minHeap.isEmpty()) {
                Connection conn = minHeap.poll();
                int setA = findSet(conn.source.id);
                int setB = findSet(conn.destination.id);
                if (setA != setB) {
                    unionset(setA, setB);
                    sum += conn.cost;
                }
            }
            bw.append(df.format(sum / 100) + "\n");
        }
        bw.flush();
    }

    private static int findSet(int e) {
        if (p[e] == e) return e;
        return findSet(p[e]);
    }

    private static void unionset(int s, int t) {
        p[t] = s;
    }

}
