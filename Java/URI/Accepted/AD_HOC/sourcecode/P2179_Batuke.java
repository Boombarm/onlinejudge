/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge:URI Online Judge
 * @Categories: AD-HOC
 * @Problem: 2179 - Batuke
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2179
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 2/13/17, 8:51:25 PM
 * @Runtime: 0.052s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class P2179_Batuke {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = sc.nextInt();
        int row = sc.nextInt();
        int colum = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0, k = 1; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                matrix[i][j - 1] = k++;
            }
        }

        bw.append("" + matrix[row][colum]);
        int allCell = n * n;
        int visit = 1;
        int walk = 1;
        int limit = 0;
        loop:
        while (visit < allCell) {
            limit++;
            //Right 
            for (int i = 0; i < limit; i++) {
                if (colum == n) {
                    int out = limit - i;
                    colum += out;
                    walk += out;
                    break;
                }
                colum++;
                walk++;
                if (row >= 0 && row < n && colum >= 0 && colum < n) {
                    bw.append(" " + matrix[row][colum]);
                    if (++visit == allCell) {
                        break loop;
                    }
                }
            }

            //down
            for (int i = 0; i < limit; i++) {
                if (row == n) {
                    int out = limit - i;
                    row += out;
                    walk += out;
                    break;
                }
                row++;
                walk++;
                if (row >= 0 && row < n && colum >= 0 && colum < n) {
                    bw.append(" " + matrix[row][colum]);
                    if (++visit == allCell) {
                        break loop;
                    }
                }

            }
            limit++;
            //Left
            for (int i = 0; i < limit; i++) {
                if (colum == 0) {
                    int out = limit - i;
                    colum -= out;
                    walk += out;
                    break;
                }
                colum--;
                walk++;
                if (row >= 0 && row < n && colum >= 0 && colum < n) {
                    bw.append(" " + matrix[row][colum]);
                    if (++visit == allCell) {
                        break loop;
                    }
                }
            }
            //Up
            for (int i = 0; i < limit; i++) {
                if (row == 0) {
                    int out = limit - i;
                    row -= out;
                    walk += out;
                    break;
                }
                row--;
                walk++;
                if (row >= 0 && row < n && colum >= 0 && colum < n) {
                    bw.append(" " + matrix[row][colum]);
                    if (++visit == allCell) {
                        break loop;
                    }
                }
            }
        }
        bw.append("\n" + walk + "\n");
        bw.flush();
    }

}
