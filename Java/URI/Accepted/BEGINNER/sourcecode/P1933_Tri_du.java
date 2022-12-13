package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1933 Tri-du https://www.urionlinejudge.com.br/judge/en/problems/view/1933
//Accepted 19/09/2015 - 02:40:53 Runtime:0.072s
import java.util.Scanner;

public class P1933_Tri_du {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
