package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1188 Inferior Area https://www.urionlinejudge.com.br/judge/en/problems/view/1188
//Accepted 30/08/2015 - 12:12:41 Runtime:0.068s
import java.text.DecimalFormat;
import java.util.Scanner;

public class P1188_Inferior_Area {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        char operation = sc.next().charAt(0);
        int start = 5, end = 6;
        double sum = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                double num = sc.nextDouble();
                if (i >= 7 && j >= start && j <= end) {
                    sum += num;
                }
            }
            if (i >= 7) {
                start--;
                end++;
            }
        }

        if (operation == 'S') {
            System.out.println(df.format(sum));
        } else if (operation == 'M') {
            System.out.println(df.format(sum / 30));
        }
    }

}
