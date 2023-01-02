package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1048 Salary Increase https://www.urionlinejudge.com.br/judge/en/problems/view/1048
//Accepted 08/08/2015 - 09:16:08 Runtime:0.052s
import java.text.DecimalFormat;
import java.util.Scanner;

public class P1048_SalaryIncrease {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        float value = sc.nextFloat();
        if (value >= 0 && value <= 400.00) {
            System.out.println("Novo salario: " + df.format(value + (value * 0.15)));
            System.out.println("Reajuste ganho: " + df.format(value * 0.15));
            System.out.println("Em percentual: 15 %");
        } else if (value > 400.00 && value <= 800.00) {
            System.out.println("Novo salario: " + df.format(value + (value * 0.12)));
            System.out.println("Reajuste ganho: " + df.format(value * 0.12));
            System.out.println("Em percentual: 12 %");
        } else if (value > 800.00 && value <= 1200.00) {
            System.out.println("Novo salario: " + df.format(value + (value * 0.1)));
            System.out.println("Reajuste ganho: " + df.format(value * 0.1));
            System.out.println("Em percentual: 10 %");
        } else if (value > 1200.00 && value <= 2000.00) {
            System.out.println("Novo salario: " + df.format(value + (value * 0.07)));
            System.out.println("Reajuste ganho: " + df.format(value * 0.07));
            System.out.println("Em percentual: 7 %");
        } else if (value > 2000.00) {
            System.out.println("Novo salario: " + df.format(value + (value * 0.04)));
            System.out.println("Reajuste ganho: " + df.format(value * 0.04));
            System.out.println("Em percentual: 4 %");
        }

    }

}
