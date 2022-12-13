package  URI.Accepted.AD_HOC.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1467 Zero or One https://www.urionlinejudge.com.br/judge/en/problems/view/1467
//Accepted 02/10/2015 - 02:25:32 Runtime:0.244s
import java.util.Scanner;

public class P1467_Zero_or_One {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[3];
        while (sc.hasNext()) {
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                sum += num[i] = sc.nextInt();
            }
            if (sum == 0 || sum == 3) {
                System.out.println("*");
            } else if (sum == 1) {
                for (int i = 0; i < 10; i++) {
                    if (num[i] == 1) {
                        System.out.println((char) (i + 'A'));
                        break;
                    }
                }
            } else {
                for (int i = 0; i < 10; i++) {
                    if (num[i] == 0) {
                        System.out.println((char) (i + 'A'));
                        break;
                    }
                }
            }

        }
    }

}
