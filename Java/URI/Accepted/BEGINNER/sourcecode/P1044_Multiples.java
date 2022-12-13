package  URI.Accepted.BEGINNER.sourcecode;

import java.util.Scanner;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1044 Multiples https://www.urionlinejudge.com.br/judge/en/problems/view/1044
//Accepted 07/08/2015 - 00:55:47 Runtime:0.056s
public class P1044_Multiples {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a % 2 == 0 && b % 2 == 0 || a % 3 == 0 && b % 3 == 0 || a % 5 == 0 && b % 5 == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
        sc.close();
    }

}
