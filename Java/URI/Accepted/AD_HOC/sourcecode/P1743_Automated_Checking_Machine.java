package  URI.Accepted.AD_HOC.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1743 Automated Checking Machine https://www.urionlinejudge.com.br/judge/en/problems/view/1743
//Accepted 02/10/2015 - 00:57:34 Runtime:0.100s
import java.util.Scanner;

public class P1743_Automated_Checking_Machine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] p1 = new int[5];
        int[] p2 = new int[5];
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < 5; i++) {
            p1[i] = sc.nextInt();
            sum1 += p1[i];
        }
        for (int i = 0; i < 5; i++) {
            p2[i] = sc.nextInt();
            sum2 += p2[i];
        }

        if ((sum1 == 5 && sum2 == 0) || (sum1 == 0 && sum2 == 5)) {
            System.out.println("Y");
        } else {
            if (sum1 + sum2 == 5) {
                for (int i = 0; i < 5; i++) {
                    if (p1[i] == p2[i]) {
                        System.out.println("N");
                        System.exit(0);
                    }
                }
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
    }

}
