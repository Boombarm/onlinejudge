/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1235 Inside Out
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1235
 * @Timelimit: 1 sec
 * @Status: Accepted 11/10/2015 - 22:00:34 Runtime:0.204s
 * @Solution:
 */
package Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1235_Inside_Out {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String text = br.readLine();
            String t1 = "";
            String t2 = "";
            for (int j = text.length() / 2 - 1; j >= 0; j--) {
                t1 += text.charAt(j);
            }
            for (int j = text.length() - 1; j >= text.length() / 2; j--) {
                t2 += text.charAt(j);
            }
            System.out.println(t1 + t2);
        }

    }

}
