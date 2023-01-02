package URI.Accepted.BEGINNER.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: BEGINNER
 * @Problem: 2766 - Input and Output Reading and Skipping Names
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2766
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 9/19/18, 3:05:00 PM
 * @Runtime: 0.084s
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P2766_Input_and_Output_Reading_and_Skipping_Names {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int c = 1;
        while (c <= 10) {
            String name = br.readLine();
            if (c == 3 || c == 7 || c == 9) {
                bw.append(name + "\n");
            }
            c++;
        }
        bw.flush();

    }
}
