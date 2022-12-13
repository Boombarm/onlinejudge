/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1091 Division of Nlogonia
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1091
 * @Timelimit: 1 sec
 * @Status: Accepted 03/11/2015 - 11:54:50 Runtime:0.076s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1091_Division_of_Nlogonia {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int k;
        while ((k = Integer.parseInt(br.readLine())) != 0) {
            String[] st = br.readLine().split(" ");
            int n = Integer.parseInt(st[0]);
            int m = Integer.parseInt(st[1]);
            for (int i = 0; i < k; i++) {
                st = br.readLine().split(" ");
                int x = Integer.parseInt(st[0]);
                int y = Integer.parseInt(st[1]);

                if (x == n || y == m) {
                    bw.append("divisa");
                } else if (x > n && y < m) {
                    bw.append("SE");
                } else if (x > n && y > m) {
                    bw.append("NE");
                } else if (x < n && y < m) {
                    bw.append("SO");
                } else {
                    bw.append("NO");
                }
                bw.newLine();
            }
        }
        bw.flush();
    }

}
