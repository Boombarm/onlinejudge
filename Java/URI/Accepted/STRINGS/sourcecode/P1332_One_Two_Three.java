/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1332 One-Two-Three
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1332
 * @Timelimit: 1 sec
 * @Status: Accepted 28/09/2015 - 16:11:17 Runtime:0.100s
 * @Solution:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.util.Scanner;

public class P1332_One_Two_Three {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.length() == 3) {
                if (s.charAt(0) == 'o' || s.charAt(1) == 'n' || s.charAt(2) == 'e') {
                    System.out.println("1");
                } else if (s.charAt(0) == 't' || s.charAt(1) == 'w' || s.charAt(2) == 'o') {
                    System.out.println("2");
                }
            } else {
                System.out.println("3");
            }
        }
    }

}
