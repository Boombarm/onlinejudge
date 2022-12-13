/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2165 Twitting
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2165
 * @Timelimit: 1 sec
 * @Status: Accepted    
 * @Submission: 10/20/16, 11:52:24 AM
 * @Runtime: 0.036s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2165_Twitting {

    static BufferedReader br;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(br.readLine().length() <= 140 ? "TWEET" : "MUTE");
    }

}
