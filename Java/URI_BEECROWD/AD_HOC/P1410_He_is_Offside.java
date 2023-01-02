/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1410 He is Offside!
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1410
 * @Timelimit: 1 sec
 * @Status: Accepted 02/01/2016 - 11:22:01 Runtime:0.080s
 * @Solution:
 * An attacking player is offside if he is nearer to his opponents’ goal line than the second last opponent. 
 * A player is not offside if
    he is level with the second last opponent or
    he is level with the last two opponents.
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Arrays;

public class P1410_He_is_Offside {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        String input;
        while (!(input = br.readLine()).equals("0 0")) {
            String[] st = input.split(" ");
            int a = Integer.parseInt(st[0]);
            int d = Integer.parseInt(st[1]);
            int[] attacking = new int[a];
            int[] defending = new int[d];
            st = br.readLine().split(" ");
            for (int i = 0; i < a; i++) {
                attacking[i] = Integer.parseInt(st[i]);
            }
            st = br.readLine().split(" ");
            for (int i = 0; i < d; i++) {
                defending[i] = Integer.parseInt(st[i]);
            }
            //Dual-Pivot Quicksort
            Arrays.sort(attacking);
            Arrays.sort(defending);

            if (attacking[0] < defending[1]) {
                out.write("Y\n".getBytes());
            } else {
                out.write("N\n".getBytes());
            }

        }
        out.flush();
    }
}
