/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: BST Operations I
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1200
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 2/26/16, 5:19:54 PM
 * @Runtime: 0.036s
 * @Solution: Create BTS Structure, pre-order Traversal, in-order Traversal, post-order Traversal
 * @Note:
 */
package  URI.Accepted.GRAPH.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class P1200_BST_Operations_I {

    private static BufferedWriter bw;
    private static Node root = null;

    private static class Node {

        Node left = null, right = null;
        char data;

        public Node(char data) {
            this.data = data;
        }
    }

    private static void insert(char c) {
        if (root == null) {
            root = new Node(c);
        } else {
            Node cur = root;
            while (cur != null) {
                if (c < cur.data) {
                    if (cur.left == null) {
                        cur.left = new Node(c);
                        break;
                    }
                    cur = cur.left;
                } else {
                    if (cur.right == null) {
                        cur.right = new Node(c);
                        break;
                    }
                    cur = cur.right;
                }
            }
        }
    }

    private static boolean search(char c) {
        Node cur = root;
        while (cur != null) {
            if (cur.data == c) {
                return true;
            } else if (c < cur.data) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }
        return false;
    }

    private static void preOrder() throws IOException {
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        boolean hasPrinted = false;
        while (!stack.empty()) {
            Node n = stack.pop();
            if (!hasPrinted) {
                hasPrinted = true;
            } else {
                bw.append(" ");
            }
            bw.append(n.data);

            if (n.right != null) {
                stack.push(n.right);
            }
            if (n.left != null) {
                stack.push(n.left);
            }
        }
        bw.newLine();
    }

    private static void inOrder() throws IOException {
        if (root == null) {
            return;
        }

        Stack<Node> s = new Stack<Node>();
        Node cur = root;
        boolean hasPrinted = false;
        while (!s.empty() || cur != null) {

            if (cur != null) {
                s.push(cur);
                cur = cur.left;
            } else {
                Node n = s.pop();
                if (!hasPrinted) {
                    hasPrinted = true;
                } else {
                    bw.append(" ");
                }
                bw.append(n.data);
                cur = n.right;
            }
        }
        bw.newLine();
    }

    private static void postOrder() throws IOException {
        if (root == null) {
            return;
        }

        Stack<Node> s = new Stack<Node>();
        Node cur = root;
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
                bw.append(cur.data);
                cur = null;
            }
        }
        bw.newLine();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while ((input = br.readLine()) != null) {
            String[] st = input.split(" ");
            char c;
            if (st[0].equals("I")) {
                c = st[1].charAt(0);
                insert(c);

            } else if (st[0].equals("PREFIXA")) {
                preOrder();

            } else if (st[0].equals("INFIXA")) {
                inOrder();

            } else if (st[0].equals("POSFIXA")) {
                postOrder();

            } else if (st[0].equals("P")) {
                c = st[1].charAt(0);
                bw.append(c + " " + (search(c) ? "existe" : "nao existe") + "\n");

            }
        }
        bw.flush();
    }

}
