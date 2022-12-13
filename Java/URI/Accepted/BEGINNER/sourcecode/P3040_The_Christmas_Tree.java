/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Jusge
 * @Categories: Beginner
 * @Problem: 3040 - The Christmas Tree
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/3040
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 4/2/20, 10:48:10 PM
 * @Runtime: 0.128s
 * @Solution:
 * @Note:
 */

package URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P3040_The_Christmas_Tree {
    static int h, d, g;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String[] st = br.readLine().split(" ");
            h = Integer.parseInt(st[0]);
            d = Integer.parseInt(st[1]);
            g = Integer.parseInt(st[2]);
            if (h >= 200 && h <= 300 && d >= 50 && g >= 150) {
                bw.append("Sim\n");
            } else {
                bw.append("Nao\n");
            }
            bw.flush();
        }
        bw.flush();
    }

}
