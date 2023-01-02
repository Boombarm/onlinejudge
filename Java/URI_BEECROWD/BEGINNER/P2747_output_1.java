package URI.Accepted.BEGINNER.sourcecode;
/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: BEGINNER
 * @Problem: 2747 - Output 1
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2747
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory: 552 Bytes
 * @Submission: 5/16/18, 11:08:24 AM
 * @Runtime: 0.052s
 * @Solution:
 * @Note:
 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class P2747_output_1 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.append("---------------------------------------\n");
        for (int i = 0; i < 5; i++) {
            bw.append("|                                     |\n");
        }
        bw.append("---------------------------------------");
        bw.flush();
    }

}
