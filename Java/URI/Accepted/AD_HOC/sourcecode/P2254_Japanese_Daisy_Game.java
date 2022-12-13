/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: Ad-Hoc
 * @Problem: 2254 Japanese Daisy Game
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2254
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 2/11/19, 1:57:09 AM
 * @Runtime: 0.144s
 * @Solution:
 * @Note:
 */
package URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P2254_Japanese_Daisy_Game {

    static int[] power = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048,
            4096, 8192, 16384, 32768, 65536, 131072, 262144,
            524288, 1048576, 2097152, 4194304, 8388608, 16777216,
            33554432, 67108864, 134217728, 268435456, 536870912,
            1073741824};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while ((input = br.readLine()) != null) {
            int n = Integer.parseInt(input);
            int count = 0;
            while (n > 0) {
                for (int i = 0; i < 31; i++) {
                    if (power[i] > n) {
                        n %= power[i - 1];
                        count++;
                        break;
                    }
                }
            }
            bw.append("she loves " + (count % 2 == 0 ? "not" : "me") + "\n");
        }
        bw.flush();
    }

}
