/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1441 Hailstone Sequences
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1441
 * @Timelimit: 1 sec
 * @Status: Accepted 2/6/16, 11:25:11 PM Runtime:0.064s
 * @Solution: 
 * @Note:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P1441_Hailstone_Sequences {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        int n;
        while ((n = Integer.parseInt(br.readLine())) != 0) {
            int highest = n;
            while (n != 1) {
                if (n % 2 == 0) {
                    n = (int) (0.5 * n);
                } else {
                    n = (3 * n) + 1;
                }
                if (n > highest) {
                    highest = n;
                }
            }
            out.write((highest + "\n").getBytes());
        }
        out.flush();
    }

}
