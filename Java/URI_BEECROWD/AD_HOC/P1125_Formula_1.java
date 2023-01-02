/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem:1125 Formula 1
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1125
 * @Timelimit: 1 sec
 * @Status: Accepted 27/12/2015 - 15:21:27 Runtime:0.068s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P1125_Formula_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while (!(input = br.readLine()).equals("0 0")) {
            String[] st = input.split(" ");
            int g = Integer.parseInt(st[0]);
            int p = Integer.parseInt(st[1]);
            int[][] place = new int[p][g];
            for (int i = 0; i < g; ++i) {
                st = br.readLine().split(" ");
                for (int j = 0; j < p; ++j) {
                    int point = Integer.parseInt(st[j]);
                    place[point - 1][i] = j;
                }
            }

            int s = Integer.parseInt(br.readLine());
            while (s-- > 0) {
                int[] score = new int[p];
                StringTokenizer stk = new StringTokenizer(br.readLine());
                int k = Integer.parseInt(stk.nextToken());
                for (int i = 0; i < k; ++i) {
                    int val = Integer.parseInt(stk.nextToken());
                    for (int pilot : place[i]) {
                        score[pilot] += val;
                    }
                }

                //Finding World Champions
                int maxScore = 0;
                for (int i = 0; i < p; ++i) {
                    if (score[i] > maxScore) {
                        maxScore = score[i];
                    }
                }

                boolean printed = false;
                for (int i = 0; i < p; i++) {
                    if (score[i] == maxScore) {
                        if (printed) {
                            bw.append(" " + (i + 1));
                        } else {
                            bw.append((i + 1) + "");
                            printed = true;
                        }
                    }
                }
                bw.newLine();
            }
        }
        bw.flush();

    }

}
