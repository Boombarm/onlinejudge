package AIZU.Accepted.ITP1;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: AIZU ONLINE JUDGE
 * @Categories: Structured Program II
 * @Problem: ITP1_7_C: Spreadsheet
 * @Link: http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_7_C
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory: 28360 KB
 * @Submission: 2018-03-15 15:45
 * @Runtime: 00:09 s
 * @Solution:
 * @Note: 2D array sum
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class ITP1_7_C_Spreadsheet {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] st = br.readLine().split(" ");
        int n = Integer.parseInt(st[0]);
        int m = Integer.parseInt(st[1]);
        int[][] arr = new int[n + 1][m + 1];
        for (int i = 0; i < n; i++) {
            st = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                int now = Integer.parseInt(st[j]);
                arr[i][j] = now;
                arr[i][m] += now;
                arr[n][j] += now;
                arr[n][m] += now;
            }
        }

        for (int i = 0; i <= n; i++) {
            bw.append("" + arr[i][0]);
            for (int j = 1; j <= m; j++) {
                bw.append(" " + arr[i][j]);
            }
            bw.newLine();
        }
        bw.flush();
    }


}
