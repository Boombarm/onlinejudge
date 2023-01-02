/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1240 Fit or Dont Fit II
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1241
 * @Timelimit: 1 sec
 * @Status: Accepted 30/09/2015 - 01:58:44 Runtime:0.204s
 * @Solution:
 */
package Accepted.STRINGS.sourcecode;

import java.util.Scanner;

public class P1241_Fit_or_Dont_Fit_II {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String a = sc.next();
            String b = sc.next();
            if (a.equals(b)) {
                System.out.println("encaixa");
            } else {
                if (b.length() < a.length()) {
                    int saLength = a.length();
                    int sbLength = b.length();
                    boolean fit = true;
                    for (int j = saLength - 1; j >= saLength - sbLength; j--) {
                        if (a.charAt(j) - b.charAt((j - (saLength - sbLength))) != 0) {
                            fit = false;
                            break;
                        }
                    }

                    if (fit) {
                        System.out.println("encaixa");
                    } else {
                        System.out.println("nao encaixa");
                    }
                } else {
                    System.out.println("nao encaixa");
                }
            }
        }
    }

}
