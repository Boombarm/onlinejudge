/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1429 Factorial Again!
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1429
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/27/16, 12:20:11 PM
 * @Runtime: 0.080s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.MATHEMATICS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1429_Factorial_Again {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while (!(input = br.readLine()).equals("0")) {
            int size = input.length();
            int i = 0;
            int answer = 0;
            while (i < size) {
                int number = input.charAt(i) - '0';
                if (number != 0) {
                    int fac = (size - i);
                    int t = fac;
                    while (--t > 0) {
                        fac *= t;
                    }
                    answer += (number * fac);
                }
                i++;
            }
            bw.append(answer + "\n");
        }
        bw.flush();
    }

}
