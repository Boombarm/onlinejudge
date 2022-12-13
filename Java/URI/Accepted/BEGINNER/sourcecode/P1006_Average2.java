package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1006 Average 2 https://www.urionlinejudge.com.br/judge/en/problems/view/1006
//Accepted 09/06/2015 - 09:49:35 Runtime:0.060s
import java.text.DecimalFormat;
import java.util.Scanner;

public class P1006_Average2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        int w1 = 2, w2 = 3, w3 = 5;
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        System.out.println("MEDIA = " + df.format(((a * w1) + (b * w2) + (c * w3)) / 10));
    }
}
