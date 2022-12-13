package  URI.Accepted.BEGINNER.sourcecode;

import java.util.Scanner;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1059 Even Numbers https://www.urionlinejudge.com.br/judge/en/problems/view/1059
//Accepted 11/08/2015 - 07:41:30 Runtime:0.048s


public class P1059_Even_Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

}
