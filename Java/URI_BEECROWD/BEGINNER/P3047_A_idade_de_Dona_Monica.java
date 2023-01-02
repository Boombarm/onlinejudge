/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: Beginner
 * @Problem: 3047 - A idade de Dona Mônica
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/3047
 * @Timelimit: 1
 * @Status: Accepted
 * @Submission: 4/20/20, 7:41:14 PM
 * @Runtime: 0.136s
 * @Solution:
 * @Note:
 */


package URI.Accepted.BEGINNER.sourcecode;

import java.util.Scanner;

public class P3047_A_idade_de_Dona_Monica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = m - (a + b);
        int brother = Math.max(Math.max(a, b), c);
        System.out.println(brother);
    }

}
