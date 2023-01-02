package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1079 Weighted Averages https://www.urionlinejudge.com.br/judge/en/problems/view/1079
//Accepted 10/08/2015 - 17:30:24 Runtime:0.112s
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class P1079_Weighted_Averages {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");
        df.setRoundingMode(RoundingMode.HALF_EVEN);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            double num1 = sc.nextFloat();
            double num2 = sc.nextFloat();
            double num3 = sc.nextFloat();
            double answer = ((num1 * 2) + (num2 * 3) + (num3 * 5)) / 10;
            System.out.println(df.format(answer));
        }

    }

}
