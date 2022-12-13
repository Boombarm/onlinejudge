/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1305 Cut Off Rounder
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1305
 * @Timelimit: 1 sec
 * @Status: Accepted 19/10/2015 - 12:25:34 Runtime:0.136s
 * @Solution:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1305_Cut_Off_Rounder {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s1 = "";
        while ((s1 = br.readLine()) != null) {
            double num1 = Double.parseDouble(s1);
            double num2 = Double.parseDouble(br.readLine());
            double cutoff = (double) (num1 - (int) num1);
            bw.append(cutoff >= num2 ? (int) (num1 + 1) + "" : (int) num1 + "");
            bw.newLine();
            bw.flush();
        }
    }

}
