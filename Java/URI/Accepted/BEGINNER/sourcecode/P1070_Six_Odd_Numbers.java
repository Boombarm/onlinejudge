package  URI.Accepted.BEGINNER.sourcecode;

import java.util.Scanner;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1070 Six Odd Numbers https://www.urionlinejudge.com.br/judge/en/problems/view/1070
//Accepted 10/08/2015 - 07:58:02 Runtime:0.048s


public class P1070_Six_Odd_Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        while (count != 6) {
            if (num % 2 == 1) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }

}
