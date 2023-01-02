/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: Beginner
 * @Problem: 2581 - I am Toorg!
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2581
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 6/16/17, 3:35:21 PM
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

public class P2581_I_am_Toorg {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            br.readLine();
            bw.append("I am Toorg!\n");
        }
        bw.flush();
    }

}
