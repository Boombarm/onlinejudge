/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: Ad-Hoc
 * @Problem: 2252 Discovering Password
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2252
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 1/19/17, 11:00:42 PM
 * @Runtime: 0.076s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2252_Discovering_Password {

    static Node header;

    static class Node {

        Node next;
        double level;
        int number;

        public Node(double level, int number) {
            this.level = level;
            this.number = number;
        }

    }

    static void addNode(Node newNode) {
        if (header == null) {
            header = newNode;
        } else {
            Node cur = header;
            Node prev = null;
            while (cur != null) {
                if (cur.level == newNode.level) {
                    Node last = null;
                    while (cur != null) {
                        if (cur.level == newNode.level && cur.number < newNode.number) {
                            last = cur;
                            cur = cur.next;
                        } else {
                            break;
                        }
                    }
                    if (last != null) {
                        last.next = newNode;
                        newNode.next = cur;
                    } else if (cur.number > newNode.number) {//[prev]? ->newNode -> cur
                        newNode.next = cur;
                        if (cur == header) {
                            header = newNode;
                        } else if (prev != null) {
                            prev.next = newNode;
                        }
                    }
                    break;

                } else if (cur.level < newNode.level) {//prev? ->newNode -> cur
                    newNode.next = cur;
                    if (cur == header) {
                        header = newNode;
                    } else if (prev != null) {
                        prev.next = newNode;
                    }
                    break;
                }
                prev = cur;
                cur = cur.next;
                if (cur == null) {
                    prev.next = newNode;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int c = 1;
        String line;
        while ((line = br.readLine()) != null) {
            int n = Integer.parseInt(line);
            String[] st = br.readLine().split(" ");
            header = null;
            for (int i = 0; i < 10; i++) {
                double th = Double.parseDouble(st[i]);
                addNode(new Node(th, i));
            }
            bw.append("Caso " + c + ": ");
            Node cur = header;
            while (n-- > 0) {
                bw.append(cur.number + "");
                cur = cur.next;
            }

            bw.newLine();
            c++;
        }
        bw.flush();
    }

}
