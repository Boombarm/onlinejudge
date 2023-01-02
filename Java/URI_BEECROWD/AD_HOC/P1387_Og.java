package  URI.Accepted.AD_HOC.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1387 Og https://www.urionlinejudge.com.br/judge/en/problems/view/1387
//Accepted 30/09/2015 - 22:37:21 Runtime:0.260s
import java.util.Scanner;

public class P1387_Og {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0 && b == 0) {
                break;
            } else {
                System.out.println(a + b);
            }
        }
    }

}
