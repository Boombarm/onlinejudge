package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1142 PUM https://www.urionlinejudge.com.br/judge/en/problems/view/1142
//Accepted 11/08/2015 - 16:03:14 Runtime:0.176s
import java.util.Scanner;

public class P1142_PUM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int round = 0;
        int num = 1;
        while (round != n) {
            count++;
            System.out.print(num + " ");
            num++;
            if (count == 3) {
                count = 0;
                num++;
                System.out.print("PUM\n");
                round++;
            }
        }
    }

}
