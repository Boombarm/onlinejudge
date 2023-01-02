/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: String 
 * @Problem: 2062 OBI URI
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2062
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 1/21/17, 3:42:56 PM
 * @Runtime: 0.044s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2062_OBI_URI {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        br.readLine();
        String[] st = br.readLine().split(" ");
        boolean printed = false;
        for (String s : st) {
            if (s.length() <= 3) {
                if (s.charAt(0) == 'O' && s.charAt(1) == 'B') {
                    s = "OBI";
                } else if (s.charAt(0) == 'U' && s.charAt(1) == 'R') {
                    s = "URI";
                }
            }
            if (printed) {
                bw.append(" " + s);
            } else {
                bw.append("" + s);
                printed = true;
            }
        }
        bw.newLine();
        bw.flush();
    }

}
