package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1009 Salary with Bonus https://www.urionlinejudge.com.br/judge/en/problems/view/1009
//Accepted 09/06/2015 - 14:20:59 Runtime:0.060s
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class P1009_SalaryWithBonus {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        double salary = scan.nextDouble();
        double bonus = scan.nextDouble();
        BigDecimal answer = new BigDecimal(salary + (bonus * 0.15)).setScale(2, RoundingMode.HALF_DOWN);
        System.out.println("TOTAL = R$ " + answer);
    }
}
