/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2334 Little Ducks
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2334
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 11/23/16, 3:07:42 AM
 * @Runtime: 0.304s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.math.BigInteger;

public class P2334_Little_Ducks {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        String input;
        while (!(input = br.readLine()).equals("-1")) {
            BigInteger n = new BigInteger(input);
            out.write(((n.compareTo(BigInteger.ONE) == 1 ? n.subtract(BigInteger.ONE) : "0") + "\n").getBytes());
        }
        out.flush();
    }
}
