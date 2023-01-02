/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2061 Closing Tabs
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2061
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 6/4/16, 11:23:07 PM
 * @Runtime: 0.036s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2061_Closing_Tabs {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int tabs = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);
        while (n-- > 0) {
            String action = br.readLine();
            if (action.equals("fechou")) {
                tabs++;
            } else {//clicou
                tabs--;
            }
        }
        System.out.println(tabs);
    }

}
