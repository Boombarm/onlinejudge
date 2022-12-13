/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: BEGINNER
 * @Problem: 2523 - Will's Message
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2523
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/29/17, 5:12:53 AM 
 * @Runtime: 0.068s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2523_Wills_Message {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        String input;
        while ((input = br.readLine()) != null) {
            char[] c = input.toCharArray();
            int n = Integer.parseInt(br.readLine());
            String[] st = br.readLine().split(" ");
            int i = 0;
            while (n-- > 0) {
                bw.append(c[Integer.parseInt(st[i++]) - 1]);
            }
            bw.newLine();
        }
        bw.flush();
    }

}
