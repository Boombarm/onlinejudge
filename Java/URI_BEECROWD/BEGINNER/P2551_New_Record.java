/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: Beginner
 * @Problem: 2551 - New Record
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2551
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 5/10/17, 7:33:15 PM
 * @Runtime: 0.040s 
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2551_New_Record {

    static int N;
    static double T, D;
    static String[] in;

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        String input;
        while ((input = br.readLine()) != null) {
            N = Integer.parseInt(input);
            double record = 0.0;
            int r = 1;
            while (N-- > 0) {
                in = br.readLine().split(" ");
                T = Integer.parseInt(in[0]);
                D = Integer.parseInt(in[1]);
                double newRecord = D / T;
                if (newRecord > record) {
                    bw.append(r + "\n");
                    record = newRecord;
                }
                r++;
            }
        }
        bw.flush();
    }

}
