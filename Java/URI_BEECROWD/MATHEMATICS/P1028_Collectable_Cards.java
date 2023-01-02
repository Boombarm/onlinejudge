/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1028 Collectable Cards
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1028
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/17/16, 11:20:30 AM
 * @Runtime: 0.112s
 * @Solution: Find GCD (Euclid's algorithm)
 * @Note:
 */
package  URI.Accepted.MATHEMATICS.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P1028_Collectable_Cards {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] st = br.readLine().split(" ");
            int f1 = Integer.parseInt(st[0]);
            int f2 = Integer.parseInt(st[1]);
            out.write((gcd(f1, f2) + "\n").getBytes());
        }
        out.flush();
    }

    private static int gcd(int n, int m) {
        while (m > 0) {
            int t = n % m;
            n = m;
            m = t;
        }
        return n;
    }

}
