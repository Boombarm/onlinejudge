package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1189 Left Area https://www.urionlinejudge.com.br/judge/en/problems/view/1189
//Accepted 30/08/2015 - 14:55:35 Runtime:0.072s
import java.text.DecimalFormat;
import java.util.Scanner;

public class P1189_Left_Area {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        char operation = sc.next().charAt(0);
        int end = 0;
        double sum = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                double num = sc.nextDouble();
                if (j < end) {
                    sum += num;
                }
            }

            if (i < 5) {
                end++;
            } else if (i > 5) {
                end--;
            }

        }

        if (operation == 'S') {
            System.out.println(df.format(sum));
        } else if (operation == 'M') {
            System.out.println(df.format(sum / 30));
        }

    }

}
