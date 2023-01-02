package  URI.Accepted.BEGINNER.sourcecode;

import java.util.Scanner;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1165 Prime Number https://www.urionlinejudge.com.br/judge/en/problems/view/1165
//Accepted 12/08/2015 - 00:58:20 Runtime:0.064s


public class P1165_Prime_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            boolean flag = false;
            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println(num + " nao eh primo");
            } else {
                System.out.println(num + " eh primo");
            }
        }
    }

}
