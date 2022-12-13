package  URI.Accepted.BEGINNER.sourcecode;

import java.util.Scanner;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1072 Interval 2 https://www.urionlinejudge.com.br/judge/en/problems/view/1072
//Accepted 13/08/2015 - 12:53:35 Runtime:0.076s


public class P1072_Interval2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0 && n < 10000) {
            int in = 0, out = 0;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x > -10000000 && x < 10000000) {
                    if (x >= 10 && x <= 20) {
                        in++;
                    } else {
                        out++;
                    }
                }
            }
            System.out.println(in + " in");
            System.out.println(out + " out");
        }
    }

}
