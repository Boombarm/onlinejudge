/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2167 Engine Failure
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2167
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 10/20/16, 12:04:43 PM
 * @Runtime: 0.040s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2167_Engine_Failure {

    static BufferedReader br;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String st[] = br.readLine().split(" ");
        int speedfall = 0;
        for (int i = 1; i < n; i++) {
            int last = Integer.parseInt(st[i - 1]);
            int now = Integer.parseInt(st[i]);
            if (last > now) {
                speedfall = i + 1;
                break;
            }
        }
        System.out.println(speedfall);
    }

}
