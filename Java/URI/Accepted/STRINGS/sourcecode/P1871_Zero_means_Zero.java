/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1871 Zero means Zero
 * @Timelimit: 1 sec
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1871
 * @Status: Accepted 27/09/2015 - 00:53:20 Runtime:0.072s
 * @Solution:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.util.Scanner;

public class P1871_Zero_means_Zero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0 && a == b) {
                break;
            }
            int answer = a + b;
            System.out.println((answer + "").replaceAll("0", ""));
        }
    }

}
