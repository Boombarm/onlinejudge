package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1921 Guilherme and His Kites https://www.urionlinejudge.com.br/judge/en/problems/view/1921
//Accepted 16/09/2015 - 11:59:39 Runtime:0.060s
import java.util.Scanner;

public class P1921_Guilherme_and_His_Kites {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long kite = 0;
        for (int i = 2; i < n - 1; i++) {
            kite += i;
        }
        System.out.println(kite);
    }

}
