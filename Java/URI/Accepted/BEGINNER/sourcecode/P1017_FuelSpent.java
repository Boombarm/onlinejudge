package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1017 Fuel Spent https://www.urionlinejudge.com.br/judge/en/problems/view/1017
//Accepted 19/06/2015 - 14:17:57 Runtime:0.092s 
import java.util.Scanner;

public class P1017_FuelSpent {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        double answer = a * b;
        answer = answer / 12;
        System.out.printf("%.3f\n", answer);
    }
}
