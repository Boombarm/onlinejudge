/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1958 Scientific Notation
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1958
 * @Timelimit: 1 sec
 * @Status: Accepted 06/11/2015 - 05:18:03 Runtime:0.060s
 * @Solution:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class P1958_Scientific_Notation {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        BigDecimal number = new BigDecimal(input);
        NumberFormat formatter = new DecimalFormat("0.0000E00");
        String answer = formatter.format(number);
        if (!answer.contains("E-")) { //don't blast a negative sign
            answer = answer.replace("E", "E+");
        }
        if (input.charAt(0) != '-') {
            answer = "+" + answer;
        } else {
            if (answer.charAt(0) != '-') {
                answer = "-" + answer;
            }
        }

        System.out.println(answer);
    }

}
