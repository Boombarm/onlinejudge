package URI.Accepted.COMPUTATIONAL_GEOMETRY.sourcecode;


/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: BEGINNER
 * @Problem: 2840 - Balloon++
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2840
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 1/28/19, 11:33:19 PM
 * @Runtime: 0.080s
 * @Solution:
 * @Note: v = (4/3) * (π*r³)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class P2840_Balloon_plus_plus {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        BigDecimal R = new BigDecimal(st[0]);
        BigDecimal L = new BigDecimal(st[1]);
        BigDecimal A = BigDecimal.valueOf(4.0);
        BigDecimal B = BigDecimal.valueOf(3.0);
        BigDecimal PI = new BigDecimal("3.1415");
        BigDecimal powR3 = R.pow(3);
        BigDecimal V = A.divide(B, 32, RoundingMode.HALF_UP);
        V = V.multiply(PI.multiply(powR3));
        int count = 0;
        while (V.compareTo(L) < 0) {
            L = L.subtract(V);
            count++;
        }
        System.out.println(count);
    }


}
