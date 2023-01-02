/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge:URI Online judge
 * @Problem: 2232 Pascal's Triangle
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2232
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 10/22/16, 9:43:52 PM
 * @Runtime: 0.032s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P2232_Pascals_Triangle {

    static BufferedReader br;
    static OutputStream out;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new BufferedOutputStream(System.out);
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            out.write(((int) (Math.pow(2, Integer.parseInt(br.readLine())) - 1) + "\n").getBytes());
        }
        out.flush();
    }

}
