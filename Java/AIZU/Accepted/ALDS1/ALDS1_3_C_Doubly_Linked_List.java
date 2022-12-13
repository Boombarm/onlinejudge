package AIZU.Accepted.ALDS1;


/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: AIZU ONLINE JUDGE
 * @Categories: ALDS1
 * @Problem: ALDS1_3_C - Doubly_Linked_List
 * @Link: http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_3_C
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory: 188804 KB
 * @Submission: 2018-10-09 15:10
 * @Runtime: 01:10 s
 * @Solution: Doubly linkedList Simulation
 * @Note:
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class ALDS1_3_C_Doubly_Linked_List {

    static Node firstNode;
    static Node lastNode;

    static class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    static void insertNode(int data) {
        Node xNode = new Node(data);
        if (firstNode == null) {
            firstNode = xNode;
            lastNode = xNode;
        } else {
            xNode.next = firstNode;
            firstNode.prev = xNode;
            firstNode = xNode;
        }
    }

    static void delete(int data) {
        Node cur = firstNode;
        while (cur != null) {
            if (cur.data == data) {
                if (cur == lastNode) {
                    deleteLast();
                    return;
                }
                if (cur == firstNode) {
                    deleteFirst();
                    return;
                }
                cur.next.prev = cur.prev;
                cur.prev.next = cur.next;
                return;
            }
            cur = cur.next;
        }
    }

    static void deleteFirst() {
        firstNode = firstNode.next;
        if (firstNode != null) {
            firstNode.prev = null;
        } else {
            lastNode = null;
        }
    }

    static void deleteLast() {
        lastNode = lastNode.prev;
        if (lastNode != null) {
            lastNode.next = null;
        } else {
            firstNode = null;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] st = br.readLine().split(" ");
            String command = st[0];
            int data;
            switch (command) {
                case "insert":
                    data = Integer.parseInt(st[1]);
                    insertNode(data);
                    break;
                case "delete":
                    data = Integer.parseInt(st[1]);
                    delete(data);
                    break;
                case "deleteFirst":
                    deleteFirst();
                    break;
                case "deleteLast":
                    deleteLast();
                    break;
            }
        }

        Node cur = firstNode;
        boolean printed = false;
        while (cur != null) {
            if (printed) {
                bw.append(" ");
            } else {
                printed = true;
            }
            bw.append(cur.data + "");
            cur = cur.next;
        }
        bw.newLine();
        bw.flush();
    }
}
