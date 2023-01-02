/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1516 Image
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1516
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/16/16, 10:11:39 PM
 * @Runtime: 0.044s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1516_Image {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while (!(input = br.readLine()).equals("0 0")) {
            String[] st = input.split(" ");
            int n = Integer.parseInt(st[0]);
            int m = Integer.parseInt(st[1]);
            char[][] image = new char[n][];
            for (int i = 0; i < n; i++) {
                image[i] = br.readLine().toCharArray();
            }
            st = br.readLine().split(" ");
            int a = Integer.parseInt(st[0]);
            int b = Integer.parseInt(st[1]);
            int h = a / n;
            int w = b / m;
            for (int i = 0; i < n; i++) {
                for (int k = 0; k < h; k++) {
                    for (int j = 0; j < m; j++) {
                        char c = image[i][j];
                        for (int l = 0; l < w; l++) {
                            bw.append(c);
                        }
                    }
                    bw.newLine();
                }
            }

            bw.newLine();
        }
        bw.flush();
    }
}
