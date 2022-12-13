package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1176 Fibonacci Array https://www.urionlinejudge.com.br/judge/en/problems/view/1176
//Accepted 28/08/2015 - 06:11:11 Runtime:0.068s 
import java.util.Scanner;

public class P1176_Fibonacci_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long fib[] = new long[61];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= 60; i++) {
            fib[i] = (long) (fib[(i - 2)] + fib[(i - 1)]);
        }

        for (int i = 0; i <= 60; i++) {
            System.out.println(i + " " + fib[i]);
        }

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            System.out.println("Fib(" + num + ") = " + fib[num]);
        }

    }

}
