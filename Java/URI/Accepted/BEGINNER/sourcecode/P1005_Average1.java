package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1005 Average 1 https://www.urionlinejudge.com.br/judge/en/problems/view/1005
//Accepted 08/06/2015 - 17:11:06 Runtime:0.052s 
import java.text.DecimalFormat;
import java.util.Scanner;

public class P1005_Average1 {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00000");
        Scanner sc = new Scanner(System.in);
        double w1 = 3.5;
        double w2 = 7.5;
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("MEDIA = " + df.format((((a * w1) + (b * w2)) / (w1 + w2))));
    }
}
