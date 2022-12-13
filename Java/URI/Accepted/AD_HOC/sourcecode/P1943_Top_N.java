/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1943 Top N
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1943
 * @Status: Accepted 20/10/2015 - 11:51:01 Runtime:0.052s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1943_Top_N {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        if (k == 1) {
            System.out.println("Top 1");
        } else if (k > 1 && k <= 3) {
            System.out.println("Top 3");
        } else if (k > 3 && k <= 5) {
            System.out.println("Top 5");
        } else if (k > 5 && k <= 10) {
            System.out.println("Top 10");
        } else if (k > 10 && k <= 25) {
            System.out.println("Top 25");
        } else if (k > 25 && k <= 50) {
            System.out.println("Top 50");
        } else {
            System.out.println("Top 100");
        }
    }

}
