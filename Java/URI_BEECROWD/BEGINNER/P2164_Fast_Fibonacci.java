/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online judge
 * @Problem: 2164 Fast Fibonacci
 * @Link: https://www.urionlinejudge.com.br/judge/en/ranks/problem/2164/java
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 10/22/16, 10:49:27 PM
 * @Runtime: 0.088s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class P2164_Fast_Fibonacci {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("0.0");
        double input = Double.parseDouble(br.readLine());
        double n1 = Math.pow((1 + Math.sqrt(5)) / 2.0, input);
        double n2 = Math.pow((1 - Math.sqrt(5)) / 2.0, input);
        double result = (n1 - n2) / Math.sqrt(5);
        System.out.println(df.format(result));
    }

}
