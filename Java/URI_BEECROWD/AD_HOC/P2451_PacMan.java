/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: AD-HOC
 * @Problem: 2451 - PacMan
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2451
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 4/7/19, 6:33:25 PM
 * @Runtime: 0.088s
 * @Solution:
 * @Note:
 */
package URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.InputStreamReader;;
import java.io.IOException;

public class P2451_PacMan {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int maximumMeal = 0;
        int meal = 0;
        for (int row = 0; row < n; row++) {
            char[] column = br.readLine().toCharArray();
            if (row % 2 == 0) {
                for (int c = 0; c < n; c++) {
                    if (column[c] == 'A') {
                        meal = 0;
                    } else if (column[c] == 'o') {
                        meal++;
                        if (maximumMeal < meal) maximumMeal = meal;
                    }
                }
            } else {
                for (int c = n - 1; c >= 0; c--) {
                    if (column[c] == 'A') {
                        meal = 0;
                    } else if (column[c] == 'o') {
                        meal++;
                        if (maximumMeal < meal) maximumMeal = meal;
                    }
                }
            }
        }

        System.out.println(maximumMeal);
    }

}