/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: AD-HOC
 * @Problem: 2598 - Placing Radars
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2598
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 4/7/19, 1:58:16 AM
 * @Runtime: 0.080s
 * @Solution:
 * @Note:
 */
package URI.Trying.WRITING.AD_HOC;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P2598_Placing_Radars {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int c = Integer.parseInt(br.readLine());
        for (int i = 0; i < c; i++) {
            String[] st = br.readLine().split(" ");
            double n = Integer.parseInt(st[0]);
            double m = Integer.parseInt(st[1]);
            int answer = (int) Math.ceil(n / m);
            bw.append(answer + "\n");
        }
        bw.flush();
    }

}