/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1147 Knight Scape
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1147
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/2/16, 6:23:17 PM
 * @Runtime: 0.032s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1147_Knight_Scape {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] board;
        String input;
        int i = 1;
        while (!(input = br.readLine()).endsWith("0")) {
            bw.append("Caso de Teste #" + i + ": ");
            board = new int[8][8];
            int x, y;
            //marking pawn
            for (int j = 0; j < 8; j++) {
                String p = br.readLine();
                y = p.charAt(0) - '1';
                x = p.charAt(1) - 'a';
                if (y > 0) {
                    if (x > 0) {
                        board[y - 1][x - 1] = 1;
                    }
                    if (x < 7) {
                        board[y - 1][x + 1] = 1;
                    }
                }
            }

            int knightX = input.charAt(1) - 'a';
            int knightY = input.charAt(0) - '1';
            int secure = 0;

            //left 
            if (knightX - 2 >= 0) {
                //top
                if (knightY > 0) {
                    if (board[knightY - 1][knightX - 2] == 0) {
                        secure++;
                    }
                }
                //bottom
                if (knightY < 7) {
                    if (board[knightY + 1][knightX - 2] == 0) {
                        secure++;
                    }
                }

            }

            //right
            if (knightX + 2 <= 7) {
                //top
                if (knightY > 0) {
                    if (board[knightY - 1][knightX + 2] == 0) {
                        secure++;
                    }
                }

                //bottom
                if (knightY < 7) {
                    if (board[knightY + 1][knightX + 2] == 0) {
                        secure++;
                    }
                }
            }

            //top
            if (knightY - 2 >= 0) {
                //left
                if (knightX > 0) {
                    if (board[knightY - 2][knightX - 1] == 0) {
                        secure++;
                    }
                }

                //right
                if (knightX < 7) {
                    if (board[knightY - 2][knightX + 1] == 0) {
                        secure++;
                    }
                }
            }

            //bot
            if (knightY + 2 <= 7) {
                //left
                if (knightX > 0) {
                    if (board[knightY + 2][knightX - 1] == 0) {
                        secure++;
                    }
                }

                //right
                if (knightX < 7) {
                    if (board[knightY + 2][knightX + 1] == 0) {
                        secure++;
                    }
                }
            }

            bw.append(secure + " movimento(s).\n");
            i++;
        }
        bw.flush();
    }

}
