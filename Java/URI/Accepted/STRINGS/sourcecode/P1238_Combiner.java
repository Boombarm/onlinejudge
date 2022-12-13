/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1238 Combiner
 * @Link: https://www.urionlinejudge.com.br/judge/problems/view/1238
 * @Timelimit: 1 sec
 * @Status: Accepted 12/10/2015 - 21:00:22 Runtime:0.208s
 * @Solution:
 */
package Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1238_Combiner {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] st = br.readLine().split(" ");
            int c = 0;
            String answer = "";
            while (c < st[0].length() || c < st[1].length()) {
                if (c < st[0].length()) {
                    answer += st[0].charAt(c);
                }
                if (c < st[1].length()) {
                    answer += st[1].charAt(c);
                }
                c++;
            }
            System.out.println(answer);
        }
    }

}
