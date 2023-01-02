/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: MATHEMATICS
 * @Problem: 2170 - Taxes of Project
 * @Link:   https://www.urionlinejudge.com.br/judge/en/problems/view/2170
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 2/25/17, 8:43:51 PM
 * @Runtime: 0.124s
 * @Solution: ((y/x)-1)*100
 * @Note:
 */
package  URI.Accepted.MATHEMATICS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;

public class P2170_Taxes_of_Project {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        DecimalFormat formattor = new DecimalFormat("0.00");
        String line;
        int i = 1;
        while ((line = br.readLine()) != null) {
            String[] st = line.split(" ");
            double x = Double.parseDouble(st[0]);
            double y = Double.parseDouble(st[1]);
            double answer = ((y / x) - 1) * 100;
            bw.append("Projeto " + (i++) + ":\n");
            bw.append("Percentual dos juros da aplicacao: " + formattor.format(answer) + " %\n\n");
        }
        bw.flush();
    }

}
