/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2159 Approximate Number of Primes
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2159
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 11/2/16, 12:48:37 PM
 * @Runtime: 0.048s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class P2159_Approximate_Number_of_Primes {

    static BufferedReader br;
    static DecimalFormat formatter;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        formatter = new DecimalFormat("0.0");
        int n = Integer.parseInt(br.readLine());
        double p = n / Math.log(n);
        double m = 1.25506 * (p);
        System.out.println(formatter.format(p) + " " + formatter.format(m));
    }

}
