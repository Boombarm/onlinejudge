package URI.Accepted.BEGINNER.sourcecode;
/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: BEGINNER
 * @Problem: 2759 - Input and Output Character
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2759
 * @Timelimit: 1 sec
 * @Level: 1
 * @Status: Accepted
 * @Memory: 458 Bytes
 * @Submission: 9/27/18, 9:25:29 PM
 * @Runtime: 0.096s
 * @Solution:
 * @Note:
 */

import java.util.Scanner;

public class P2759_Input_and_Output_Character {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        System.out.println("A = " + a + ", B = " + b + ", C = " + c);
        System.out.println("A = " + b + ", B = " + c + ", C = " + a);
        System.out.println("A = " + c + ", B = " + a + ", C = " + b);
    }
}
