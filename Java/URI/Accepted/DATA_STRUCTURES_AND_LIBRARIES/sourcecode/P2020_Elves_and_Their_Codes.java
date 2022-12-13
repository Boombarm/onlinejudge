/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2020 Elves and Their Codes
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2020
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 6/11/16, 7:33:40 PM
 * @Runtime: 0.104s
 * @Solution: LinkedList Mapping, Sort by alphabetically 
 * @Note:
 */
package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.LinkedList;

public class P2020_Elves_and_Their_Codes {

    static Node node_Header = null;
    static Node node_Last = null;
    static Gnome gnome_Header = null;
    static Gnome gnome_Last = null;

    static class Node {

        int gnomeIndex;
        Node next;

        public Node(int gnomeIndex) {
            this.gnomeIndex = gnomeIndex;
        }

        void setNext(Node next) {
            this.next = next;
        }

    }

    static class Gnome {

        char data;
        Gnome next;
    }

    static void addNode(int data) {
        Node newNode = new Node(data);
        if (node_Header == null) {
            node_Header = newNode;
            node_Last = newNode;
        } else {
            node_Last.next = newNode;
            node_Last = node_Last.next;
        }
    }

    static void addGnome(char data) {
        Gnome newGnome = new Gnome();
        newGnome.data = data;
        if (gnome_Header == null) {
            gnome_Header = newGnome;
            gnome_Last = newGnome;
        } else {
            gnome_Last.next = newGnome;
            gnome_Last = gnome_Last.next;
        }
    }

    static void initStructure() {
        node_Header = null;
        node_Last = null;
        gnome_Header = null;
        gnome_Last = null;
        for (int i = 1, j = 1;
                i <= 26; i++, j++) {
            addNode(i);
        }
        for (int i = 'A';
                i <= 'Z'; i++) {
            addGnome((char) i);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int line, cases = 1;
        while (input != null) {
            bw.append("LISTA #" + cases + ":\n");
            LinkedList<String> result = new LinkedList<String>();
            initStructure();
            line = Integer.parseInt(input);
            while (line-- > 0) {
                String[] numberSet = br.readLine().split(" ");
                int size = numberSet.length;
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < size; i++) {
                    int number = Integer.parseInt(numberSet[i]);
                    switch (number) {
                        case 27:
                            sb.append(" ");
                            break;
                        default:
                            Node c1 = node_Header;
                            Node prev1 = null;
                            for (int j = 1; j < number && c1 != null; j++) {
                                prev1 = c1;
                                c1 = c1.next;
                            }
                            int index = c1.gnomeIndex;
                            Gnome c2 = gnome_Header;
                            Gnome prev2 = null;
                            for (int j = 1; j < index && c2 != null; j++) {
                                prev2 = c2;
                                c2 = c2.next;
                            }
                            sb.append(c2.data);

                            //update
                            node_Last.next = c1;
                            node_Last = node_Last.next;
                            if (c1 == node_Header) {
                                node_Header = c1.next;
                            } else {
                                prev1.next = c1.next;
                            }
                            c1.next = null;

                            gnome_Last.next = c2;
                            gnome_Last = gnome_Last.next;
                            if (c2 == gnome_Header) {
                                gnome_Header = c2.next;
                            } else {
                                prev2.next = c2.next;
                            }
                            c2.next = null;
                            break;
                    }
                }
                result.add(sb.toString() + "\n");
            }
            Collections.sort(result);//sort
            for (String output : result) {//print
                bw.append(output);
            }
            if ((input = br.readLine()) != null) {
                cases++;
                bw.newLine();
            }
        }
        bw.flush();
    }

}
