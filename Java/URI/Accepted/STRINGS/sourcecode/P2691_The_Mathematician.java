package URI.Accepted.STRINGS.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: STRING
 * @Problem: 2691 - The Mathematician
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2691
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 2/24/18, 1:03:11 PM
 * @Runtime: 0.024s
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P2691_The_Mathematician {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String[] st = br.readLine().split("x");
            int a = Integer.parseInt(st[0]);
            int b = Integer.parseInt(st[1]);
            if (a == b) {
                for (int i = 5; i <= 10; i++) {
                    bw.append(a + " x " + i + " = " + (a * i) + "\n");
                }
            } else {
                for (int i = 5; i <= 10; i++) {
                    bw.append(a + " x " + i + " = " + (a * i) + " && " + b + " x " + i + " = " + (b * i) + "\n");
                }
            }
        }
        bw.flush();
    }
}
