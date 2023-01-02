package  URI.Accepted.AD_HOC.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1796 | [PJ] Brazilian Economy https://www.urionlinejudge.com.br/judge/en/problems/view/1796
//Accepted 06/10/2015 - 03:21:08 Runtime:0.552s
import java.util.Scanner;

public class P1796_Brazilian_Economy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        int sum = 0;
        double c = n / 2;
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
            if (sum >= c) {
                System.out.println("N");
                System.exit(0);
            }
        }
        System.out.println("Y");
    }

}
