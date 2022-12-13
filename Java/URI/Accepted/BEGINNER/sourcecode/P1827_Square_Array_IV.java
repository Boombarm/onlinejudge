package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1827 Square Array IV https://www.urionlinejudge.com.br/judge/en/problems/view/1827
//Accepted 08/09/2015 - 10:21:43 Runtime:0.796s
import java.util.Scanner;

public class P1827_Square_Array_IV {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[][] squareArray = new int[n][n];
            int length = n / 3;
            int mid = n / 2;
            int twoNumberIndex = 0, threeNumberIndex = n - 1;
            for (int i = 0; i < n; i++) {
                if (i < length) {
                    squareArray[i][twoNumberIndex] = 2;
                    squareArray[i][threeNumberIndex] = 3;
                } else if (i == mid) {
                    for (int j = 0; j < n; j++) {
                        if (j == mid) {
                            squareArray[i][j] = 4;
                        } else if (j >= length && j < n - length) {
                            squareArray[i][j] = 1;
                        }
                    }
                } else if (i >= n - length && i < n) {
                    squareArray[i][twoNumberIndex] = 2;
                    squareArray[i][threeNumberIndex] = 3;
                } else {
                    for (int j = 0; j < n; j++) {
                        if (j >= length && j < n - length) {
                            squareArray[i][j] = 1;
                        }
                    }
                }
                twoNumberIndex++;
                threeNumberIndex--;
            }

            //print
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(squareArray[i][j]);
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }

}
