/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: Beginner
 * @Problem: 2554 - Pizza Before BH
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2554
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 5/9/17, 3:58:48 PM
 * @Runtime: 0.048s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2554_Pizza_Before_BH {

    static int N, D;
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
            D = Integer.parseInt(in[1]);
            String date = "Pizza antes de FdI";
            boolean found = false;
            for (int i = 0; i < D; i++) {
                input = br.readLine();
                if (!found) {
                    in = input.split(" ");
                    boolean c = true;
                    for (int j = 1; j <= N; j++) {
                        if (in[j].equals("0")) {
                            c = false;
                            break;
                        }
                    }
                    if (c) {
                        date = in[0];
                        found = true;
                    }
                }
            }
            bw.append(date + "\n");
        }
        bw.flush();
    }

}
