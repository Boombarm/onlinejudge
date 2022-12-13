/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: Beginner 
 * @Problem: 2540 - Leader's Impeachment
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2540
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 5/9/17, 3:26:50 PM
 * @Runtime: 0.748s 
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2540_Leaders_Impeachment {

    static int N;
    static String[] in;
    static final double F = 2 / 3.0;

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        String input;
        while ((input = br.readLine()) != null) {
            N = Integer.parseInt(input);
            in = br.readLine().split(" ");
            double count = 0;
            for (String s : in) {
                if (s.equals("1")) {
                    count++;
                }
            }
            bw.append((count / N) >= F ? "impeachment\n" : "acusacao arquivada\n");
        }
        bw.flush();
    }

}
