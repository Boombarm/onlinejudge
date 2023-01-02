package URI.Accepted.BEGINNER.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: BEGINNER
 * @Problem: 2861 : The Output
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2861
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory: 601 Bytes
 * @Submission: 9/27/18, 11:05:15 PM
 * @Runtime: 0.076s
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2861_The_Output {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            br.readLine();
            bw.append("gzuz\n");
        }
        bw.flush();
    }
}
