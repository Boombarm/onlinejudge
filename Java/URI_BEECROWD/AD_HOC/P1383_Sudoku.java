package  URI.Accepted.AD_HOC.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1383 Sudoku https://www.urionlinejudge.com.br/judge/en/problems/view/1383
//Accepted 2/5/16, 5:16:48 PM Runtime:0.076s 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class P1383_Sudoku {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            int[][] sudoku = new int[9][9];
            for (int j = 0; j < 9; j++) {
                String[] st = br.readLine().split(" ");
                for (int k = 0; k < 9; k++) {
                    sudoku[j][k] = Integer.parseInt(st[k]);
                }
            }

            int col = 0;
            int row = 0;
            int sum = 0;
            boolean valid = true;
            //row check sum
            loop:
            while (row < 9) {
                sum = 0;
                col = 0;
                for (; col < 9; col++) {
                    int now = sudoku[row][col];
                    for (int j = col + 1; j < 9; j++) {
                        if (now == sudoku[row][j]) {
                            //Duplicate
                            valid = false;
                            break loop;
                        }
                    }
                }
                row++;
            }

            //colum check sum
            if (valid) {
                col = 0;
                loop:
                while (col < 9) {
                    sum = 0;
                    row = 0;
                    for (; row < 9; row++) {
                        int now = sudoku[row][col];
                        for (int j = row + 1; j < 9; j++) {
                            if (now == sudoku[j][col]) {
                                valid = false;
                                break loop;
                            }
                        }
                    }
                    col++;
                }

                //block check
                if (valid) {
                    row = 0;
                    col = 0;
                    for (int block = 1; block <= 9; block++) {
                        sum = 0;
                        Set<Integer> set = new HashSet();
                        for (int j = row; j < row + 3; j++) {
                            for (int k = col; k < col + 3; k++) {
                                set.add(sudoku[j][k]);
                            }
                        }
                        if (set.size() < 9) {
                            valid = false;
                            break;
                        }
                        col += 3;
                        if (block % 3 == 0) {
                            col = 0;
                            row += 3;
                        }
                    }
                }
            }

            //print answer
            bw.append("Instancia " + i + "\n");
            bw.append((valid ? "SIM\n" : "NAO\n") + "\n");
        }
        bw.flush();
    }

}
