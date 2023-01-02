package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1075 Remaining 2 https://www.urionlinejudge.com.br/judge/en/problems/view/1075
//Accepted 10/08/2015 - 13:59:32 Runtime:0.028s
import java.util.Scanner;

public class P1075_Remaining2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 10000) {
            int n = 2;
            while (n < 10000) {
                System.out.println(n);
                n += num;
            }

        }

    }

}
