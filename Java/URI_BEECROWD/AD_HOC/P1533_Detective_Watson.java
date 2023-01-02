/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1533 Detective Watson
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1533
 * @Timelimit: 1 sec
 * @Status: Accepted 24/11/2015 - 06:26:27 Runtime:0.060s
 * @Solution:finding max rank = 2
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P1533_Detective_Watson {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        int n;
        while ((n = Integer.parseInt(br.readLine())) != 0) {
            int[] number = new int[n];
            String[] st = br.readLine().split(" ");
            int max1 = 0, index = 0;
            for (int i = 0; i < n; i++) {
                int now = Integer.parseInt(st[i]);
                number[i] = now;
                if (now > max1) {
                    max1 = now;
                }
            }
            int max2 = 0;
            for (int i = 0; i < n; i++) {
                if (number[i] < max1 && number[i] > max2) {
                    max2 = number[i];
                    index = i;
                }
            }
            out.write(((index + 1) + "\n").getBytes());
        }
        out.flush();
    }

}
