package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1847 Welcome to the Winter! https://www.urionlinejudge.com.br/judge/en/problems/view/1847
//Accepted 09/09/2015 - 12:42:57 Runtime:0.068s
import java.util.Scanner;

public class P1847_Welcome_to_the_Winter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b) {
            if (b <= c) {
                System.out.println(":)");
                System.exit(0);
            } else {
                if ((b - c) < (a - b)) {
                    System.out.println(":)");
                    System.exit(0);
                } else {
                    System.out.println(":(");
                    System.exit(0);
                }
            }
        } else if (a < b) {
            if (b >= c) {
                System.out.println(":(");
                System.exit(0);
            } else {
                if ((c - b) < (b - a)) {
                    System.out.println(":(");
                    System.exit(0);
                } else {
                    System.out.println(":)");
                    System.exit(0);
                }

            }
        } else {
            if (c > b) {
                System.out.println(":)");
                System.exit(0);
            } else {
                System.out.println(":(");
                System.exit(0);
            }
        }

    }

}
