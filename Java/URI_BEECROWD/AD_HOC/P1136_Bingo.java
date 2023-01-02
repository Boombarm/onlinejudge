/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1136 Bingo!
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1136
 * @Timelimit: 2 sec
 * @Status: Accepted 31/12/2015 - 11:33:43 Runtime:0.184s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P1136_Bingo {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        String input;
        while (!(input = br.readLine()).equals("0 0")) {
            String[] st = input.split(" ");
            int n = Integer.parseInt(st[0]);
            int b = Integer.parseInt(st[1]);
            st = br.readLine().split(" ");
            boolean[] mark = new boolean[n + 1];
            int[] bag = new int[b];
            boolean isPossible = true;
            for (int i = 0; i < b; i++) {
                bag[i] = Integer.parseInt(st[i]);
            }

            for (int i = 0; i < b; i++) {
                for (int j = 0; j < b; j++) {
                    mark[Math.abs(bag[i] - bag[j])] = true;
                }
            }

            for (int i = 0; i <= n; i++) {
                if (mark[i] == false) {
                    isPossible = false;
                    break;
                }
            }

            out.write((isPossible ? "Y\n" : "N\n").getBytes());
        }
        out.flush();
    }

}
