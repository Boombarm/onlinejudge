/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: DATA STRUCTURES AND LIBRARIES
 * @Problem: 1520 - Screws and Nuts
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1520
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/20/17, 3:16:42 PM
 * @Runtime: 0.124s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1520_Screws_and_Nuts {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        int[] productsSize;
        String input;
        while ((input = br.readLine()) != null) {
            if (input.isEmpty()) {
                continue;
            }
            int n = Integer.parseInt(input);
            productsSize = new int[101];
            int min = 100;
            int max = 0;
            String[] st;
            while (n-- > 0) {
                st = br.readLine().split(" ");
                int i = Integer.parseInt(st[0]);
                int j = Integer.parseInt(st[1]);
                if (i < min) {
                    min = i;
                }
                if (j > max) {
                    max = j;
                }
                for (; i <= j; ++i) {
                    productsSize[i]++;
                }
            }
            int find = Integer.parseInt(br.readLine());
            int start = 0, end = 0;
            boolean found;
            if (productsSize[find] == 0 || find < min || find > max) {
                found = false;
            } else {
                found = true;
                for (int i = min; i < find; i++) {
                    if (productsSize[i] != 0) {
                        start += productsSize[i];
                    }
                }
                end = (start + productsSize[find]) - 1;
            }
            bw.append(find + (found ? " found from " + start + " to " + end : " not found") + "\n");
        }
        bw.flush();
    }

}
