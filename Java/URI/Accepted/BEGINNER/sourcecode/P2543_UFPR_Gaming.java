/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: Beginner
 * @Problem: 2543 - UFPR Gaming
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2543
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 5/9/17, 3:00:17 PM
 * @Runtime: 0.092s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2543_UFPR_Gaming {

    static int N, ID;
    static String[] in;

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        String input;
        while ((input = br.readLine()) != null) {
            in = input.split(" ");
            N = Integer.parseInt(in[0]);
            ID = Integer.parseInt(in[1]);
            int i, cout = 0;
            while (N-- > 0) {
                input = br.readLine();
                if (input.endsWith("1")) {
                    continue;
                }
                in = input.split(" ");
                i = Integer.parseInt(in[0]);
                if (ID == i) {
                    cout++;
                }
            }
            bw.append(cout + "\n");
        }
        bw.flush();
    }

}
