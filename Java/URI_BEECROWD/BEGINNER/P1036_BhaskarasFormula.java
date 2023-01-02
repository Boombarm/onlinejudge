package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1036 Bhaskara's Formula https://www.urionlinejudge.com.br/judge/en/problems/view/1036
//Accepted 08/08/2015 - 01:47:30  Runtime:0.056s
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class P1036_BhaskarasFormula {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DecimalFormat df = new DecimalFormat("0.00000");
        df.setRoundingMode(RoundingMode.HALF_EVEN);
        Scanner scan = new Scanner(System.in);

        double a, b, c, delta;
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();

        delta = (b * b) - (4 * (a) * (c));
        if (delta > 0 && (2 * a != 0)) {
            double r1 = ((-b + Math.sqrt(delta)) / (2 * a));
            double r2 = ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("R1 = " + df.format(r1));
            System.out.println("R2 = " + df.format(r2));
        } else {
            System.out.println("Impossivel calcular");
        }
    }
}
