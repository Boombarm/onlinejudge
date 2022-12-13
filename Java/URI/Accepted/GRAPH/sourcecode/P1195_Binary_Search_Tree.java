/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1195 Binary Search Tree
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1195
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/17/16, 1:26:16 PM
 * @Runtime: 0.332s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.GRAPH.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class P1195_Binary_Search_Tree {

    private static class BSTNode {

        int data;
        BSTNode left = null;
        BSTNode right = null;
    }

    private static BufferedWriter bw;
    private static BSTNode root;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int c = Integer.parseInt(br.readLine());
        int i = 1;
        while (c-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] st = br.readLine().split(" ");
            //Insert Data to BST
            root = null;
            int j = 0;
            while (n-- > 0) {
                BSTNode newNode = new BSTNode();
                int newData = Integer.parseInt(st[j]);
                newNode.data = newData;
                if (root == null) {
                    root = newNode;
                } else {
                    BSTNode cur = root;
                    loop:
                    while (true) {
                        if (newData < cur.data) {
                            if (cur.left == null) {
                                cur.left = newNode;
                                break loop;
                            }
                            cur = cur.left;
                        } else {
                            if (cur.right == null) {
                                cur.right = newNode;
                                break loop;
                            }
                            cur = cur.right;
                        }
                    }
                }
                j++;
            }

            bw.append("Case " + i + ":\n");
            bw.append("Pre.: ");
            printPreOrder_traversal();
            bw.append("In..: ");
            printInOrder_traversal();
            bw.append("Post: ");
            printPostOrder_traversal();
            bw.newLine();
            i++;
        }
        bw.flush();
    }

    private static void printPreOrder_traversal() throws IOException {
        Stack<BSTNode> stack = new Stack<BSTNode>();
        stack.push(root);
        boolean hasPrinted = false;
        while (!stack.empty()) {
            BSTNode n = stack.pop();
            if (!hasPrinted) {
                hasPrinted = true;
            } else {
                bw.append(" ");
            }
            bw.append(n.data + "");

            if (n.right != null) {
                stack.push(n.right);
            }
            if (n.left != null) {
                stack.push(n.left);
            }
        }
        bw.newLine();
    }

    private static void printInOrder_traversal() throws IOException {
        Stack<BSTNode> s = new Stack<BSTNode>();
        BSTNode cur = root;
        boolean hasPrinted = false;
        while (!s.empty() || cur != null) {

            if (cur != null) {
                s.push(cur);
                cur = cur.left;
            } else {
                BSTNode n = s.pop();
                if (!hasPrinted) {
                    hasPrinted = true;
                } else {
                    bw.append(" ");
                }
                bw.append(n.data + "");
                cur = n.right;
            }
        }
        bw.newLine();
    }

    private static void printPostOrder_traversal() throws IOException {
        Stack<BSTNode> s = new Stack<BSTNode>();
        BSTNode cur = root;
        boolean hasPrinted = false;
        while (true) {

            if (cur != null) {
                if (cur.right != null) {
                    s.push(cur.right);
                }
                s.push(cur);
                cur = cur.left;
                continue;
            }

            if (s.isEmpty()) {
                break;
            }
            cur = s.pop();

            if (cur.right != null && !s.isEmpty() && cur.right == s.peek()) {
                s.pop();
                s.push(cur);
                cur = cur.right;
            } else {
                if (!hasPrinted) {
                    hasPrinted = true;
                } else {
                    bw.append(" ");
                }
                bw.append(cur.data + "");
                cur = null;
            }
        }
        bw.newLine();
    }

}
