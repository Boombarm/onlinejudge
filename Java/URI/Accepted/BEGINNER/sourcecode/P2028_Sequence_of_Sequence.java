/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2028 Sequence of Sequence
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2028
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 2/29/16, 10:13:33 AM
 * @Runtime: 0.220s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2028_Sequence_of_Sequence {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        int i = 1;
        while ((input = br.readLine()) != null) {
            int n = Integer.parseInt(input);
            bw.append("Caso " + i + ": " + (n == 0 ? "1 numero" : (((((n * (n + 1)) / 2)) + 1)) + " numeros") + "\n");
            int c = 1;
            int num = 0;
            bw.append(num + "");
            while (c <= n + 1) {
                int k = 0;
                while (k < c - 1) {
                    bw.append(" " + num);
                    k++;
                }
                num = c;
                c++;
            }
            bw.newLine();
            bw.newLine();
            i++;
        }
        bw.flush();
    }

}
