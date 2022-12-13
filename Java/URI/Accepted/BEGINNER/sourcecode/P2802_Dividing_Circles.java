package URI.Accepted.BEGINNER.sourcecode;


/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: GRAPH
 * @Problem: 2802 - Dividing Circles
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2802
 * @Level:
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 2/12/19, 12:47:10 AM
 * @Runtime: 0.048s
 * @Solution: Points and regions simultaneous   R(p) = ((p^4) - (6p^3) + (23p^2) + (18p) + 24)  / 24
 * @Note: http://academic.sun.ac.za/mathed/174/circlesregionschords.pdf
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P2802_Dividing_Circles {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long x = (long) (Math.pow(n, 4) - (6 * Math.pow(n, 3)) + (23 * Math.pow(n, 2)) - (18 * n) + 24);
        x /= 24;
        System.out.println(x);
    }
}
