/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: AD-HOC
 * @Problem:  2530 - Cheating
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2530
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 4/27/17, 11:25:42 AM
 * @Runtime: 0.376s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2530_Cheating {

    static int n, m;
    static String[] in;
    static int[] Juan, Ricardinho;

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        String input;
        while ((input = br.readLine()) != null) {
            in = input.split(" ");
            n = Integer.parseInt(in[0]);
            m = Integer.parseInt(in[1]);
            Juan = new int[n];
            Ricardinho = new int[m];
            in = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                Juan[i] = Integer.parseInt(in[i]);
            }
            in = br.readLine().split(" ");
            boolean c = false;
            if (n >= m) {
                int j = 0;
                int t = 0;
                for (int i = 0; i < m; i++) {
                    int now = Ricardinho[i] = Integer.parseInt(in[i]);
                    for (; j < n; j++) {
                        if (now == Juan[j]) {
                            t++;
                            break;
                        }
                    }
                }
                if (t == m) {
                    c = true;
                }
            }
            bw.append((c ? "sim" : "nao") + "\n");
        }
        bw.flush();
    }

}
