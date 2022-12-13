/**
 * @author: Teerapat Phokhonwong
 * @Onlinejudge:
 * @Categories:
 * @Problem:
 * @Link:
 * @Timelimit:
 * @Status:
 * @Submission:
 * @Runtime:
 * @Solution:
 * @Note:
 */
package URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2963_Buffoon {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int carlos = Integer.parseInt(br.readLine());
        boolean win = true;
        for (int i = 1; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            if (carlos < x) {
                win = false;
            }
        }
        System.out.println(win ? "S" : "N");
    }
}