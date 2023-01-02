/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1768 Christmas Tree
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1768
 * @Timelimit: 1 sec
 * @Status: Accepted 2/16/16, 7:18:37 PM Runtime: 0.056s
 * @Solution:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1768_Christmas_Tree_v2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = "";
        while ((line = br.readLine()) != null) {
            int n = Integer.parseInt(line);
            int i = 1;
            int t = n / 2;
            while (i <= n) {
                for (int j = 0; j < t; ++j) {
                    bw.append(" ");
                }
                for (int j = 0; j < i; ++j) {
                    bw.append("*");
                }

                i += 2;
                t--;
                bw.newLine();
            }

            //Building Base
            i = 1;
            t = n / 2;
            while (i <= 3) {
                for (int j = 0; j < t; ++j) {
                    bw.append(" ");
                }
                for (int j = 0; j < i; ++j) {
                    bw.append("*");
                }

                i += 2;
                t--;
                bw.newLine();
            }
            bw.newLine();
        }
        bw.flush();
    }

}
