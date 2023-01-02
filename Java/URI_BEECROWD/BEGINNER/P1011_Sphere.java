package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1011 Sphere https://www.urionlinejudge.com.br/judge/en/problems/view/1011
//Accepted 09/06/2015 - 15:35:54 Runtime:0.052s
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class P1011_Sphere {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.000");
        df.setRoundingMode(RoundingMode.HALF_DOWN);
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;
        int r = sc.nextInt();
        double formula = (4 / 3.0) * pi * Math.pow(r, 3);
        System.out.println("VOLUME = " + df.format(formula));
    }
}
