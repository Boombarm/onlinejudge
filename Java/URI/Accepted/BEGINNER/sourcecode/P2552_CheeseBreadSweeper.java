/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: Beginner 
 * @Problem: 2552 - CheeseBreadSweeper
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2552
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 5/10/17, 6:50:23 PM
 * @Runtime: 0.092s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2552_CheeseBreadSweeper {

    static int N, M;
    static int[][] board;
    static String[] in;

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        String input;
        while ((input = br.readLine()) != null) {
            in = input.split(" ");
            N = Integer.parseInt(in[0]);
            M = Integer.parseInt(in[1]);
            board = new int[N][M];
            for (int i = 0; i < N; i++) {
                in = br.readLine().split(" ");
                for (int j = 0; j < M; j++) {
                    board[i][j] = Integer.parseInt(in[j]) == 1 ? 9 : 0;
                }
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (board[i][j] == 9) {
                        bw.append(9 + "");
                        continue;
                    }

                    //top
                    if (i > 0 && board[i - 1][j] == 9) {
                        board[i][j]++;
                    }
                    //left 
                    if (j > 0 && board[i][j - 1] == 9) {
                        board[i][j]++;
                    }
                    //right
                    if (j < (M - 1) && board[i][j + 1] == 9) {
                        board[i][j]++;
                    }
                    //bottom
                    if (i < (N - 1) && board[i + 1][j] == 9) {
                        board[i][j]++;
                    }
                    bw.append(board[i][j] + "");
                }
                bw.newLine();
            }
        }
        bw.flush();
    }

}
