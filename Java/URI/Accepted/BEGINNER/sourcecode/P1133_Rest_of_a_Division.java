package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1133 Rest of a Division https://www.urionlinejudge.com.br/judge/en/problems/view/1133
//Accepted 14/08/2015 - 17:04:24 Runtime:0.052s
import java.util.Scanner;

public class P1133_Rest_of_a_Division {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        if (X == Y) {
            if (X % 5 == 2 || X % 5 == 3) {
                System.out.println(X);
            }
        } else {
            if (X > Y) {
                int tmp = Y;
                Y = X;
                X = tmp;
            }
            for (int i = X + 1; i < Y; i++) {
                if (i % 5 == 2 || i % 5 == 3) {
                    System.out.println(i);
                }
            }
        }

    }

}
