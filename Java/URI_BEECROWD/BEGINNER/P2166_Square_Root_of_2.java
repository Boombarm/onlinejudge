/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2166 Square Root of 2
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2166
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 11/8/16, 9:16:28 PM
 * @Runtime: 0.052s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class P2166_Square_Root_of_2 {

    static BufferedReader br;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat formatter = new DecimalFormat("0.0000000000");
        int n = Integer.parseInt(br.readLine());
        double answer = 1.0000000000;
        if (n != 0) {
            double temp = 2;
            while (--n > 0) {
                temp = 2 + 1.0 / temp;
            }
            answer = (1 + 1 / temp);
        }
        System.out.println(formatter.format(answer));
    }
}
