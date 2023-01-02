/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: String
 * @Problem: 2356 Bacteria I
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2356
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 1/20/17, 11:07:36 PM
 * @Runtime: 0.040s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2356_Bacteria_I {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String readLine = br.readLine();
        while (readLine != null) {
            char[] d = readLine.toCharArray();
            char[] s = br.readLine().toCharArray();
            int d_length = d.length;
            int s_length = s.length;
            int i = 0;
            boolean r = false;
            while (i < d_length) {
                if ((i + s_length) <= d_length) {
                    if (d[i] == s[0]) {
                        boolean c = true;
                        for (int j = 1, k = i + 1; j < s_length; j++, k++) {
                            if (d[k] != s[j]) {
                                c = false;
                                break;
                            }
                        }
                        r = c;
                        if (r) {
                            break;
                        }
                    }
                } else {
                    break;
                }
                i++;
            }
            bw.append((r ? "Resistente" : "Nao resistente") + "\n");
            readLine = br.readLine();

        }
        bw.flush();
    }

}
