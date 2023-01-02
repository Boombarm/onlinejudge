/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1426 Add Bricks in The Wall
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1426
 * @Timelimit: 1 sec
 * @Status: Accepted 08/01/2016 - 11:43:22 Runtime:0.060s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;

public class P1426_Add_Bricks_in_The_Wall {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        int n = Integer.parseInt(br.readLine());
        ArrayList<int[]> struck = new ArrayList<int[]>();
        for (int i = 1; i <= 9; i++) {
            struck.add(new int[i]);
        }
        while (n-- > 0) {
            for (int i = 0; i < 9; i += 2) {
                String[] st = br.readLine().split(" ");
                for (int j = 0, k = 0; j < st.length; j++, k += 2) {
                    struck.get(i)[k] = Integer.parseInt(st[j]);
                }
            }

            for (int i = 0; i < 8; i += 2) {
                for (int j = 0; j <= (i + 1); j += 2) {
                    struck.get(i + 2)[j + 1] = (struck.get(i)[j] - struck.get(i + 2)[j] - struck.get(i + 2)[j + 2]) / 2;
                    struck.get(i + 1)[j] = struck.get(i + 2)[j] + struck.get(i + 2)[j + 1];
                    struck.get(i + 1)[j + 1] = struck.get(i + 2)[j + 1] + struck.get(i + 2)[j + 2];
                }
            }

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < struck.get(i).length; j++) {
                    out.write((j == 0 ? "" + struck.get(i)[j] : " " + struck.get(i)[j]).getBytes());
                }
                out.write(("\n").getBytes());
            }
        }
        out.flush();
    }

}
