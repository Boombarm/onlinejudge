package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1143 Squared and Cubic https://www.urionlinejudge.com.br/judge/en/problems/view/1143
//Accepted 11/08/2015 - 16:13:08 Runtime:0.060s
import java.util.Scanner;

public class P1143_Squared_and_Cubic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println((i) + " " + ((i) * (i)) + " " + (((i) * ((i) * (i)))));
        }
    }

}
