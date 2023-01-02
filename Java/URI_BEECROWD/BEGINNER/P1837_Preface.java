package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1837 Preface https://www.urionlinejudge.com.br/judge/en/problems/view/1837
//Accepted 23/09/2015 - 13:35:21 Runtime:0.084s 
import java.util.Scanner;

public class P1837_Preface {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int q = 0, r = 0;

        if (b == 0) {
            System.exit(0);
        } else if (a == b) {
            System.out.println("1 0");
            System.exit(0);
        } else if (a == 0) {
            System.out.println("0 0");
            System.exit(0);
        }

        q = a / b;
        r = a % b;
        if (a < 0 && b < 0) {
            if (r < 0 && q <= 0) {
                q++;
                r = -(b * q) + a;
            } else if (r < 0 && q > 0) {
                q++;
                r = -(b * q) + a;
            }
        } else {
            if (r < 0 && q <= 0) {
                q--;
                r = -(b * q) + a;
            } else if (r < 0 && q > 0) {
                q++;
                r = -(b * q) + a;
            }
        }
        System.out.println(q + " " + r);

    }

}
