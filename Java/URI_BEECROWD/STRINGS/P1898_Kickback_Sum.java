/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1898 Kickback Sum
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1898
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 2/18/16, 10:10:43 PM
 * @Runtime: 0.044s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;

public class P1898_Kickback_Sum {

    public static void main(String[] args) throws IOException {
        DecimalFormat df = new DecimalFormat(".00");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String row1 = br.readLine().replaceAll("[^\\d.]", "");//replace all non-numberic
        String row2 = br.readLine().replaceAll("[^\\d.]", "");
        String cpf = row1.substring(0, 11);
        double a = Double.valueOf(row1.substring(11, row1.length()));
        double b = Double.parseDouble(row2);
        a = Math.floor(a * 100) / 100;
        b = Math.floor(b * 100) / 100;
        bw.write("cpf " + cpf + "\n");
        bw.write(df.format(a + b) + "\n");
        bw.flush();
    }

}
