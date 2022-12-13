/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: AD-HOC
 * @Problem: 1708 - Lap
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1708
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 2/16/17, 9:45:22 PM
 * @Runtime: 0.096s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1708_Lab {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x, y, ax = 0, ay = 0, r = 1;
        String[] st = br.readLine().split(" ");
        x = Integer.parseInt(st[0]);
        y = Integer.parseInt(st[1]);
        while ((ay - ax) < x) {
            ax += x;
            ay += y;
            r++;
        }
        System.out.println(r);
    }

}
