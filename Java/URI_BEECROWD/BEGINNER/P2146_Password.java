/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2146 Password
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2146
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 10/2/16, 3:36:11 AM
 * @Runtime: 0.052
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2146_Password {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while ((input = br.readLine()) != null) {
            int n = Integer.parseInt(input);
            bw.append((n - 1) + "\n");
        }
        bw.flush();
    }

}
