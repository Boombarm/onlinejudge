package  URI.Accepted.BEGINNER.sourcecode;

import java.util.Scanner;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1060 Positive Numbers https://www.urionlinejudge.com.br/judge/en/problems/view/1060
//Accepted 11/08/2015 - 07:48:10 Runtime:0.084s


public class P1060_Positive_Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 6; i++) {
            if (sc.nextFloat() > 0) {
                count++;
            }
        }
        System.out.println(count + " valores positivos");
    }
}
