/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: Ad-Hoc
 * @Problem: 2178 - Blue Lagoon
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2178
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 2/12/17, 6:46:17 PM
 * @Runtime: 0.620s
 * @Solution: LinkedList Simulation
 * @Note:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class P2178_Blue_Lagoon {

    static Bird header = null, last = null;

    static class Bird {

        LinkedList<Integer> alive;
        Bird next, prev;

        public Bird(LinkedList<Integer> alive) {
            this.alive = alive;
        }

    }

    static Bird captured(Bird bird) {
        Bird prev = bird.prev;
        Bird next = bird.next;
        if (bird == header) {
            header = bird.next;
            bird.prev = null;
        } else {
            if (prev != null) {
                prev.next = next;
            }
            if (next != null) {
                next.prev = prev;
            }
        }
        return bird;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int a = Integer.parseInt(st[0]);
        for (int i = 0; i < a; i++) {
            st = br.readLine().split(" ");
            int n = Integer.parseInt(st[0]);
            LinkedList<Integer> alive = new LinkedList();
            for (int j = 1; j <= n; j++) {
                alive.add(Integer.parseInt(st[j]));
            }
            Bird b = new Bird(alive);
            if (header == null) {
                header = b;
                last = b;
            } else {
                Bird l = last;
                last = b;
                l.next = last;
                last.prev = l;
            }
        }

        int labs = 0;
        int captured = 0;
        loop:
        while (captured != a) {
            labs++;
            Bird cur = header;
            loop2:
            while (cur != null) {
                int lastindex = cur.alive.removeFirst();
                if (cur.alive.isEmpty()) {
                    captured++;
                    cur = captured(cur);
                    cur = cur.next;
                } else {
                    while (!cur.alive.isEmpty() && (cur.alive.peek() >= lastindex || cur.alive.peek() == 0 && cur.alive.size() == 1)) {
                        lastindex = cur.alive.removeFirst();
                        if (cur.alive.isEmpty()) {
                            captured++;
                            cur = captured(cur);
                            cur = cur.next;
                            continue loop2;
                        }
                    }
                    cur = cur.next;
                }
            }
        }
        System.out.println(labs);
    }

}
