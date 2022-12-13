/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: PARADIGMS
 * @Problem: 2243 - Isosceles
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2243
 * @Level:
 * @Timelimit:
 * @Status: Accepted
 * @Submission: 3/6/19, 3:52:13 PM
 * @Runtime: 0.952s
 * @Solution: หาความสูง สูงสุดที่สามารถเป็นไปได้
 * @Note:
 */

package URI.Accepted.PARADIGMS.sourcecode;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2243_Isosceles {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] st = br.readLine().split(" ");
        int[] numHeight = new int[n + 1];
        for (int i = 0; i < n; i++) {
            numHeight[i + 1] = Integer.parseInt(st[i]);
        }
        int maximum = 0;
        for (int i = 1; i <= n; i++) {
            int now = Math.min(numHeight[i], i <= n / 2 ? i : (n - i) + 1);
            int bound = now;
            for (int j = 1, k = 1; j < bound; j++, k++) {
                int minLevel = Math.min(numHeight[i - j], numHeight[i + j]);
                if ((now - j) > minLevel) {
                    now -= ((now - j) - minLevel);
                }
            }
            if (now > maximum) maximum = now;
        }
        System.out.println(maximum);
    }

}