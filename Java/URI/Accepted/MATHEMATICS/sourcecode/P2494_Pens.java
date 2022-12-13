/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: MATHEMATICS
 * @Problem: 2494 - Pens
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2494
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 5/10/17, 4:58:25 PM 
 * @Runtime: 0.036s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.MATHEMATICS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2494_Pens {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedReader br = new BufferedReader(ir);
        BufferedWriter bw = new BufferedWriter(ow);
        String input;
        while ((input = br.readLine()) != null) {
            String[] in = input.split(" ");
            int a = Integer.parseInt(in[0]);
            int b = Integer.parseInt(in[1]);
            int c = Integer.parseInt(in[2]);
            double n1 = GCD(a, b);
            bw.append((n1 * c) <= (a + b) ? "sim\n" : "nao\n");
        }
        bw.flush();

    }

    public static double GCD(double a, double b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }

}
