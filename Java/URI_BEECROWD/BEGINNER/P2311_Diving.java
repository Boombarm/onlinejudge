/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2311 Diving
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2311
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 12/16/16, 9:37:08 PM
 * @Runtime: 0.028s
 * @Solution:
 * @Note:
 */
package  URI. uri.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;

public class P2311_Diving {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        DecimalFormat formatter = new DecimalFormat("0.00");
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String name = br.readLine();
            double d = Double.parseDouble(br.readLine());
            String[] st = br.readLine().split(" ");

            double now = Double.parseDouble(st[0]);
            double max = now;
            double min = now;
            double sum = now;
            for (int i = 1; i < 7; i++) {
                now = Double.parseDouble(st[i]);
                if (max < now) {
                    max = now;
                }
                if (min > now) {
                    min = now;
                }
                sum += now;
            }
            sum -= (max + min);
            bw.append(name + " " + formatter.format(sum * d) + "\n");
        }
        bw.flush();

    }

}
