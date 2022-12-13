package  URI.Accepted.MATHEMATICS.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1555 Functions https://www.urionlinejudge.com.br/judge/en/problems/view/1555
//Accepted 26/09/2015 - 11:21:26 Runtime:0.244s
import java.util.Scanner;

public class P1555_Functions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int r = ((3 * x) * (3 * x)) + (y * y);
            int b = (2 * (x * x)) + ((5 * y) * (5 * y));
            int c = (-100 * x) + (y * y * y);

            if (r > b && r > c) {
                System.out.println("Rafael ganhou");
            } else if (b > r && b > c) {
                System.out.println("Beto ganhou");
            } else {
                System.out.println("Carlos ganhou");
            }
        }
    }

}
