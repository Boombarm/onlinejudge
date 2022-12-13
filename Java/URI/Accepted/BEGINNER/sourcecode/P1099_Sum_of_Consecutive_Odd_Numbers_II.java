package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1099 Sum of Consecutive Odd Numbers II https://www.urionlinejudge.com.br/judge/en/problems/view/1099
//Accepted 12/08/2015 - 05:47:46 Runtime:0.160s 
import java.util.Scanner;

public class P1099_Sum_of_Consecutive_Odd_Numbers_II {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int sum = 0;
            if (num1 > num2) {
                int tmp = num2;
                num2 = num1;
                num1 = tmp;
            }
            for (int j = num1 + 1; j < num2; j++) {
                if (j % 2 == 1) {
                    sum += j;
                }
            }
            System.out.println(sum);
        }
    }

}
