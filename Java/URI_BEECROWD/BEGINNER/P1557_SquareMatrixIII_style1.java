package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1557 Square Matrix III https://www.urionlinejudge.com.br/judge/en/problems/view/1557
//Accepted 12/06/2015 - 15:43:08  Runtime:0.084s 
import java.util.Scanner;

public class P1557_SquareMatrixIII_style1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            int num[][] = new int[n][n];
            int maxBit = 0;
            for (int i = 0; i < n; i++) {
                int nextBit = i;
                for (int j = 0; j < n; j++) {
                    num[i][j] = (int) Math.pow(2, nextBit);
                    maxBit = nextBit;
                    nextBit++;
                }
            }
            int width = ((int) Math.pow(2, maxBit) + "").length();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    String curNum = num[i][j] + "";
                    if (curNum.length() < width) {
                        for (int k = curNum.length(); k < width; k++) {
                            System.out.print(" ");
                        }
                        System.out.print(j != 0 ? " " + curNum : curNum);
                    } else {
                        System.out.print(j != 0 ? " " + curNum : curNum);
                    }
                }
                System.out.println("");
            }
            System.out.println("");

            n = sc.nextInt();
        }
    }
}
