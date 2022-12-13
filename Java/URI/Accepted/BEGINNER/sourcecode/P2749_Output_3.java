package URI.Accepted.BEGINNER.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories:
 * @Problem: 2749 - Output 3
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2749
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory:
 * @Submission: 12/24/18, 1:01:25 PM
 * @Runtime: 0.052s
 * @Solution:
 * @Note:
 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

class P2749_Output_3 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = "---------------------------------------\n";
        String blank = "|                                     |\n";

        bw.append(line);

        //line 2
        bw.append("|x = 35");
        for (int i = 7; i < 38; i++) bw.append(" ");
        bw.append("|\n");

        bw.append(blank);

        //line 4
        bw.append("|");
        for (int i = 2; i < 17; i++) bw.append(" ");
        bw.append("x = 35");
        for (int i = 23; i < 39; i++) bw.append(" ");
        bw.append("|\n");
        bw.append(blank);

        //line 4
        bw.append("|");
        for (int i = 2; i < 33; i++) bw.append(" ");
        bw.append("x = 35|\n");

        bw.append(line);
        bw.flush();
    }

}
