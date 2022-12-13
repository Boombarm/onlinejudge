package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1159 Sum of Consecutive Even Numbers https://www.urionlinejudge.com.br/judge/en/problems/view/1159
//Accepted 13/08/2015 - 17:21:58 Runtime:0.044s
import java.util.Scanner;

public class P1159_Sum_of_Consecutive_Even_Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            int count = 5;
            int sum = 0;
            int i = num;
            while (count != 0) {
                if (i % 2 == 0) {
                    sum += i;
                    count--;
                }
                i++;
            }
            System.out.println(sum);
        }

    }

}
