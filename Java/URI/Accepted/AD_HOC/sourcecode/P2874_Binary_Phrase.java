package URI.Accepted.AD_HOC.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: AD-HOC
 * @Problem: 2874 : Binary Phrase
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2874
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 9/28/18, 11:36:35 AM
 * @Runtime: 0.116s
 * @Solution: convert binary to ascii code
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P2874_Binary_Phrase {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while ((input = br.readLine()) != null) {
            int n = Integer.parseInt(input);
            while (n-- > 0) {
                String ascii = br.readLine();
                bw.append((char) Integer.parseInt(ascii, 2));
            }
            bw.newLine();
        }
        bw.flush();
    }
}
