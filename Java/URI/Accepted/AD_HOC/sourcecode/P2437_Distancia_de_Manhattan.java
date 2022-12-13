/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: AD-HOC
 * @Problem: 2437 - Distância de Manhattan
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2437
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 7/7/19, 6:40:09 PM
 * @Runtime:
 * @Solution:
 * @Note:
 */
package URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P2437_Distancia_de_Manhattan {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int xM = Integer.parseInt(st[0]);
        int yM = Integer.parseInt(st[1]);
        int xR = Integer.parseInt(st[2]);
        int yR = Integer.parseInt(st[3]);
        int x = xM > xR ? xR - xM : xM - xR;
        int y = yM > yR ? yR - yM : yM - yR;
        System.out.println(abs(x + y));
    }

    static int abs(int a) {
        return a < 0 ? -a : a;
    }

}