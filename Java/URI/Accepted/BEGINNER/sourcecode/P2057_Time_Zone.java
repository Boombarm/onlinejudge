/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2057 Time Zone
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2057
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 6/4/16, 12:17:49 AM
 * @Runtime: 0.044s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2057_Time_Zone {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int result = (a + b + c) % 24;
        if (result >= 0) {
            System.out.println(result);
        } else {
            System.out.println(result + 24);
        }
    }

}
