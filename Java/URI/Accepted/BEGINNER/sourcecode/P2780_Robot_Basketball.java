package URI.Accepted.BEGINNER.sourcecode;


/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: BEGINNER
 * @Problem: 2780 - Robot Basketball
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2780
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory:
 * @Submission: 12/25/18, 12:35:02 PM
 * @Runtime: 0.052s
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2780_Robot_Basketball {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int in = Integer.parseInt(br.readLine());
        if (in <= 800) {
            System.out.println("1");
        } else if (in <= 1400) {
            System.out.println("2");
        } else if (in <= 2000) {
            System.out.println("3");
        }
    }
}


