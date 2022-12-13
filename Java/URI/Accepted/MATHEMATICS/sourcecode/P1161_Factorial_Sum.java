package  URI.Accepted.MATHEMATICS.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1161 Factorial Sum https://www.urionlinejudge.com.br/judge/en/problems/view/1161
//Accepted 26/09/2015 - 01:36:24 Runtime:0.096s
import java.util.Scanner;

public class P1161_Factorial_Sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if ((a >= 0 && a <= 20) && (b >= 0 && b <= 20)) {
                long sum1 = factorial(a), sum2 = factorial(b);
                System.out.println(sum1 + sum2);
            }
        }
    }

    static long factorial(int num) {
        long sum = num;
        if (num == 0 || num == 1) {
            return 1;
        } else {
            for (int i = num - 1; i > 0; i--) {
                sum *= i;
            }
        }
        return sum;
    }
}
