/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1957 Converting to Hexadecimal
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1957
 * @Timelimit: 1 sec
 * @Status: Accepted 04/11/2015 - 16:33:29 Runtime:0.044s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1957_Converting_to_Hexadecimal {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(hexadecimal(n));
    }

    static String hexadecimal(int n) {
        String answer = "";
        while (n > 0) {
            int c = n % 16;
            n /= 16;
            answer = c > 9 ? (char) ('A' - (10 - c)) + answer : c + answer;
        }
        return answer;
    }
}
