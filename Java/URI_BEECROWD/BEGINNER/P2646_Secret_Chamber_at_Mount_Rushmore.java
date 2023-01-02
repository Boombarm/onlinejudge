package th.in.devboom.uri.accepted;


/**
 * Created by Teerapat-BSD on 1/9/2018.
 * https://www.urionlinejudge.com.br/judge/en/problems/view/2646
 * ลิสในลิส
 * Answer : Accepted
 * Runtime : 0.052s
 * Submission : 2/7/18, 4:09:04 PM
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class P2646_Secret_Chamber_at_Mount_Rushmore {

    static Node[] node = new Node[26];

    private static class Node {
        private char data;
        private LinkedList<Node> link;


        public Node(char data) {
            this.link = new LinkedList<Node>();
            this.data = data;
        }

        public char getData() {
            return this.data;
        }

        public LinkedList getLink() {
            return this.link;
        }

        public void addLink(Node node) {
            boolean found = false;
            //check Duplicate Link
            for (Node cur : this.link) {
                if (cur.data == node.data) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                this.link.add(node);
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] in = br.readLine().split(" ");
        int m = Integer.parseInt(in[0]);
        int n = Integer.parseInt(in[1]);

        //Build Link
        for (int i = 0; i < m; i++) {
            in = br.readLine().split(" ");
            char w1 = in[0].charAt(0);
            char w2 = in[1].charAt(0);
            Node nodeW1 = null, nodeW2 = null;
            if (node[w1 - 'a'] == null) {
                nodeW1 = new Node(w1);
                node[w1 - 'a'] = nodeW1;
            } else {
                nodeW1 = node[w1 - 'a'];
            }

            if (node[w2 - 'a'] == null) {
                nodeW2 = new Node(w2);
                node[w2 - 'a'] = nodeW2;
            } else {
                nodeW2 = node[w2 - 'a'];
            }

            nodeW1.addLink(nodeW2);
        }


        for (int i = 0; i < n; i++) {
            in = br.readLine().split(" ");
            String w1 = in[0];
            String w2 = in[1];
            if (w1.length() != w2.length()) {
                bw.append("no");
            } else {
                int length = w1.length();
                boolean failed = false;
                loop:
                for (int k = 0; k < length; k++) {
                    char c1 = w1.charAt(k);
                    char c2 = w2.charAt(k);
                    if (c1 != c2) {
                        //Find by C1
                        Node nodeC1 = node[c1 - 'a'];
                        if (nodeC1 == null || nodeC1.getLink().size() == 0) {
                            failed = true;
                            break loop;
                        } else {
                            Queue<Node> queue = new LinkedList<Node>();
                            queue.add(nodeC1);
                            boolean[] visitedNode = new boolean[26];
                            boolean found = false;
                            loop2:
                            while (!queue.isEmpty()) {
                                Node cur = queue.poll();
                                visitedNode[cur.getData() - 'a'] = true;
                                LinkedList<Node> link = cur.getLink();
                                for (Node node : link) {
                                    char c = node.getData();
                                    if (c == c2) {
                                        found = true;
                                        break loop2;
                                    }


                                    if (!visitedNode[node.getData() - 'a']) {
                                        queue.add(node);
                                    }
                                }

                            }
                            if (!found) {
                                failed = true;
                            }
                        }

                        if (failed) {
                            //Find by C2
                            Node nodeC2 = node[c2 - 'a'];
                            if (nodeC2 == null || nodeC2.getLink().size() == 0) {
                                failed = true;
                                break loop;
                            } else {
                                Queue<Node> queue = new LinkedList<Node>();
                                queue.add(nodeC2);
                                boolean[] visitedNode = new boolean[26];
                                boolean found = false;
                                loop2:
                                while (!queue.isEmpty()) {
                                    Node cur = queue.poll();
                                    visitedNode[cur.getData() - 'a'] = true;
                                    LinkedList<Node> link = cur.getLink();
                                    for (Node node : link) {
                                        char c = node.getData();
                                        if (c == c1) {
                                            found = true;
                                            break loop2;
                                        }


                                        if (!visitedNode[node.getData() - 'a']) {
                                            queue.add(node);
                                        }
                                    }

                                }
                                if (!found) {
                                    failed = true;
                                    break loop;
                                }
                            }
                        }
                    }
                }
                bw.append(failed ? "no" : "yes");
            }
            bw.newLine();
        }
        bw.flush();
    }

}
