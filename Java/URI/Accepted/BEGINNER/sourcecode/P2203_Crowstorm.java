/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2203 CrowStorm
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2203
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 12/24/16, 12:06:15 AM
 * @Runtime: 0.072s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2203_Crowstorm {

    static double xf, yf, xi, yi, vi, r1, r2, x, y, d, r;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while ((input = br.readLine()) != null) {
            String[] st = input.split(" ");
            xf = Integer.parseInt(st[0]);
            yf = Integer.parseInt(st[1]);
            xi = Integer.parseInt(st[2]);
            yi = Integer.parseInt(st[3]);
            vi = Integer.parseInt(st[4]);
            r1 = Integer.parseInt(st[5]);
            r2 = Integer.parseInt(st[6]);
            x = Math.pow(xi - xf, 2);
            y = Math.pow(yi - yf, 2);
            d = Math.sqrt(x + y) + (vi * 1.5);
            r = r1 + r2;
            if (d > r) {
                bw.append("N\n");
            } else {
                bw.append("Y\n");
            }
        }
        bw.flush();

    }

}
