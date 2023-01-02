package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1116 Dividing X by Y https://www.urionlinejudge.com.br/judge/en/problems/view/1116
//Accepted 14/08/2015 - 12:34:38 Runtime:0.192s
import java.util.Scanner;

public class P1116_Dividing_X_by_Y {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            double answer = (double) X / Y;
            if (answer == Double.NEGATIVE_INFINITY || answer == Double.POSITIVE_INFINITY) {
                System.out.println("divisao impossivel");
            } else {
                System.out.println(answer);
            }
        }
    }
}
