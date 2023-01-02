/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1251 Tell me the Frequencies!
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1251
 * @Timelimit: 1 sec
 * @Status: Accepted 21/11/2015 - 15:55:47 Runtime:0.236s
 * @Solution: linklist sorting
 */
package URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1251_Tell_me_the_Frequencies {

    static class Node {

        private int frequencies = 1;
        private int asciiCode;
        private char name;
        private Node next = null;

        public Node(char name) {
            this.name = name;
            asciiCode = (int) name;
        }

        void setNext(Node next) {
            this.next = next;
        }

        Node getNext() {
            return this.next;
        }

        char getName() {
            return name;
        }

        int toAsciiCode() {
            return asciiCode;
        }

        void addFreequencie() {
            frequencies++;
        }

        int frequencies() {
            return frequencies;
        }

    }

    static Node head = null, current = null, previous = null;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        while (input != null) {
            int n = input.length();
            for (int i = 0; i < n; i++) {
                char name = input.charAt(i);
                if (find(name)) {
                    continue;
                }

                Node newNode = new Node(name);
                if (head == null) {
                    head = newNode;
                } else {
                    previous.setNext(newNode);
                }
                previous = newNode;

            }
            sorting();
            current = head;
            while (current != null) {
                bw.append(current.toAsciiCode() + " " + current.frequencies() + "\n");
                current = current.getNext();
            }
            head = null;

            bw.flush();
            input = br.readLine();
            if (input != null) {
                bw.newLine();
            }
        }
        bw.flush();
    }

    private static boolean find(char name) {
        Node cur = head;
        Node prev = null, next;
        while (cur != null) {
            if (cur.getName() == name) {
                cur.addFreequencie();
                return true;
            }
            cur = cur.getNext();
        }
        return false;
    }

    private static void sorting() {
        Node next, prev = null;
        while (true) {
            boolean found = false;
            Node cur = head;
            while (cur != null) {
                next = cur.getNext();
                if (next != null && (cur.frequencies() > next.frequencies()
                        || cur.frequencies() == next.frequencies() && cur.toAsciiCode() < next.toAsciiCode())) {
                    found = true;
                    if (cur == head) {
                        head = next;
                        cur.setNext(next.getNext());
                        next.setNext(cur);

                    } else {
                        prev.setNext(next);
                        cur.setNext(next.getNext());
                        next.setNext(cur);
                    }
                }
                prev = cur;
                cur = cur.getNext();
            }
            if (!found) {
                break;
            }
        }
    }

}


