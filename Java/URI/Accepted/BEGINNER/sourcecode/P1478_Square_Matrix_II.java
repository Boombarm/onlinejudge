package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1478 Square Matrix II https://www.urionlinejudge.com.br/judge/en/problems/view/1478
//Accepted 07/09/2015 - 14:48:49 Runtime:0.436s
import java.util.Scanner;

public class P1478_Square_Matrix_II {

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
                for (int i = 1; i <= n; i++) {
                    if (i == 1) {
                        for (int j = i - 1; j < n; j++) {
                            array[i - 1][j] = j + 1;
                        }
                    } else if (i == n) {
                        for (int j = 0, num = i; j < n; j++, num--) {
                            array[i - 1][j] = num;
                        }
                    } else {
                        array[i - 1][0] = i;
                        int lastIndex = 0;
                        for (int j = i - 1, index = 1; j >= 1; j--, index++) {
                            array[i - 1][index] = j;
                            lastIndex = index;
                        }
                        for (int j = lastIndex + 1, num = 2; j < n; j++, num++) {
                            array[i - 1][j] = num;
                        }
                    }

                }

                //print
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        int num = array[i][j];
                        if (j == 0) {
                            if (num < 10) {
                                System.out.print("  " + num);
                            } else if (num < 100) {
                                System.out.print(" " + num);
                            } else {
                                System.out.print(num);
                            }
                        } else {
                            if (num < 10) {
                                System.out.print("   " + num);
                            } else if (num < 100) {
                                System.out.print("  " + num);
                            } else {
                                System.out.print(" " + num);
                            }
                        }
                    }
                    System.out.println("");
                }
                System.out.println("");
            }
        }
    }

}
