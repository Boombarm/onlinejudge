package URI.Accepted.BEGINNER.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2753 - Output 7
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2753
 * @Level: 1
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 9/27/18, 8:12:07 PM
 * @Runtime: 0.064s
 * @Solution:
 * @Note:
 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class P2753_Output_7 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 'a'; i <= 'z'; i++) {
            bw.append(i + " e " + (char) i + "\n");
        }
        bw.flush();
    }
}
