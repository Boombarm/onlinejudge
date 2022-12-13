/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1466 Level Order Tree Traversal
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1466
 * @Timelimit: 2 sec
 * @Status: Accepted
 * @Submission: 3/18/16, 11:58:21 AM
 * @Runtime: 0.172s
 * @Solution: BST and Level Order Tree Traversal
 * @Note:
 */
package  URI.Accepted.GRAPH.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class P1466_Level_Order_Tree_Traversal {

    private static class BSTNode {

        int data;
        BSTNode left = null;
        BSTNode right = null;

        public BSTNode(int data) {
            this.data = data;
        }
    }

    private static BSTNode root;
    private static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int c = Integer.parseInt(br.readLine());
        int i = 1;
        while (c-- > 0) {
            int n = Integer.parseInt(br.readLine()) - 1;
            String[] st = br.readLine().split(" ");
            int data = Integer.parseInt(st[0]);
            root = new BSTNode(data);
            int j = 1;
            while (n-- > 0) {
                BSTNode cur = root;
                data = Integer.parseInt(st[j]);
                while (true) {
                    if (data < cur.data) {
                        if (cur.left == null) {
                            cur.left = new BSTNode(data);
                            break;
                        }
                        cur = cur.left;
                    } else {
                        if (cur.right == null) {
                            cur.right = new BSTNode(data);
                            break;
                        }
                        cur = cur.right;
                    }
                }
                j++;
            }

            bw.append("Case " + i + ":\n");
            printLevelOrderTraversal();
            bw.newLine();
            i++;
        }
        bw.flush();
    }

    private static void printLevelOrderTraversal() throws IOException {
        LinkedList<BSTNode> que = new LinkedList<BSTNode>();
        que.add(root);
        boolean hasPrinted = false;
        while (!que.isEmpty()) {
            BSTNode node = que.remove();

            if (!hasPrinted) {
                bw.append("" + node.data);
                hasPrinted = true;
            } else {
                bw.append(" " + node.data);
            }
            if (node.left != null) {
                que.add(node.left);
            }
            if (node.right != null) {
                que.add(node.right);
            }
        }
        bw.newLine();
    }

}
