/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2476 Parity
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2176
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 10/22/16, 6:38:05 PM
 * @Runtime: 0.036s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2176_Parity {

    static BufferedReader br;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        String message = br.readLine();
        int length = message.length();
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (message.charAt(i) == '1') {
                count++;
            }
        }
        System.out.println((count % 2) == 0 ? message + "0" : message + "1");
    }

}
