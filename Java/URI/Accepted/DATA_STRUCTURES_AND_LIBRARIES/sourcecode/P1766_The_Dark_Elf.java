/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1766 The Dark Elf
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1766
 * @Timelimit: 1 sec
 * @Status: Accepted 23/11/2015 - 05:07:24 Runtime:0.104s
 * @Solution: LinkedList and sorting  - sorted by the descending order of weight. If two or more have the same weight they should be sorted in ascending order by age and height, if the tie still remains, order by name
 */
package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P1766_The_Dark_Elf {

    static Raindeer firstRaindeer;

    static class Raindeer {

        String name;
        int weight;
        int age;
        double height;
        Raindeer next;

        public Raindeer(String name, int weight, int age, double height) {
            this.name = name;
            this.weight = weight;
            this.age = age;
            this.height = height;
        }

        void setNext(Raindeer next) {
            this.next = next;
        }

        Raindeer getNext() {
            return next;
        }

        String getName() {
            return name;
        }

        int getWeight() {
            return weight;
        }

        int getAge() {
            return age;
        }

        double getHeight() {
            return height;
        }

    }

    static void addRaindeer(Raindeer newRaindeer) {
        Raindeer cur = firstRaindeer;
        Raindeer prev = null, next;
        while (cur != null) {
            boolean add = false;
            if (cur.getWeight() < newRaindeer.getWeight()) {//sort by weight
                add = true;
            } else if (cur.getWeight() == newRaindeer.getWeight()) {
                if (cur.getAge() > newRaindeer.getAge()) {//sort by age
                    add = true;
                } else if (cur.getAge() == newRaindeer.getAge()) {
                    if (cur.getHeight() > newRaindeer.getHeight()) {//sort by Height
                        add = true;
                    } else if (cur.getHeight() == newRaindeer.getHeight() && cur.getName().compareTo(newRaindeer.getName()) > 0) {//sort by name
                        add = true;
                    }
                }
            }
            if (add) {
                if (cur == firstRaindeer) {
                    firstRaindeer = newRaindeer;
                    newRaindeer.setNext(cur);
                } else {
                    prev.setNext(newRaindeer);
                    newRaindeer.setNext(cur);
                }
                break;
            }
            if (cur.getNext() == null) {//add last
                cur.setNext(newRaindeer);
                break;
            }
            prev = cur;
            cur = cur.getNext();
            next = cur.getNext();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            String[] st = br.readLine().split(" ");
            int n = Integer.parseInt(st[0]);
            int m = Integer.parseInt(st[1]);

            st = br.readLine().split(" ");
            String name = st[0];
            int weight = Integer.parseInt(st[1]);
            int age = Integer.parseInt(st[2]);
            double height = Double.parseDouble(st[3]);
            firstRaindeer = new Raindeer(name, weight, age, height);

            for (int j = 1; j < n; j++) {
                st = br.readLine().split(" ");
                name = st[0];
                weight = Integer.parseInt(st[1]);
                age = Integer.parseInt(st[2]);
                height = Double.parseDouble(st[3]);
                addRaindeer(new Raindeer(name, weight, age, height));
            }

            Raindeer current = firstRaindeer;
            out.write(("CENARIO {" + i + "}\n").getBytes());
            for (int j = 1; j <= m; j++) {
                out.write((j + " - " + current.getName() + "\n").getBytes());
                current = current.getNext();
            }
        }
        out.flush();
    }

}