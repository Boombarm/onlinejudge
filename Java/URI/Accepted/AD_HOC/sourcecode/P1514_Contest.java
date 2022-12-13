/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1514 Contest
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1514
 * @Timelimit: 1 sec
 * @Status: Accepted 26/12/2015 - 12:32:25 Runtime:0.076s 
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P1514_Contest {

    static int[] scoreboard, coder;
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        String input;
        while (!(input = br.readLine()).equals("0 0")) {
            String[] st = input.split(" ");
            n = Integer.parseInt(st[0]);
            m = Integer.parseInt(st[1]);
            scoreboard = new int[m];
            coder = new int[n];
            for (int i = 0; i < n; i++) {
                st = br.readLine().split(" ");
                for (int j = 0; j < m; j++) {
                    int now = Integer.parseInt(st[j]);
                    if (now == 1) {
                        scoreboard[j]++;
                        coder[i]++;
                    }
                }
            }
            int amount = 0;
            if (attribute_one()) {
                amount++;
            }
            if (attribute_two()) {
                amount++;
            }
            if (attribute_three()) {
                amount++;
            }
            if (attribute_Four()) {
                amount++;
            }

            out.write((amount + "\n").getBytes());
        }
        out.flush();
    }

    static boolean attribute_one() {
        for (int i = 0; i < n; i++) {
            if (coder[i] == m) {
                return false;
            }
        }
        return true;
    }

    static boolean attribute_two() {
        for (int i = 0; i < m; i++) {
            if (scoreboard[i] == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean attribute_three() {
        for (int i = 0; i < m; i++) {
            if (scoreboard[i] == n) {
                return false;
            }
        }
        return true;
    }

    static boolean attribute_Four() {
        for (int i = 0; i < n; i++) {
            if (coder[i] == 0) {
                return false;
            }
        }
        return true;
    }

}
