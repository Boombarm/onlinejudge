/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: AD-HOC
 * @Problem: 2515 - Cracker
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2515
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 6/19/17, 8:05:37 PM
 * @Runtime: 0.252s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2515_Cracker {

    static int Marcos, Leonardo;

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        String input;
        while ((input = br.readLine()) != null) {
            int n = Integer.parseInt(input);
            String[] st = br.readLine().split(" ");
            int lCracker = 0, rCracker = 0;
            int lCursor = 0;
            int rCursor = n - 1;
            while (lCursor <= rCursor) {
                if (lCracker <= rCracker) {
                    lCracker += Integer.parseInt(st[lCursor]);
                    lCursor++;
                } else {
                    rCracker += Integer.parseInt(st[rCursor]);
                    rCursor--;
                }
            }
            if (lCracker < rCracker) {
                Marcos = lCracker;
                Leonardo = rCracker;
            } else {
                Marcos = rCracker;
                Leonardo = lCracker;
            }

            bw.append(Marcos + " " + Leonardo + "\n");
        }
        bw.flush();
    }

}
