/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1471 Dangerous Dive
 * @Link: https://www.urionlinejudge.com.br/judge/problems/view/1471/rate:1471/rating:2
 * @Timelimit: 1 sec
 * @Status: Accepted 25/12/2015 - 20:10:29 Runtime:0.068s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P1471_Dangerous_Dive {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while ((input = br.readLine()) != null) {
            String[] st = input.split(" ");
            int n = Integer.parseInt(st[0]);
            int r = Integer.parseInt(st[1]);
            if (n == r) {
                br.readLine();
                bw.append("*");
            } else {
                StringTokenizer stk = new StringTokenizer(br.readLine());
                boolean[] comeback = new boolean[n];
                while (stk.hasMoreTokens()) {
                    int id = Integer.parseInt(stk.nextToken());
                    comeback[id - 1] = true;
                }

                for (int i = 1; i <= n; i++) {
                    if (!comeback[i - 1]) {
                        bw.append(i + " ");
                    }
                }
            }
            bw.newLine();
        }
        bw.flush();
    }

}
