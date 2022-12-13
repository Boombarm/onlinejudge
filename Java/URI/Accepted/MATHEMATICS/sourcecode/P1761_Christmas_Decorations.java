/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1761 Christmas Decorations
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1761
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/26/16, 8:59:12 PM
 * @Runtime: 0.124s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.MATHEMATICS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;

public class P1761_Christmas_Decorations {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        DecimalFormat df = new DecimalFormat("0.00");
        Double pi = 3.141592654;
        String input;
        while ((input = br.readLine()) != null) {
            String[] st = input.split(" ");
            double a = Double.parseDouble(st[0]);//1 - 90.00
            double b = Double.parseDouble(st[1]);//1 - 100
            double c = Double.parseDouble(st[2]);//0.50 - 1.50
            double answer = 5 * ((Math.tan(a * (pi / 180)) * b) + c);
            bw.append(df.format(answer) + "\n");
        }
        bw.flush();
    }

}
