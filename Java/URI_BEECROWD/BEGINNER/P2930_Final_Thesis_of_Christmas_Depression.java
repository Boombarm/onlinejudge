package URI.Accepted.BEGINNER.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: BEGINNER
 * @Problem: 2930 - Final Thesis of Christmas Depression
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2930
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory:
 * @Submission: 1/14/19, 11:09:52 AM
 * @Runtime: 0.072s
 * @Solution:
 * @Note:
 */
import java.util.Scanner;

public class P2930_Final_Thesis_of_Christmas_Depression {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a >= b) {
            System.out.println("Eu odeio a professora!");
        } else if (b - a >= 3) {
            System.out.println("Muito bem! Apresenta antes do Natal!");
        } else {
            System.out.println("Parece o trabalho do meu filho!");
            if (b + (b - a) < 24) {
                System.out.println("TCC Apresentado!");
            } else {
                System.out.println("Fail! Entao eh nataaaaal!");
            }
        }

    }

}
