/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1849 Dracarys!
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1849
 * @Timelimit: 1 sec
 * @Status: Accepted 17/01/2016 - 15:30:26 Runtime:0.044s
 * @Solution: find biggest possible square size
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P1849_Dracarys {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        String[] st = br.readLine().split(" ");
        int dimension[] = new int[4];
        for (int i = 0; i < 4; i++) {
            dimension[i] = Integer.parseInt(st[i]);
        }

        int posible = 0;
        int side1 = dimension[0] + dimension[2];
        int side2 = Math.min(dimension[1], dimension[3]);
        int min = Math.min(side1, side2);
        if (min > posible) {
            posible = min;
        }

        side1 = dimension[0] + dimension[3];
        side2 = Math.min(dimension[1], dimension[2]);
        min = Math.min(side1, side2);
        if (min > posible) {
            posible = min;
        }

        side1 = dimension[0] + dimension[3];
        side2 = Math.min(dimension[1], dimension[2]);
        min = Math.min(side1, side2);
        if (min > posible) {
            posible = min;
        }

        side1 = dimension[1] + dimension[2];
        side2 = Math.min(dimension[0], dimension[3]);
        min = Math.min(side1, side2);
        if (min > posible) {
            posible = min;
        }

        side1 = dimension[1] + dimension[3];
        side2 = Math.min(dimension[0], dimension[2]);
        min = Math.min(side1, side2);
        if (min > posible) {
            posible = min;
        }

        int answer = posible * posible;
        out.write((answer + "\n").getBytes());
        out.flush();
    }

}
