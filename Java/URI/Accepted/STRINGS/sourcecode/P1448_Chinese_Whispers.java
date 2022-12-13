/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1448 Chinese Whispers
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1448
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 2/19/16, 1:08:40 AM
 * @Runtime: 0.060s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1448_Chinese_Whispers {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        int i = 0;
        while (i++ < t) {
            int team1 = 0, team2 = 0;
            bw.write("Instancia " + i + "\n");
            char[] original = br.readLine().toCharArray();
            char[] t1 = br.readLine().toCharArray();
            char[] t2 = br.readLine().toCharArray();
            int size = original.length;
            for (int j = 0; j < size; j++) {
                if (original[j] == t1[j]) {
                    team1++;
                }
                if (original[j] == t2[j]) {
                    team2++;
                }
            }

            if (team1 == team2) {
                boolean isDraw = true;
                int winner = 0;
                int c1 = 0, c2 = 0;
                for (int j = 0; j < size; j++) {
                    if (original[j] == t1[j]) {
                        c1++;
                    }
                    if (original[j] == t2[j]) {
                        c2++;
                    }
                    if (c1 != c2) {
                        isDraw = false;
                        if (c1 > c2) {
                            winner = 1;
                        } else {
                            winner = 2;
                        }
                        break;
                    }
                }
                if (isDraw) {
                    bw.write("empate\n");
                } else {
                    bw.write(winner == 1 ? "time 1\n" : "time 2\n");
                }
            } else if (team1 > team2) {
                bw.write("time 1\n");
            } else {
                bw.write("time 2\n");
            }
            bw.newLine();
        }
        bw.flush();
    }

}
