/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: BEGINNER
 * @Problem: 2376 - Copa do Mundo
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2376
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory:
 * @Submission: 11/4/19, 5:47:29 PM
 * @Runtime: 0.116s
 * @Solution:
 * @Note:
 */

package URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2376_Copa_do_Mundo {

    static Node[] node = new Node[15];

    static class Node {
        char lData, rData;
        Node L, R;
        int lValue, rValue;
        int hasNext = 0;

        public Node(Node L, Node R) {
            this.L = L;
            this.R = R;
            this.hasNext = 1;
        }

        public Node(char lData, char rData) {
            this.lData = lData;
            this.rData = rData;
        }

        public void setValue(int lValue, int rValue) {
            this.lValue = lValue;
            this.rValue = rValue;
        }
    }

    static {
        node[0] = new Node('A', 'B');
        node[1] = new Node('C', 'D');
        node[2] = new Node('E', 'F');
        node[3] = new Node('G', 'H');
        node[4] = new Node('I', 'J');
        node[5] = new Node('K', 'L');
        node[6] = new Node('M', 'N');
        node[7] = new Node('O', 'P');
        node[8] = new Node(node[0], node[1]);
        node[9] = new Node(node[2], node[3]);
        node[10] = new Node(node[4], node[5]);
        node[11] = new Node(node[6], node[7]);
        node[12] = new Node(node[8], node[9]);
        node[13] = new Node(node[10], node[11]);
        node[14] = new Node(node[12], node[13]);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (Node n : node) {
            String[] st = br.readLine().split(" ");
            int a = Integer.parseInt(st[0]);
            int b = Integer.parseInt(st[1]);
            n.setValue(a, b);
        }

        Node cur = node[14];
        while (cur.hasNext == 1) {
            if (cur.lValue > cur.rValue) {
                cur = cur.L;
            } else {
                cur = cur.R;
            }
        }


        System.out.println(cur.lValue > cur.rValue ? cur.lData : cur.rData);
    }

}
