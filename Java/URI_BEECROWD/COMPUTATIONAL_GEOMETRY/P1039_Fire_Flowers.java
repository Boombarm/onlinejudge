/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1039 - Fire Flowers
 * @Categories: COMPUTATIONAL GEOMETRY
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1039
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/27/16, 2:16:47 PM
 * @Runtime: 0.048s
 * @Solution:
 * @Note:
 */
package URI.Accepted.COMPUTATIONAL_GEOMETRY.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1039_Fire_Flowers {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while ((input = br.readLine()) != null) {
            String[] st = input.split(" ");
            int r1 = Integer.parseInt(st[0]);
            int x1 = Integer.parseInt(st[1]);
            int y1 = Integer.parseInt(st[2]);
            int r2 = Integer.parseInt(st[3]);
            int x2 = Integer.parseInt(st[4]);
            int y2 = Integer.parseInt(st[5]);
            bw.append((isRich(r1, x1, y1, r2, x2, y2) ? "RICO" : "MORTO") + "\n");
            bw.flush();
        }
        bw.flush();
    }

    private static boolean isRich(int r1, int x1, int y1, int r2, int x2, int y2) {
        double val = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        if ((r1 - val) >= r2) {
            return true;
        }
        return false;
    }

}
