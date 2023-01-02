/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: AD-HOC
 * @Problem: 2434 - Saldo do Vovô
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2434
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 4/7/19, 12:42:35 PM
 * @Runtime: 0.072s
 * @Solution:
 * @Note:
 */
package URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P2434_Saldo_do_Vovo {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int n = Integer.parseInt(st[0]);
        int s = Integer.parseInt(st[1]);
        int minimumRemaining = s;
        while (n-- > 0) {
            s += Integer.parseInt(br.readLine());
            if (s < minimumRemaining) minimumRemaining = s;
        }
        System.out.println(minimumRemaining);
    }

}