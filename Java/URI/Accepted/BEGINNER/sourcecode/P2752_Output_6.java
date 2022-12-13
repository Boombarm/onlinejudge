package URI.Accepted.BEGINNER.sourcecode;


/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: BEGINNER
 * @Problem: 2752 - Output 6
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2752
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 12/24/18, 4:55:26 PM
 * @Runtime: 0.044s
 * @Solution:
 * @Note:
 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class P2752_Output_6 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = "AMO FAZER EXERCICIO NO URI";
        bw.append("<" + String.format("%s", s) + ">\n");
        bw.append("<" + String.format("%30s", s) + ">\n");
        bw.append("<" + String.format("%.20s", s) + ">\n");
        bw.append("<" + String.format("%-20s", s) + ">\n");
        bw.append("<" + String.format("%-30s", s) + ">\n");
        bw.append("<" + String.format("%.30s", s) + ">\n");
        bw.append("<" + String.format("%30.20s", s) + ">\n");
        bw.append("<" + String.format("%-30.20s", s) + ">\n");
        bw.flush();
    }

}
