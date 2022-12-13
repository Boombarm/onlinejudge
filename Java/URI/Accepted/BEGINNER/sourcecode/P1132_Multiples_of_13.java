package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1132 Multiples of 13 https://www.urionlinejudge.com.br/judge/en/problems/view/1132
//Accepted 11/08/2015 - 15:55:38 Runtime:0.044s
import java.util.Scanner;

public class P1132_Multiples_of_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1 < num2) {
            for (int i = num1; i <= num2; i++) {
                if (i % 13 != 0) {
                    sum += i;
                }
            }
        } else {
            for (int i = num2; i <= num1; i++) {
                if (i % 13 != 0) {
                    sum += i;
                }
            }
        }
        System.out.println(sum);

    }

}
