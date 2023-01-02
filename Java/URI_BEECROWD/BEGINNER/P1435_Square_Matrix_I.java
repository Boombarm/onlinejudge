package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1435 Square Matrix I https://www.urionlinejudge.com.br/judge/en/problems/view/1435
//Accepted 04/09/2015 - 12:34:22 Runtime:0.624s
import java.util.Scanner;

public class P1435_Square_Matrix_I {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[][];
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            if (n >= 1 && n <= 100) {
                array = new int[n][n];
                int state = 1;
                int end = n;
                while (end != 0) {
                    for (int i = state - 1; i < n; i++) {

                        if (i == state - 1) {
                            for (int j = state - 1; j < end; j++) {
                                array[i][j] = state;//top
                                array[j][i] = state;//left
                            }
                        } else if (i == n - state) {
                            for (int j = state - 1; j < end; j++) {
                                array[i][j] = state;//bottom
                                array[j][i] = state;//right
                            }
                        }
                    }
                    end--;
                    state++;
                }
                if (n < 19) {
                    for (int row = 0; row < n; row++) {
                        for (int colum = 0; colum < n; colum++) {
                            if (colum == 0) {
                                System.out.print("  " + array[row][colum]);
                            } else {
                                System.out.print("   " + array[row][colum]);
                            }
                        }
                        System.out.println("");
                    }
                } else {
                    for (int row = 0; row < n; row++) {
                        for (int colum = 0; colum < n; colum++) {
                            if (colum == 0) {
                                System.out.print("  " + array[row][colum]);
                            } else {
                                if (array[row][colum] > 9) {
                                    System.out.print("  " + array[row][colum]);
                                } else {
                                    System.out.print("   " + array[row][colum]);
                                }
                            }
                        }
                        System.out.println("");
                    }
                }
                System.out.println("");
            }
        }
    }

}
