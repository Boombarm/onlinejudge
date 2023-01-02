package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1007 Difference https://www.urionlinejudge.com.br/judge/en/problems/view/1007
//Accepted 09/06/2015 - 10:13:27 Runtime:0.044s 
import java.util.Scanner;

public class P1007_Difference {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println("DIFERENCA = " + (a * b - c * d));
    }
}
