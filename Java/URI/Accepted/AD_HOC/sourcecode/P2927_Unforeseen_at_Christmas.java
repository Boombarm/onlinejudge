/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: AD-HOC
 * @Problem: 2927 - Unforeseen at Christmas
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2927
 * @Level:
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 4/2/19, 11:58:19 PM
 * @Runtime: 0.120s
 * @Solution:
 * @Note:
 */

package URI.Accepted.AD_HOC.sourcecode;


import java.util.Scanner;

public class P2927_Unforeseen_at_Christmas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalStudent = sc.nextInt();//student
        int totalComputer = sc.nextInt();//Total Computer
        int burned = sc.nextInt();
        int noCompiler = sc.nextInt();
        if (totalComputer - burned - noCompiler > totalStudent) {
            System.out.println("Igor feliz!");
        } else if (burned > (noCompiler / 2)) {
            System.out.println("Caio, a culpa eh sua!");
        } else {
            System.out.println("Igor bolado!");
        }
    }

}
