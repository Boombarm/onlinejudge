package URI.Accepted.GRAPH.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: GRAPH
 * @Problem: 1191 - Tree Recovery
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1191
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory:
 * @Submission: 1/14/19, 5:55:33 PM
 * @Runtime: 0.212s
 * @Solution:
 * @Note:
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class P1191_Tree_Recovery {

    private static Node[] node;
    private static char[] preOrder, inOrder;
    private static BufferedReader br;
    private static BufferedWriter bw;

    private static class Node {
        int id;
        char data;

        public Node(int id, char data) {
            this.id = id;
            this.data = data;
        }
    }

    private static class BinaryTree {
        int size;
        int preIndex = 0;

        public BinaryTree(int size) {
            this.size = size - 1;
        }

        void printPostOrder(Node[] node, int inStrt, int inEnd) throws IOException {
            if (inStrt > inEnd) return;
            int inIndex = search(inOrder, inStrt, inEnd, preOrder[preIndex++]);
            printPostOrder(node, inStrt, inIndex - 1);
            printPostOrder(node, inIndex + 1, inEnd);
            bw.append(node[inIndex].data);
        }

        int search(char[] in, int startIn, int endIn, int data) {
            int i = 0;
            for (i = startIn; i < endIn; i++)
                if (in[i] == data)
                    return i;
            return i;
        }


    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String in;
        while ((in = br.readLine()) != null) {
            if (in.isEmpty()) continue;
            String[] st = in.split(" ");
            preOrder = st[0].toCharArray();
            inOrder = st[1].toCharArray();
            int size = preOrder.length;
            node = new Node[size];
            for (int j = 0; j < size; j++) {
                node[j] = new Node(j, inOrder[j]);
            }
            BinaryTree binaryTree = new BinaryTree(size);
            binaryTree.printPostOrder(node, 0, size - 1);
            bw.newLine();
        }
        bw.flush();
    }

}
