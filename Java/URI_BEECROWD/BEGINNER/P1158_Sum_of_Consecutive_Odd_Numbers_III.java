package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1158 Sum of Consecutive Odd Numbers III https://www.urionlinejudge.com.br/judge/en/problems/view/1158
//Accepted 13/08/2015 - 17:47:30 Runtime:0.052s 
import java.util.Scanner;

public class P1158_Sum_of_Consecutive_Odd_Numbers_III {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int count = sc.nextInt();
            int sum = 0;
            while (count != 0) {
                if (num % 2 != 0) {
                    sum += num;
                    count--;
                }
                num++;
            }
            System.out.println(sum);
        }
    }

}
