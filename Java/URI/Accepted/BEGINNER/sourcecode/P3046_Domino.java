/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: BEGINNER
 * @Problem: 3046 - Domino
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/3046
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 4/1/20, 10:45:42 AM
 * @Runtime: 0.136s
 * @Solution:
 * @Note:
 */

package URI.Accepted.BEGINNER.sourcecode;

import java.util.Scanner;

public class P3046_Domino {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = (n + 1) * (n + 2) / 2;
        System.out.println(answer);
    }

}
