package  URI.Accepted.MATHEMATICS.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1169 Grains in a Chess Board https://www.urionlinejudge.com.br/judge/en/problems/view/1169
//Accepted 16/10/2015 - 09:37:49 Runtime:0.052s
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P1169_Grains_in_a_Chess_Board {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            BigInteger sum = BigInteger.ONE;
            for (int j = 1; j <= m; j++) {
                sum = sum.multiply(BigInteger.valueOf(2));
            }
            sum = sum.divide(BigInteger.valueOf(12));
            sum = sum.divide(BigInteger.valueOf(1000));
            System.out.println(sum.toString() + " kg");
        }

    }

}
