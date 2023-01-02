package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1002 Area of a Circle https://www.urionlinejudge.com.br/judge/en/problems/view/1002
//Accepted 08/06/2015 - 15:09:05 Runtime:0.060s 
import java.text.DecimalFormat;
import java.util.Scanner;

public class P1002_Area_of_a_Circle {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0000");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.println("A=" + df.format(3.14159 * ((double) r * (double) r)));
    }
}
