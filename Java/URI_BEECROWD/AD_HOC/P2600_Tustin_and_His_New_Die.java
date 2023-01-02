package URI.Accepted.AD_HOC.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: AD-HOC
 * @Problem: P2600 - Tustin and His New Die
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2600
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory:
 * @Submission: 3/24/18, 2:01:12 AM
 * @Runtime: 0.056s
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class P2600_Tustin_and_His_New_Die {

    BufferedReader br;
    BufferedWriter bw;
    int[] face1 = new int[]{1, 2, 3};
    int[] face2 = new int[]{6, 5, 4};

    public P2600_Tustin_and_His_New_Die() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        loop:
        while (n-- > 0) {
            int[] diceface = new int[7];
            diceface[3] = Integer.parseInt(br.readLine());

            String[] st = br.readLine().split(" ");
            diceface[1] = Integer.parseInt(st[0]);
            diceface[2] = Integer.parseInt(st[1]);
            diceface[6] = Integer.parseInt(st[2]);
            diceface[5] = Integer.parseInt(st[3]);

            diceface[4] = Integer.parseInt(br.readLine());

            for (int i = 0; i < 3; i++) {
                if (diceface[face1[i]] + diceface[face2[i]] != 7) {
                    bw.append("NAO\n");
                    continue loop;
                }
            }
            boolean[] chk = new boolean[7];
            for (int i = 1; i <= 6; i++) {
                if (diceface[i] <= 6) {
                    chk[diceface[i]] = true;
                }
            }
            int sum = 0;
            for (int i = 1; i <= 6; i++) {
                if (chk[i]) {
                    sum++;
                }
            }
            bw.append(sum == 6 ? "SIM\n" : "NAO\n");
        }
        bw.flush();
    }

}
