package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1178 Array Fill III https://www.urionlinejudge.com.br/judge/en/problems/view/1178
//Accepted 28/08/2015 - 10:51:59 Runtime:0.056s
import java.text.DecimalFormat;
import java.util.Scanner;

public class P1178_Array_Fill_III {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0000");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        int n = 0;
        while (n != 100) {
            System.out.println("N[" + n + "] = " + df.format(num));
            num /= 2;
            n++;
        }

    }

}
