/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1620 Delaunay Triangulation
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1620
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/26/16, 9:48:24 PM
 * @Runtime: 0.048s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.MATHEMATICS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;

public class P1620_Delaunay_Triangulation {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        DecimalFormat df = new DecimalFormat("0.000000");
        String input;
        double x;
        while (!(input = br.readLine()).equals("0")) {
            BigInteger l = new BigDecimal(input).toBigInteger();
            BigInteger i = l.multiply(BigInteger.valueOf(2));
            i = i.subtract(BigInteger.valueOf(3));
            i = i.subtract(l);
            x = i.doubleValue() / l.doubleValue();
            bw.append(df.format(x) + "\n");
        }
        bw.flush();
    }

}
