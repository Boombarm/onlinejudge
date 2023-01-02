package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1078 Multiplication Table https://www.urionlinejudge.com.br/judge/en/problems/view/1078
//Accepted 10/08/2015 - 17:36:16 Runtime:0.048s
import java.util.Scanner;

public class P1078_Multiplication_Table {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + n + " = " + (i * n));
        }
    }

}
