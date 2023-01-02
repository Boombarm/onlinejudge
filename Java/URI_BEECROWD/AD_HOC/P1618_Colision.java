/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1618 Colision
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1618
 * @Timelimit: 1 sec
 * @Status: Accepted 26/10/2015 - 04:40:36 Runtime:0.088s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P1618_Colision {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] st = br.readLine().split(" ");
            int aX = Integer.parseInt(st[0]);
            int aY = Integer.parseInt(st[1]);
            int bX = Integer.parseInt(st[2]);
            int bY = Integer.parseInt(st[3]);
            int cX = Integer.parseInt(st[4]);
            int cY = Integer.parseInt(st[5]);
            int dX = Integer.parseInt(st[6]);
            int dY = Integer.parseInt(st[7]);
            int rX = Integer.parseInt(st[8]);
            int rY = Integer.parseInt(st[9]);
            if ((rX >= aX && rY >= aY) && (rX <= bX && rY >= bY) && (rX <= cX && rY <= cY) && (rX >= dX && rY <= dY)) {
                out.write((1 + "\n").getBytes());
            } else {
                out.write((0 + "\n").getBytes());
            }
            out.flush();
        }
    }

}
