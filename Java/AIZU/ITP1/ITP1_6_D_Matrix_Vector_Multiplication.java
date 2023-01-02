package AIZU.Accepted.ITP1;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: AIZU ONLINE JUDGE
 * @Categories: ITP1
 * @Problem: ITP1_6_D: Matrix Vector Multiplication
 * @Link: http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_6_D
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory: 24448 KB
 * @Submission: 2018-09-13 15:10
 * @Runtime: 00:06 s
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class ITP1_6_D_Matrix_Vector_Multiplication {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] st = br.readLine().split(" ");
        int n = Integer.parseInt(st[0]);
        int m = Integer.parseInt(st[1]);
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(st[j]);
            }
        }
        int[] mul = new int[m];
        for (int i = 0; i < m; i++) {
            mul[i] = Integer.parseInt(br.readLine());
        }
        // calculate
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += matrix[i][j] * mul[j];
            }
            bw.append(sum + "\n");
        }


        bw.flush();
    }
}
