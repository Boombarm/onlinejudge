package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1153 Simple Factorial https://www.urionlinejudge.com.br/judge/en/problems/view/1153
//Accepted 14/08/2015 - 16:17:50 Runtime:0.056s
import java.util.Scanner;

public class P1153_Simple_Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = n;
        for (int i = 1; i < n; i++) {
            sum *= n - i;
        }
        System.out.println(sum);
    }

}
