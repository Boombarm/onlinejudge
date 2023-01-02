/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: https://www.urionlinejudge.com.br/judge/en/problems/view/1936
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1936
 * @Timelimit: 1 sec
 * @Status: Accepted 16/01/2016 - 13:31:13 Runtime:0.056s
 * @Solution: Greedy
 * @Note: maxInput =  10^5 Max Subset of Factorial = 8!
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P1936_Factorial {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        int n = Integer.parseInt(br.readLine());
        int smallestAmount = 0;
        while (n != 0) {
            if (n >= 40320) { //8!
                n -= 40320;
            } else if (n >= 5040) { //7!
                n -= 5040;
            } else if (n >= 720) { //6!
                n -= 720;
            } else if (n >= 120) {//5!
                n -= 120;
            } else if (n >= 24) {//4!
                n -= 24;
            } else if (n >= 6) {//3!
                n -= 6;
            } else if (n >= 2) {//2!
                n -= 2;
            } else {//1!
                n--;
            }
            smallestAmount++;
        }
        out.write((smallestAmount + "\n").getBytes());
        out.flush();
    }

}
