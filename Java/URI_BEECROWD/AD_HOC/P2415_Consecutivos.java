/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: AD-HOC
 * @Problem: 2415 - Consecutivos
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2415
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 4/7/19, 7:33:56 PM
 * @Runtime: 0.116s
 * @Solution:
 * @Note:
 */
package URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P2415_Consecutivos {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] st = br.readLine().split(" ");
        int last = Integer.parseInt(st[0]);
        int maximumConsecutive = 1;
        int counter = 1;
        for (int i = 1; i < n; i++) {
            int x = Integer.parseInt(st[i]);
            if (last != x) counter = 1;
            else if (maximumConsecutive < ++counter) {
                maximumConsecutive = counter;
            }
            last = x;
        }
        System.out.println(maximumConsecutive);
    }

}