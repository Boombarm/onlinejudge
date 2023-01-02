package  URI.Accepted.PARADIGMS.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: PARADIGMS
 * @Problem: 1029 - Fibonacci, How Many Calls?
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1029
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 27/09/2015 - 05:57:06
 * @Runtime: 0.152s
 * @Solution:
 * @Note:
 */
import java.util.Scanner;

public class P1029_Fibonacci_How_Many_Calls {

    static int calls = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int fib = fibonacci(num);
            System.out.println("fib(" + num + ") = " + (calls - 1) + " calls = " + fib);
            calls = 0;
        }

    }

    static int fibonacci(int n) {
        calls++;
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}
