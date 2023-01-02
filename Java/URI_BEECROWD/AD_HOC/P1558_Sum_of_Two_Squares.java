/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1558 Sum of Two Squares
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1558
 * @Timelimit: 1 sec
 * @Status: Accepted 2/7/16, 12:35:21 AM Runtime: 0.056s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1558_Sum_of_Two_Squares {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while ((input = br.readLine()) != null) {
            int n = Integer.parseInt(input);
            boolean answer = false;
            int sqt;
            if (n >= 0) {
                for (int i = 0; i <= Math.sqrt(n) + 1; i++) {
                    sqt = (int) Math.sqrt(n - i * i);
                    if (sqt * sqt == n - i * i) {
                        answer = true;
                        break;
                    }
                }
            }
            bw.append(answer ? "YES\n" : "NO\n");
        }
        bw.flush();
    }

}
