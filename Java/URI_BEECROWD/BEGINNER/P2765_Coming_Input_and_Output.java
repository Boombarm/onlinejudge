package URI.Accepted.BEGINNER.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: BEGINNER
 * @Problem: 2765 : Coming Input and Output
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2765
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory: 398 Bytes
 * @Submission: 9/27/18, 10:55:03 PM
 * @Runtime: 0.088s
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2765_Coming_Input_and_Output {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(",");
        System.out.println(st[0]);
        System.out.println(st[1]);
    }
}
