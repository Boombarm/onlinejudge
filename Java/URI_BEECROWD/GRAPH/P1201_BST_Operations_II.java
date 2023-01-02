/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1201 BST Operations II
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1201
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/16/16, 12:01:55 PM 
 * @Runtime: 0.176s
 * @Solution: binary search tree
 * @Note:
 */
package  URI.Accepted.GRAPH.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class P1201_BST_Operations_II {

    private static BufferedWriter bw;
    private static Node root = null;

    private static class Node {

        Node left = null, right = null;
        int data;

        public Node(int data) {
            this.data = data;
        }

    }

    private static void insert(int c) {
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

    private static void remove(int c) {
        if (root == null) {
            return;
        }

        //search Node and Delete
        Node parent = null;
        char link = ' ';
        Node cur = root;
        while (cur != null) {
            if (c == cur.data) {
                Node left = cur.left;
                Node right = cur.right;
                if (left == null && right == null) {//no child
                    switch (link) {
                        case 'r':
                            parent.right = null;
                            break;
                        case 'l':
                            parent.left = null;
                            break;
                        default:
                            root = null;
                            break;
                    }
                } else if (left != null && right != null) {//2 child
                    //find the bigger element from left subtree
                    Node deleteNode = cur;
                    Node p = null;
                    Node successor = cur.left;
                    int count = 0;
                    while (successor.right != null) {
                        p = successor;
                        successor = successor.right;
                        count++;
                    }
                    if (count == 0) {
                        successor.right = deleteNode.right;
                    } else {
                        if (successor.left != null) {
                            p.right = successor.left;
                        } else {
                            p.right = null;
                        }
                        successor.left = deleteNode.left;
                        successor.right = deleteNode.right;
                    }
                    switch (link) {
                        case 'r':
                            parent.right = successor;
                            break;
                        case 'l':
                            parent.left = successor;
                            break;
                        default:
                            root = successor;
                            break;
                    }

                } else {//1 child
                    Node deleteNodeChild = (cur.left != null ? cur.left : cur.right);
                    switch (link) {
                        case 'r':
                            parent.right = deleteNodeChild;
                            break;
                        case 'l':
                            parent.left = deleteNodeChild;
                            break;
                        default:
                            root = deleteNodeChild;
                            break;
                    }
                }
                break;
            } else if (c < cur.data) {//next to left child
                parent = cur;
                link = 'l';
                cur = cur.left;
            } else {//next to right child
                parent = cur;
                link = 'r';
                cur = cur.right;
            }
        }
    }

    private static boolean search(int c) {
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

    private static void preOrder_traversal() throws IOException {
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

    private static void inOrder_traversal() throws IOException {
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
                bw.append(n.data + "");
                cur = n.right;
            }
        }
        bw.newLine();
    }

    private static void postOrder_traversal() throws IOException {
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
                bw.append(cur.data + "");
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
            int i;
            if (st[0].equals("I")) {
                i = Integer.parseInt(st[1]);
                insert(i);

            } else if (st[0].equals("PREFIXA")) {
                preOrder_traversal();

            } else if (st[0].equals("INFIXA")) {
                inOrder_traversal();

            } else if (st[0].equals("POSFIXA")) {
                postOrder_traversal();

            } else if (st[0].equals("P")) {
                i = Integer.parseInt(st[1]);
                bw.append(i + " " + (search(i) ? "existe" : "nao existe") + "\n");

            } else if (st[0].equals("R")) {
                i = Integer.parseInt(st[1]);
                remove(i);

            }
        }
        bw.flush();
    }

}
