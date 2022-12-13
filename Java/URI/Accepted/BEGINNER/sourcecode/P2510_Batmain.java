/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: Beginner
 * @Problem: 2510 - Batmain
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2510
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/14/17, 1:04:15 PM
 * @Runtime: 0.032s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2510_Batmain {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            bw.append("Y\n");
        }
        bw.flush();
    }

}
