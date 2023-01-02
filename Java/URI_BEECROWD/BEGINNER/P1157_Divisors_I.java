package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1157 Divisors I https://www.urionlinejudge.com.br/judge/en/problems/view/1157
//Accepted 11/08/2015 - 16:53:34 Runtime:0.052s
import java.util.Scanner;

public class P1157_Divisors_I {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if ((n % i) == 0) {
                System.out.println(i);
            }
        }
    }

}
