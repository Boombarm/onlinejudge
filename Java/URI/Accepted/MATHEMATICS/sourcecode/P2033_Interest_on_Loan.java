/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: MATHEMATICS
 * @Problem: 2033 - Interest on Loan
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2033
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 2/21/17, 6:22:08 PM
 * @Runtime: 0.040s
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

public class P2033_Interest_on_Loan {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        DecimalFormat formatter = new DecimalFormat("0.00");
        String input;
        while ((input = br.readLine()) != null) {
            double loanAmount = Double.parseDouble(input);
            double interestRate = Double.parseDouble(br.readLine());
            int month = Integer.parseInt(br.readLine());
            double diff_borrowed_and_final = ((loanAmount * interestRate) * month);
            double a = loanAmount;
            for (int i = 0; i < month; i++) {
                a += (a * interestRate);
            }
            bw.append("DIFERENCA DE VALOR = " + formatter.format((a - loanAmount) - diff_borrowed_and_final) + "\n");
            bw.append("JUROS SIMPLES = " + formatter.format(diff_borrowed_and_final) + "\n");
            bw.append("JUROS COMPOSTO = " + formatter.format(a - loanAmount) + "\n");
        }
        bw.flush();
    }

}
