/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1870 Fans and Balloons
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1870
 * @Timelimit: 1 sec
 * @Status: Accepted 01/12/2015 - 17:20:32 Runtime:0.028s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1870_Fans_and_Balloons {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while (!(input = br.readLine()).equals("0 0 0")) {
            String[] st = input.split(" ");
            int totalRow = Integer.parseInt(st[0]);
            int totalColum = Integer.parseInt(st[1]);
            int location = Integer.parseInt(st[2]);
            int[][] map = new int[totalRow][totalColum];
            for (int i = 0; i < totalRow; i++) {
                st = br.readLine().split(" ");
                for (int j = 0; j < totalColum; j++) {
                    map[i][j] = Integer.parseInt(st[j]);
                }
            }
            int i = 0;
            while (i < totalRow) {
                int left = 0, right = 0;
                for (int j = location - 1; j >= 0; j--) {
                    if (map[i][j] > 0) {
                        left = map[i][j];
                        break;
                    }
                }
                for (int j = location - 1; j < totalColum; j++) {
                    if (map[i][j] > 0) {
                        right = map[i][j];
                        break;
                    }
                }
                if (right > left) {
                    location -= (right - left);
                } else {
                    location += (left - right);
                }

                if (location <= 1 || location >= totalColum) {
                    bw.append("BOOM " + (i + 1) + " " + location + "\n");
                    break;
                }
                i++;
            }
            if (i == totalRow) {
                bw.append("OUT " + location + "\n");
            }
        }
        bw.flush();
    }

}
