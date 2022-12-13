package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1151 Easy Fibonacci https://www.urionlinejudge.com.br/judge/en/problems/view/1151
//Accepted 14/08/2015 - 16:38:27 Runtime:0.948s
import java.util.Scanner;

public class P1151_Easy_Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print(fibonacci(i));
            } else {
                System.out.print(fibonacci(i) + " ");
            }
        }
        System.out.println("");
    }

    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}
