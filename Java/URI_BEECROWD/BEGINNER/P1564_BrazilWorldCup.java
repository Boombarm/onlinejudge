package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1564 Brazil World Cup https://www.urionlinejudge.com.br/judge/en/problems/view/1564
//Accepted 10/06/2015 - 13:35:10 Runtime:0.052s 
import java.util.Scanner;

public class P1564_BrazilWorldCup {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                System.out.println("vai ter copa!");
            } else if (n > 0 && n <= 100) {
                System.out.println("vai ter duas!");
            }
        }
    }
}
