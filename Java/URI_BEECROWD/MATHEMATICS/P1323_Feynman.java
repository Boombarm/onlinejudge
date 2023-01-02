/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1323 Feynman
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1323
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 2/29/16, 5:02:18 PM
 * @Runtime: 0.060s
 * @Solution: n^2 + (n-1)^2 + (n-2)^2 ... 1^2 หรือ n(n+1)(2n+1)/6
 * @Note: หาจำนวนสี่เหลี่ยมจตุรัส n * n
 */
package  URI.Accepted.MATHEMATICS.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P1323_Feynman {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        int n;
        while ((n = Integer.parseInt(br.readLine())) != 0) {
            int answer = (((n + 1) * ((n * 2) + 1)) * n) / 6;
            out.write((answer + "\n").getBytes());
        }
        out.flush();
    }

}
