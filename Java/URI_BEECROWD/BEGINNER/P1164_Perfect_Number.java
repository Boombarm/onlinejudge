package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1164 Perfect Number https://www.urionlinejudge.com.br/judge/en/problems/view/1164
//Accepted 12/08/2015 - 00:47:35 Runtime:0.080s
import java.util.Scanner;

public class P1164_Perfect_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 1 && n <= 100) {
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                if (num >= 1 && num <= 100000000) {
                    int sum = 0;
                    boolean flag = false;
                    for (int j = num - 1; j > 0; j--) {
                        if (num % j == 0) {
                            sum += j;
                            if (sum == num) {
                                flag = true;
                                break;
                            }
                        }

                    }
                    if (flag) {
                        System.out.println(num + " eh perfeito");
                    } else {
                        System.out.println(num + " nao eh perfeito");
                    }
                }
            }
        }
    }

}
