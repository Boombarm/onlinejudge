/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1765 Christmas Trapeziums
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1765
 * @Timelimit: 1 sec
 * @Status: Accepted 04/11/2015 - 15:11:37 Runtime:0.224s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class P1765_Christmas_Trapeziums {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.HALF_EVEN);
        int t;
        while ((t = Integer.parseInt(br.readLine())) != 0) {
            for (int i = 1; i <= t; i++) {
                bw.append("Size #" + i + ":\n");
                String[] st = br.readLine().split(" ");
                int q = Integer.parseInt(st[0]);
                double a = Double.valueOf(st[1]);
                double b = Double.valueOf(st[2]);
                double answer = (((a + b) / 2) * 5) * q;
                bw.append("Ice Cream Used: " + df.format(answer) + " cm2\n");
            }
            bw.newLine();
        }
        bw.flush();
    }

}
