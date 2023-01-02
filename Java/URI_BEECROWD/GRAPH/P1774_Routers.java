package URI.Accepted.GRAPH.sourcecode.MST;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: GRAPH
 * @Problem: 1774 - Routers
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1774
 * @Level: 2
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 2/7/19, 11:48:12 PM
 * @Runtime: 0.048s
 * @Solution: MST Kruskal + sort by quick sort
 * @Note:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1774_Routers {

    static int R, C;
    static Connection[] connection;
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
        String[] st = br.readLine().split(" ");
        R = Integer.parseInt(st[0]);
        C = Integer.parseInt(st[1]);
        connection = new Connection[C];
        p = new int[R + 1];
        for (int i = 1; i < R; i++) {
            p[i] = i;
        }

        for (int i = 0; i < C; i++) {
            st = br.readLine().split(" ");
            int s = Integer.parseInt(st[0]);
            int d = Integer.parseInt(st[1]);
            int cost = Integer.parseInt(st[2]);
            connection[i] = new Connection(s, d, cost);
        }
        sort(connection, 0, C - 1);

        int sum = 0;
        for (Connection con : connection) {
            int setA = findSet(con.source);
            int setB = findSet(con.destination);
            if (setA != setB) {
                unionset(setA, setB);
                sum += con.cost;
            }
        }

        System.out.println(sum);
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
