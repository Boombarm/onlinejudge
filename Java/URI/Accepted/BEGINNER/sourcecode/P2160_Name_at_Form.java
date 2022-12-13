/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2160 Name at Form
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2160
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 10/20/16, 11:11:17 AM
 * @Runtime:  0.036s
 * @Solution: check String length
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2160_Name_at_Form {

    static BufferedReader br;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(br.readLine().length() <= 80 ? "YES" : "NO");
    }
}
