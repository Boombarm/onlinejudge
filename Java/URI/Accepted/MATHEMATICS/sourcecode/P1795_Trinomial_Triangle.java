package  URI.Accepted.MATHEMATICS.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1795 | [PJ][P1] Trinomial Triangle https://www.urionlinejudge.com.br/judge/en/problems/view/1795
//Accepted 27/09/2015 - 09:52:13 Runtime:0.088s 
import java.util.Scanner;

public class P1795_Trinomial_Triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        long answer = 1;
        for (int i = 0; i < r; i++) {
            answer *= 3;
        }
        System.out.println(answer);

    }

}
