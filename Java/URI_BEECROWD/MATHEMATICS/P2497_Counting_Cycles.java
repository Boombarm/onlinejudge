/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: MATHEMATICS
 * @Problem: 2497 - Counting Cycles
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2497
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/18/17, 4:53:13 PM
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

public class P2497_Counting_Cycles {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        String input;
        int testCase = 1;
        while (!(input = br.readLine()).equals("-1")) {
            int n = Integer.parseInt(input);
            bw.append("Experiment " + (testCase++) + ": " + (n / 2) + " full cycle(s)\n");
        }
        bw.flush();
    }

}
