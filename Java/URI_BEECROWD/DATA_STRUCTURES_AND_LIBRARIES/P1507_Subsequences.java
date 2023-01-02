/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: DATA STRUCTURES AND LIBRARIES
 * @Problem: 1507 - Subsequences
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1507
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/18/17, 7:36:25 PM
 * @Runtime: 0.060s 
 * @Solution:
 * @Note:
 */
package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1507_Subsequences {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        int testcase = Integer.parseInt(br.readLine());
        while (testcase-- > 0) {
            char[] text = br.readLine().toCharArray();
            int textSize = text.length;
            int n = Integer.parseInt(br.readLine());
            while (n-- > 0) {
                char[] sequence = br.readLine().toCharArray();
                int sequenceSize = sequence.length;
                int j = 0;
                for (int i = 0; i < textSize; i++) {
                    if (text[i] == sequence[j]) {
                        j++;
                        if (j == sequenceSize) {
                            break;
                        }
                    }
                }
                bw.append((j == sequenceSize ? "Yes" : "No") + "\n");
            }
        }
        bw.flush();
    }

}
