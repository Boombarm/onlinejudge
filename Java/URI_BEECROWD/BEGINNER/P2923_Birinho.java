/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: AD-HOC
 * @Problem: 2923 - Birinho
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2923
 * @Timelimit:
 * @Status: Accepted
 * @Submission: 3/31/19, 5:11:39 PM
 * @Runtime: 0.088s
 * @Solution:
 * @Note:
 */
package URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P2923_Birinho {

    private static int T, A, W, C;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String in;
        while ((in = br.readLine()) != null) {
            String[] st = in.split(" ");
            T = Integer.parseInt(st[0]);//total disk size (in GB)
            A = Integer.parseInt(st[1]);//disk storage used (in GB)
            W = Integer.parseInt(st[2]);//percentage of the threshold for warning
            C = Integer.parseInt(st[3]);//percentage of the threshold for critical

            int now = (A * 100) / T;
            if (now >= C) {
                bw.append("critical\n");
            } else if (now >= W) {
                bw.append("warning\n");
            } else {
                bw.append("OK\n");
            }
        }
        bw.flush();
    }

}