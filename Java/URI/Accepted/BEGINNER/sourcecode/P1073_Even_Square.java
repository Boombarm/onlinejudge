package  URI.Accepted.BEGINNER.sourcecode;

import java.util.Scanner;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1073 Even Square https://www.urionlinejudge.com.br/judge/en/problems/view/1073
//Accepted 10/08/2015 - 13:37:09 Runtime:0.056s


public class P1073_Even_Square {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 5 && num < 2000) {
            int n = 1;
            while ((n * 2) <= num) {
                System.out.println((n * 2) + "^2 = " + ((int) Math.pow((n * 2), 2)));
                n++;
            }
        }
    }

}
