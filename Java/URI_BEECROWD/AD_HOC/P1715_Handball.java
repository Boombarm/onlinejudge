/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: AD-HOC
 * @Problem: 1715 Handball
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1715
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 1/26/17, 2:42:29 PM
 * @Runtime: 0.052s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P1715_Handball {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        String input;
        int n, answer;
        while ((input = br.readLine()) != null) {
            String[] st = input.split(" ");
            n = Integer.parseInt(st[0]);
            answer = 0;
            for (int i = 0; i < n; i++) {
                st = br.readLine().split(" ");
                boolean regularity = true;
                for (String s : st) {
                    if (Integer.parseInt(s) == 0) {
                        regularity = false;
                        break;
                    }
                }
                if (regularity) {
                    answer++;
                }
            }
            out.write((answer + "\n").getBytes());
        }
        out.flush();
    }

}
