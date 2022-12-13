package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1074 Even or Odd https://www.urionlinejudge.com.br/judge/en/problems/view/1074
//Accepted 10/08/2015 - 13:46:25 Runtime:0.088s
import java.util.Scanner;

public class P1074_Even_or_Odd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num == 0) {
                System.out.println("NULL");
            } else {
                if (num % 2 == 0) {
                    System.out.print("EVEN ");
                } else {
                    System.out.print("ODD ");
                }

                if (num > 0) {
                    System.out.println("POSITIVE");
                } else {
                    System.out.println("NEGATIVE");
                }
            }
        }
    }

}
