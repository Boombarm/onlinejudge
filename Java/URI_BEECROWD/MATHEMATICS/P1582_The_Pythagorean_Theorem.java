/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1582 The Pythagorean Theorem
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1582
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/18/16, 4:13:15 PM
 * @Runtime: 0.028s
 * @Solution: mdc Euclid algorithm
 * @Note:
 */
package  URI.Accepted.MATHEMATICS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1582_The_Pythagorean_Theorem {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while ((input = br.readLine()) != null) {
            String[] st = input.split(" ");
            int x = Integer.parseInt(st[0]);
            int y = Integer.parseInt(st[1]);
            int z = Integer.parseInt(st[2]);
            int p1 = 0, p2 = 0, p3 = 0;
            if (x >= z && x >= y) {
                p1 = x;
                p2 = y;
                p3 = z;
            } else if (y >= x && y >= z) {
                p1 = y;
                p2 = x;
                p3 = z;
            } else if (z >= x && z >= y) {
                p1 = z;
                p2 = x;
                p3 = y;
            }

            bw.append("tripla" + (isPythagorean(p1, p2, p3) ? " pitagorica" + (isPrimitive(p1, p2, p3) ? " primitiva" : "") : "") + "\n");
            bw.flush();
        }
        bw.flush();
    }

    private static boolean isPythagorean(int x, int y, int z) {
        return (x * x) == ((y * y) + (z * z));
    }

    private static boolean isPrimitive(int x, int y, int z) {
        return mdc(mdc(x, y), z) == 1;
    }

    private static int mdc(int a, int b) {
        int r;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

}
