/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1963 The Motion Picture
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1963
 * @Timelimit: 1 sec
 * @Status: Accepted 30/10/2015 - 17:39:07 Runtime:0.068s
 * @Solution:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class P1963_The_Motion_Picture {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.HALF_EVEN);
        String[] input = br.readLine().split(" ");
        double a = Double.valueOf(input[0]);
        double b = Double.valueOf(input[1]);
        double c = b - a;
        double answer = (c * 100) / a;
        System.out.println(df.format(answer) + "%");
    }

}
