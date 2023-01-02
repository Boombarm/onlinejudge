package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1557 Square Matrix III https://www.urionlinejudge.com.br/judge/en/problems/view/1557
//Accepted 12/06/2015 - 16:03:57 Runtime:0.092s
import java.util.Scanner;

public class P1557_SquareMatrixIII_style2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            int width = ((int) Math.pow(2, (n * 2) - 2) + "").length();
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n + i; j++) {
                    String curNum = (int) Math.pow(2, j) + "";
                    if (curNum.length() < width) {
                        for (int k = curNum.length(); k < width; k++) {
                            System.out.print(" ");
                        }
                        System.out.print(j != i ? " " + curNum : curNum);
                    } else {
                        System.out.print(j != i ? " " + curNum : curNum);
                    }
                }
                System.out.println("");
            }
            System.out.println("");

            n = sc.nextInt();
        }
    }
}
