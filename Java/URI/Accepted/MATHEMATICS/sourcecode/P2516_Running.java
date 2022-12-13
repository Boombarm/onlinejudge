/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: MATHEMATICS
 * @Problem: 2516 - Running
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2516
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/30/17, 5:43:06 PM
 * @Runtime: 0.032s
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

public class P2516_Running {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        DecimalFormat formatter = new DecimalFormat("0.00");
        String input;
        while ((input = br.readLine()) != null) {
            String[] st = input.split(" ");
            double s = Integer.parseInt(st[0]);
            double va = Integer.parseInt(st[1]);
            double vb = Integer.parseInt(st[2]);
            bw.append((va > vb ? formatter.format(s / (va - vb)) : "impossivel") + "\n");
        }
        bw.flush();
    }

}
