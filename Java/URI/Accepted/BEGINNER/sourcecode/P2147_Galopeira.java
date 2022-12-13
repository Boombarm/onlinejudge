/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2147 Galopeira
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2147
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 10/20/16, 11:32:28 AM
 * @Runtime: 0.040s
 * @Solution: check time typed word 1/100
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.text.DecimalFormat;

public class P2147_Galopeira {

    static BufferedReader br;
    static OutputStream out;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new BufferedOutputStream(System.out);
        DecimalFormat formatter = new DecimalFormat("##0.00");
        int c = Integer.parseInt(br.readLine());
        for (int i = 0; i < c; i++) {
            double length = br.readLine().length();
            out.write((formatter.format(length / 100) + "\n").getBytes());
        }
        out.flush();
    }
}
