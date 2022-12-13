/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2152 Pepe, I Already Took the Candle!
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2152
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 10/27/16, 7:00:35 AM
 * @Runtime: 0.092s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;

public class P2152_Pepe_I_Already_Took_the_Candle {

    static BufferedReader br;
    static BufferedWriter bw;
    static DecimalFormat formatter1;
    static DecimalFormat formatter2;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        formatter1 = new DecimalFormat("00");
        formatter2 = new DecimalFormat("00");
        int n = Integer.parseInt(br.readLine());
        String[] st;
        while (n-- > 0) {
            st = br.readLine().split(" ");
            int h = Integer.parseInt(st[0]);
            int m = Integer.parseInt(st[1]);
            int o = Integer.parseInt(st[2]);
            bw.append(formatter1.format(h) + ":" + formatter2.format(m) + " - A porta " + (o == 1 ? "abriu!" : "fechou!") + "\n");
        }
        bw.flush();
    }

}
