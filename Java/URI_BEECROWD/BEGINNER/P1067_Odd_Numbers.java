package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1067 Odd Numbers https://www.urionlinejudge.com.br/judge/en/problems/view/1067
//Accepted 10/08/2015 - 07:51:30 Runtime:0.056s 
import java.util.Scanner;

public class P1067_Odd_Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >= 1 && num <= 1000) {
            for (int i = 1; i <= num; i++) {
                if (i % 2 == 1) {
                    System.out.println(i);
                }
            }
        }
    }

}
