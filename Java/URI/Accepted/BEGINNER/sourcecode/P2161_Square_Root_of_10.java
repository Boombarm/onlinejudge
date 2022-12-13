/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2161 Square Root of 10
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2161
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 11/8/16, 9:11:52 PM
 * @Runtime: 0.060s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class P2161_Square_Root_of_10 {

    static BufferedReader br;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat formatter = new DecimalFormat("0.0000000000");
        int n = Integer.parseInt(br.readLine());
        double answer = 3.0000000000;
        if (n != 0) {
            double temp = 6;
            while (--n > 0) {
                temp = 6 + 1.0 / temp;
            }
            answer = (3 + 1 / temp);
        }
        System.out.println(formatter.format(answer));
    }

}
