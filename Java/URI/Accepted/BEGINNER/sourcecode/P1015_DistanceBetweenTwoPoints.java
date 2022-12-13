package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1015 Distance Between Two Points https://www.urionlinejudge.com.br/judge/en/problems/view/1015
//Accepted 19/06/2015 - 13:47:46 Runtime:0.128s 
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class P1015_DistanceBetweenTwoPoints {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.####");
        df.setRoundingMode(RoundingMode.HALF_EVEN);
        float x1 = sc.nextFloat();
        float y1 = sc.nextFloat();
        float x2 = sc.nextFloat();
        float y2 = sc.nextFloat();
        double p1 = Math.pow(x2 - x1, 2);
        double p2 = Math.pow(y2 - y1, 2);
        double answer = Math.sqrt(p1 + p2);
        System.out.println(df.format(answer));
    }
}
