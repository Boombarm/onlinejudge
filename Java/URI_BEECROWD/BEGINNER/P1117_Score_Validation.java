package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1117 Score Validation https://www.urionlinejudge.com.br/judge/en/problems/view/1117
//Accepted 23/08/2015 - 07:41:25 Runtime:0.048s
import java.text.DecimalFormat;
import java.util.Scanner;

public class P1117_Score_Validation {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        int set = 0;
        double a = 0, b = 0;
        while (true) {
            double num = sc.nextDouble();
            if (num >= 0.0 && num <= 10.0) {
                if (set == 0) {
                    a = num;
                    set = 1;
                } else {
                    b = num;
                    System.out.println("media = " + df.format((a + b) / 2));
                    break;
                }
            } else {
                System.out.println("nota invalida");
            }
        }
    }

}
