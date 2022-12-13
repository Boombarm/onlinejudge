/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: String
 * @Problem: 2484 Abracadabra
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2484
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 1/20/17, 2:49:25 PM
 * @Runtime: 0.116s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2484_Abracadabra {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while ((input = br.readLine()) != null) {
            char[] c = input.toCharArray();
            int length = input.length();
            int end = length;
            int spac = 0;
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < spac; j++) {
                    bw.append(" ");
                }
                for (int j = 0; j < end; j++) {
                    bw.append((j == 0 ? "" : " ") + c[j]);
                }
                bw.newLine();
                end--;
                spac++;
            }
            bw.newLine();
        }
        bw.flush();
    }

}
