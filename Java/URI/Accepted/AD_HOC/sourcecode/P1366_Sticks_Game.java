/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1366 Sticks Game
 * @Link: https://www.urionlinejudge.com.br/judge/problems/view/1366/rate:1366/rating:3
 * @Timelimit: 1 sec
 * @Status: Accepted 27/12/2015 - 19:51:27 Runtime:0.084s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P1366_Sticks_Game {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        int n;
        while ((n = Integer.parseInt(br.readLine())) != 0) {
            int x = 0;
            for (int i = 0; i < n; i++) {
                String[] st = br.readLine().split(" ");
                int c = Integer.parseInt(st[0]);
                int v = Integer.parseInt(st[1]);
                x += v / 2;
            }
            out.write(((x / 2) + "\n").getBytes());
        }
        out.flush();
    }

}
