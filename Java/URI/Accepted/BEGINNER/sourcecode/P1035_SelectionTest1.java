package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1035 Selection Test 1 https://www.urionlinejudge.com.br/judge/en/problems/view/1035
//Accepted 06/08/2015 - 12:23:48 Runtime:0.052s 
import java.util.Scanner;

public class P1035_SelectionTest1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if (b > c && d > a && ((c + d) > (a + b) && c > -1 && d > -1)) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}
