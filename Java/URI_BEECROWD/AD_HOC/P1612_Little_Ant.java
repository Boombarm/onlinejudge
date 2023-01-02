package  URI.Accepted.AD_HOC.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1612 Little Ant https://www.urionlinejudge.com.br/judge/en/problems/view/1612
//Accepted 06/10/2015 - 09:54:11 Runtime:0.056s
import java.util.Scanner;

public class P1612_Little_Ant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println(Math.round((n / 2.0)));
        }
    }

}
