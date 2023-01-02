package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1037 Interval https://www.urionlinejudge.com.br/judge/en/problems/view/1037
//Accepted 08/08/2015 - 01:58:40 Runtime:0.060s
import java.util.Scanner;

public class P1037_Interval {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float value = sc.nextFloat();
        if (value >= 0.00 && value <= 25.00) {
            System.out.println("Intervalo [0,25]");
        } else if (value >= 25 && value <= 50) {
            System.out.println("Intervalo (25,50]");
        } else if (value >= 50 && value <= 75) {
            System.out.println("Intervalo (50,75]");
        } else if (value >= 75 && value <= 100) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }
    }

}
