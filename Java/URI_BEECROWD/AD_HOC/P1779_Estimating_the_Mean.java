/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1779 Estimating the Mean
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1779
 * @Timelimit: 1 sec
 * @Status: Accepted 26/10/2015 - 07:02:17 Runtime: 0.404s
 * @Solution:find max value longest
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1779_Estimating_the_Mean {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                System.out.println(0);
                continue;
            }
            int longest = 1;
            int max = 0;
            String[] s = br.readLine().split(" ");
            //find Max Value
            if (n > 1) {
                for (int j = 0; j < n; j++) {
                    int now = Integer.parseInt(s[j]);
                    if (now > max) {
                        max = now;
                    }
                }
            }

            //find longest contiguous
            int contiguous = 1;
            for (int j = 1; j < n; j++) {
                int now = Integer.parseInt(s[j]);
                int old = Integer.parseInt(s[j - 1]);

                if (now == max && now == old) {
                    contiguous++;
                } else {
                    contiguous = 1;
                }

                if (contiguous > longest) {
                    longest = contiguous;
                }
            }
            System.out.println("Caso #" + i + ": " + longest);
        }
    }
}
