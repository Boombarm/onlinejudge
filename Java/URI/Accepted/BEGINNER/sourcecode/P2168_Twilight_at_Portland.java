/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2168 Twilight at Portland
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2168
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 11/21/16, 8:12:09 PM
 * @Runtime: 0.056s
 * @Solution: sum of 4 block >= 2 = S ,sum of 4 block < 2 = U 
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2168_Twilight_at_Portland {

    static BufferedReader br;
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[][] corner = new String[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            corner[i] = br.readLine().split(" ");
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int safe = 0;
                if (corner[i][j].equals("1")) {
                    safe++;
                }
                if (corner[i][j + 1].equals("1")) {
                    safe++;
                    if (safe == 2) {
                        bw.append("S");
                        continue;
                    }
                }
                if (corner[i + 1][j].equals("1")) {
                    safe++;
                    if (safe == 2) {
                        bw.append("S");
                        continue;
                    }
                }
                if (corner[i + 1][j + 1].equals("1")) {
                    safe++;
                    if (safe == 2) {
                        bw.append("S");
                        continue;
                    }
                }
                bw.append("U");
            }
            bw.newLine();
        }
        bw.flush();
    }

}
