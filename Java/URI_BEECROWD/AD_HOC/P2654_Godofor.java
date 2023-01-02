package URI.Accepted.AD_HOC.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: AD-HOC
 * @Problem: 2654 : Godofor
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2654
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 9/28/18, 12:07:30 PM
 * @Runtime: 0.100s
 * @Solution: Sort
 * @Note:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P2654_Godofor {

    static class God implements Comparable {
        String name;
        int power;
        int kill;
        int dead;

        public God() {
        }

        public God(String name, int power, int kill, int dead) {
            this.name = name;
            this.power = power;
            this.kill = kill;
            this.dead = dead;
        }

        @Override
        public int compareTo(Object o) {
            God god = (God) o;
            if (this.power > god.power) {
                return -1;
            } else if (this.power < god.power) {
                return 1;
            } else if (this.kill > god.kill) {
                return -1;
            } else if (this.kill < god.kill) {
                return 1;
            } else if (this.dead < god.dead) {
                return -1;
            } else if (this.dead > god.dead) {
                return 1;
            } else if (this.name.compareTo(god.name) > 0) {
                return 1;
            } else if (this.name.compareTo(god.name) < 0) {
                return -1;
            }
            return 0;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        God[] gods = new God[n];
        for (int i = 0; i < n; i++) {
            String[] st = br.readLine().split(" ");
            String name = st[0];
            int power = Integer.parseInt(st[1]);
            int kill = Integer.parseInt(st[2]);
            int dead = Integer.parseInt(st[3]);
            gods[i] = new God(name, power, kill, dead);
        }
        Arrays.sort(gods);
        System.out.println(gods[0].name);
    }
}
