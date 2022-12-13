/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1793 Escalator
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1793
 * @Timelimit: 1 sec
 * @Status: Accepted 05/01/2016 - 09:16:14 Runtime:0.036s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P1793_Escalator {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        int n;
        while ((n = Integer.parseInt(br.readLine())) != 0) {
            String[] st = br.readLine().split(" ");
            int activeTimes = 0;
            int a = Integer.parseInt(st[0]);
            for (int i = 1; i < n; i++) {
                int now = Integer.parseInt(st[i]);
                if (now - 10 >= a) {
                    activeTimes += 10;
                } else {
                    activeTimes += now - a;
                }
                a = now;
            }
            activeTimes += 10;
            out.write((activeTimes + "\n").getBytes());
        }
        out.flush();
    }

}
