package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1149 Summing Consecutive Integers https://www.urionlinejudge.com.br/judge/en/problems/view/1149
//Accepted 24/08/2015 - 04:36:21 Runtime:0.040s
import java.util.Scanner;

public class P1149_Summing_Consecutive_Integers {

    static int sum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = 0;
        int sum = 0;
        while (sc.hasNext()) {
            if (n <= 0) {
                n = sc.nextInt();
            }

            if (n > 0) {
                for (int i = a; i < (a + n); i++) {
                    sum += i;
                }
                System.out.println(sum);
            }

        }
    }

}
