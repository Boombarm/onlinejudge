package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1014 Consumption https://www.urionlinejudge.com.br/judge/en/problems/view/1014
//Accepted 19/06/2015 - 07:36:33 Runtime:0.124s 
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class P1014_Consumption {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.###");
        df.setRoundingMode(RoundingMode.HALF_EVEN);
        int a = sc.nextInt();
        float b = sc.nextFloat();
        System.out.println(df.format(a / b) + " km/l");
    }
}
