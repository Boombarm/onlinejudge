/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online judge
 * @Problem: 2235 Walking in Time
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2235
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 10/22/16, 6:14:09 PM
 * @Runtime: 0.072s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2235_Walking_in_Time {

    static BufferedReader br;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int a = Integer.parseInt(st[0]);
        int b = Integer.parseInt(st[1]);
        int c = Integer.parseInt(st[2]);
        System.out.println((a == b || b == c || c == a || (a + b == c) || (b + c == a) || (c + a == b)) ? "S" : "N");
    }
}
