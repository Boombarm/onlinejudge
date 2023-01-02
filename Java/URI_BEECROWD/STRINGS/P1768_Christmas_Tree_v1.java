/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1768 Christmas Tree
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1768
 * @Timelimit: 1 sec
 * @Status: Accepted 2/16/16, 7:43:49 PM Runtime:0.068s
 * @Solution:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1768_Christmas_Tree_v1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = "";
        while ((line = br.readLine()) != null) {
            int n = Integer.parseInt(line);
            int space = n / 2;
            int l = 1;
            while (l <= n) {
                for (int i = 0; i < space; i++) {
                    bw.append(" ");
                }
                for (int i = 0; i < l; i++) {
                    bw.append("*");
                }
                l += 2;
                space--;
                bw.newLine();
            }
            space = n / 2;
            String[] base = new String[]{" *", "***"};
            for (int i = 0; i < base.length; i++) {
                for (int j = 0; j < space - 1; j++) {
                    bw.append(" ");
                }
                bw.append(base[i] + "\n");
            }
            bw.newLine();
        }
        bw.flush();
    }

}
