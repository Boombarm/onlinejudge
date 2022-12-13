package URI.Accepted.BEGINNER.sourcecode;


/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: BEGINNER
 * @Problem: 2782 - Stepladder
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2782
 * @Timelimit:
 * @Status: Accepted
 * @Memory:
 * @Submission: 1/25/19, 12:33:21 PM
 * @Runtime: 0.056s
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2782_Stepladder {

    static int step = 0;
    static Integer direction = null;
    static int directionAmount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n == 1) {
            System.out.println(1);
        } else {
            String[] st = br.readLine().split(" ");
            int last = Integer.parseInt(st[0]);
            direction = null;
            directionAmount = 0;
            for (int i = 1; i < n; i++) {
                int now = Integer.parseInt(st[i]);
                if (direction == null) {
                    if (last == now) {
                        direction = 0;
                    } else if (last > now) {
                        direction = -1;
                        directionAmount = Math.abs(last - now);
                    } else if (last < now) {
                        direction = 1;
                        directionAmount = Math.abs(last - now);
                    }
                    step++;
                } else if (last == now) {
                    if (direction != 0) {
                        direction = 0;
                        step++;
                    }
                } else if (last > now) { // DOWN
                    if (direction == -1 && Math.abs(last - now) != directionAmount) {
                        step++;
                    } else if (direction != -1) {
                        direction = -1;
                        step++;
                    }
                    directionAmount = Math.abs(last - now);
                } else if (last < now) { // UP
                    if (direction == 1 && Math.abs(last - now) != directionAmount) {
                        step++;
                    } else if (direction != 1) {
                        direction = 1;
                        step++;
                    }
                    directionAmount = Math.abs(last - now);
                }
                last = now;
            }

            System.out.println(step);
        }
    }


}
