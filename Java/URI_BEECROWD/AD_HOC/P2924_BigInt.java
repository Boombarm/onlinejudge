/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: AD-HOC
 * @Problem: 2924 - BigInt
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2924
 * @Timelimit:
 * @Status: Accepted
 * @Submission: 3/31/19, 5:53:47 PM
 * @Runtime: 0.080s
 * @Solution: BigInteger
 * @Note:
 */
package URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;

public class P2924_BigInt {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger a = new BigInteger(br.readLine());
        BigInteger b = new BigInteger(br.readLine());
        System.out.println(a.add(b));
    }

}