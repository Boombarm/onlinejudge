/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: AD-HOC
 * @Problem: 2928 - Crossing Lakes
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2928
 * @Level:
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 4/2/19, 4:42:00 PM
 * @Runtime: 0.080s
 * @Solution:
 * @Note:
 */

package URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2928_Crossing_Lakes {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int dis = 0;
        boolean isFailed = false;
        int jumped = 0;
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            if (isFailed) continue;
            switch (line.charAt(0)) {
                case '-':
                    if (dis > 0 && dis <= 2) jumped++;
                    if (dis >= 3) {
                        isFailed = true;
                        break;
                    }
                    dis = 0;
                    break;
                case '.':
                    dis++;
                    break;
            }
        }

        System.out.println(isFailed ? "N" : dis > 0 && dis <= 2 ? jumped + 1 : jumped);
    }

}