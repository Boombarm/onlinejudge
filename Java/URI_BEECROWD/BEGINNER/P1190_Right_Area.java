package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1190 Right Area https://www.urionlinejudge.com.br/judge/en/problems/view/1190
//Accepted 30/08/2015 - 15:00:03 Runtime:0.080s
import java.text.DecimalFormat;
import java.util.Scanner;

public class P1190_Right_Area {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        char operation = sc.next().charAt(0);
        int start = 11;
        double sum = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                double num = sc.nextDouble();
                if (j > start) {
                    sum += num;
                }
            }
            if (i < 5) {
                start--;
            } else if (i > 5) {
                start++;
            }
        }

        if (operation == 'S') {
            System.out.println(df.format(sum));
        } else if (operation == 'M') {
            System.out.println(df.format(sum / 30));
        }
    }

}
