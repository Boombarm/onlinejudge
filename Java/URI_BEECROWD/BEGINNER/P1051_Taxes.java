package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1051 Taxes https://www.urionlinejudge.com.br/judge/en/problems/view/1051
//Accepted 13/08/2015 - 16:13:28 Runtime:0.056s
import java.text.DecimalFormat;
import java.util.Scanner;

public class P1051_Taxes {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextFloat();

        if (salary >= 0.00 && salary < 2000.00) {
            System.out.println("Isento");
        } else if (salary >= 2000.01) {
            double t1 = 0.00, t2 = 0.00, t3 = 0.00, total = 0.00;
            if (salary >= 3000.01) {
                t1 = ((salary - 2000.00) - (salary - 3000.00)) * 0.08;
                total += t1;
                if (salary >= 4500.01) {
                    t2 = ((salary - 3000.00) - (salary - 4500.00)) * 0.18;
                    t3 = (salary - 4500.00) * 0.28;
                    total += t2;
                    total += t3;
                } else {
                    t2 = (salary - 3000.00) * 0.18;
                    total += t2;
                }
            } else {
                t1 = (salary - 2000.00) * 0.08;
                total += t1;
            }
            System.out.println("R$ " + df.format(total));
        }

    }

}
