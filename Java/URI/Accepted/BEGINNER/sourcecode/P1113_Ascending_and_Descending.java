package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1113 Ascending and Descending https://www.urionlinejudge.com.br/judge/en/problems/view/1113
//Accepted 11/08/2015 - 15:10:24 Runtime:0.056s 
import java.util.Scanner;

public class P1113_Ascending_and_Descending {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            if (num1 == num2) {
                break;
            }
            if (num1 > num2) {
                System.out.println("Decrescente");
            } else {
                System.out.println("Crescente");
            }
        }
    }

}
