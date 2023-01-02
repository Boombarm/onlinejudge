/*
author: Teerapat Phokhonwong
Online Judge: URI ONLINE JUDGE
Categories: GRAPH
Problem: 2959 - StopAll
Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2959
Time limit:
Status: Accepted
Submission: 9/16/19, 12:24:20 PM
Runtime: 0.480s
Solution: Connection Check
Note:  
 */
package URI.Accepted.GRAPH.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.LinkedList;

public class P2959_StopAll {

    static class Node {
        int id;
        LinkedList<Node> connection;

        public Node(int id) {
            this.connection = new LinkedList<>();
            this.id = id;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] in = br.readLine().split(" ");
        int N = Integer.parseInt(in[0]);
        int M = Integer.parseInt(in[1]);
        int P = Integer.parseInt(in[2]);
        int[][] table = new int[N + 1][N + 1];
        Node[] node = new Node[N + 1];
        for (int i = 1; i <= N; i++) node[i] = new Node(i);
        for (int i = 0; i < M; i++) {
            in = br.readLine().split(" ");
            int A = Integer.parseInt(in[0]);
            int B = Integer.parseInt(in[1]);
            node[A].connection.add(node[B]);
            node[B].connection.add(node[A]);
            table[A][B] = 1;
            table[B][A] = 1;
        }

        for (int i = 1; i <= N; i++) {
            int[] memo = new int[N + 1];
            LinkedList<Node> Q = new LinkedList<>();
            Q.add(node[i]);
            memo[i] = 1;
            while (!Q.isEmpty()) {
                Node x = Q.pollFirst();
                if (x != null) {
                    for (Node con : x.connection) {
                        if (memo[con.id] != 1) {
                            table[i][con.id] = 1;
                            Q.add(con);
                            memo[con.id] = 1;
                        }
                    }
                }

            }
        }

        for (int i = 0; i < P; i++) {
            in = br.readLine().split(" ");
            int A = Integer.parseInt(in[0]);
            int B = Integer.parseInt(in[1]);
            bw.append(table[A][B] == 1 ? "Lets que lets\n" : "Deu ruim\n");
        }
        bw.flush();
    }

}