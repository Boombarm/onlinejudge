package URI.Accepted.GRAPH.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: GRAPH
 * @Problem: 1076 - Design Labirints
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1076
 * @Level: 2
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 1/3/19, 12:30:03 PM
 * @Runtime: 0.156s
 * @Solution: DFS, Backtracking
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class P1076_Design_Labirints {

    static int V, A, S;

    static private class Node {
        int id;
        LinkedList<Node> link;
        char color;

        public Node(int id) {
            this.id = id;
            this.link = new LinkedList<>();
            this.color = 'W';
        }

        void addLink(Node node) {
            this.link.add(node);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        String[] in;
        for (int i = 0; i < t; i++) {
            S = Integer.parseInt(br.readLine());
            in = br.readLine().split(" ");
            V = Integer.parseInt(in[0]);
            A = Integer.parseInt(in[1]);
            Node[] node = new Node[V];
            for (int j = 0; j < V; j++) {
                node[j] = new Node(j);
            }

            for (int j = 0; j < A; j++) {
                in = br.readLine().split(" ");
                int s = Integer.parseInt(in[0]);
                int d = Integer.parseInt(in[1]);
                node[s].addLink(node[d]);
                node[d].addLink(node[s]);
            }

            bw.append(DFS(node[S]) + "\n");
        }
        bw.flush();
    }

    static int DFS(Node node) {
        int move = 0;
        node.color = 'G';
        for (Node child : node.link) {
            if (child.color == 'W') {
                move++;
                move += DFS(child);
                move++;
            }
        }
        node.color = 'B';
        return move;
    }


}
