package  URI.Accepted.BEGINNER.sourcecode;

import java.util.Scanner;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1101 Sequence of Numbers and Sum https://www.urionlinejudge.com.br/judge/en/problems/view/1101
//Accepted 11/08/2015 - 15:27:53 Runtime:0.040s


public class P1101_Sequence_of_Numbers_and_Sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            if (num2 <= 0) {
                break;
            }
            int sum = 0;
            if (num2 < num1) {
                for (int i = num2; i <= num1; i++) {
                    System.out.print(i + " ");
                    sum += i;
                }
            } else {
                for (int i = num1; i <= num2; i++) {
                    System.out.print(i + " ");
                    sum += i;
                }
            }
            System.out.println("Sum=" + sum);
        }
    }

}
