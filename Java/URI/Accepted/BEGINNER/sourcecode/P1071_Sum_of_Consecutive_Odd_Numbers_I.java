package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1071 Sum of Consecutive Odd Numbers I https://www.urionlinejudge.com.br/judge/en/problems/view/1071
//Accepted 12/08/2015 - 13:21:38 Runtime:0.048s
import java.util.Scanner;

public class P1071_Sum_of_Consecutive_Odd_Numbers_I {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1 > num2) {
            int tmp = num2;
            num2 = num1;
            num1 = tmp;
        }
        int sum = 0;
        for (int i = num1 + 1; i < num2; i++) {
            if (i % 2 == 1 || i % 2 == -1) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

}
