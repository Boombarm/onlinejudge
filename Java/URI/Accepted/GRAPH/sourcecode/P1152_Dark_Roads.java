package URI.Accepted.GRAPH.sourcecode;


/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: GRAPH
 * @Problem: 1270 - Optical Fiber
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1270
 * @Level:
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Language: Java 8 (OpenJDK 1.8.0) [+2s]
 * @Submission: 2/11/19, 10:44:04 PM
 * @Runtime: 1.044s
 * @Solution: หาทางไปทุกเมืองที่สั้นที่สุด และ หาทางที่ยาวที่สุด แล้วมาลบกัน เพื่อหาความต่าง
 * @Note:
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.util.stream.IntStream;

public class P1152_Dark_Roads {

    static int N, M;
    static int[] p;

    static private class Connection {
        int source;
        int destination;
        int cost;

        public Connection(int source, int destination, int cost) {
            this.source = source;
            this.destination = destination;
            this.cost = cost;
        }

    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String in;
        while (!(in = br.readLine()).equals("0 0")) {
            String[] st = in.split(" ");
            N = Integer.parseInt(st[0]);
            M = Integer.parseInt(st[1]);
            Connection[] connection = new Connection[M];
            p = IntStream.range(0, 200001).toArray();
            int sumTotal = 0;
            for (int i = 0; i < M; i++) {
                st = br.readLine().split(" ");
                int s = Integer.parseInt(st[0]);
                int d = Integer.parseInt(st[1]);
                int c = Integer.parseInt(st[2]);
                connection[i] = new Connection(s, d, c);
                sumTotal += c;
            }
            sort(connection, 0, M - 1);

            int sumMST = 0;
            for (Connection conn : connection) {
                int setA = findSet(conn.source);
                int setB = findSet(conn.destination);
                if (setA != setB) {
                    unionset(setA, setB);
                    sumMST += conn.cost;
                }
            }

            bw.append((sumTotal - sumMST) + "\n");
        }
        bw.flush();
    }


    private static void sort(Connection[] connection, int start, int end) {
        quickSort(connection, start, end);
    }


    private static int partition(Connection[] conn, int low, int high) {
        int pivot = conn[high].cost;
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (conn[j].cost <= pivot) {
                i++;

                Connection temp = conn[i];
                conn[i] = conn[j];
                conn[j] = temp;
            }
        }
        Connection temp = conn[i + 1];
        conn[i + 1] = conn[high];
        conn[high] = temp;
        return i + 1;
    }


    private static void quickSort(Connection[] conn, int low, int high) {
        if (low < high) {
            int pi = partition(conn, low, high);
            quickSort(conn, low, pi - 1);
            quickSort(conn, pi + 1, high);
        }
    }

    private static int findSet(int e) {
        if (p[e] == e) return e;
        return findSet(p[e]);
    }

    private static void unionset(int s, int t) {
        p[t] = s;
    }


}
