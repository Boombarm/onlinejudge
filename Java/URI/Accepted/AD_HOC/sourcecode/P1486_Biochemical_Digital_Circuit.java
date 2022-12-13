/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1486 Biochemical Digital Circuit
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1486
 * @Timelimit: 1 sec
 * @Status: Accepted 03/01/2016 - 12:30:53 Runtime:0.212s
 * @Solution: Counting  1 in vertical line (Length >= C)
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P1486_Biochemical_Digital_Circuit {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        String input;
        while (!(input = br.readLine()).equals("0 0 0")) {
            String[] st = input.split(" ");
            int p = Integer.parseInt(st[0]);
            int n = Integer.parseInt(st[1]);
            int c = Integer.parseInt(st[2]);
            int[][] circuit = new int[n][p];
            for (int i = 0; i < n; i++) {
                st = br.readLine().split(" ");
                for (int j = 0; j < p; j++) {
                    circuit[i][j] = Integer.parseInt(st[j]);
                }
            }

            int answer = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < p; j++) {
                    if (circuit[i][j] == 1) {
                        int count = 0;
                        for (int k = i; k < n; k++) {
                            if (circuit[k][j] == 1) {
                                circuit[k][j] = 0;
                                count++;
                            } else {
                                break;
                            }
                        }

                        if (count >= c) {
                            answer++;
                        }
                    }
                }
            }
            out.write((answer + "\n").getBytes());
        }
        out.flush();
    }

}
