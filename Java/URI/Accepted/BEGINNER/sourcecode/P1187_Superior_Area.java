package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1187 Superior Area https://www.urionlinejudge.com.br/judge/en/problems/view/1187
//Accepted 30/08/2015 - 12:06:57 Runtime:0.068s
import java.text.DecimalFormat;
import java.util.Scanner;

public class P1187_Superior_Area {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        char operation = sc.next().charAt(0);
        int start = 1, end = 10;
        double sum = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                double num = sc.nextDouble();
                if (j >= start && j <= end) {
                    sum += num;
                }
            }
            start++;
            end--;
        }

        if (operation == 'S') {
            System.out.println(df.format(sum));
        } else if (operation == 'M') {
            System.out.println(df.format(sum / 30));
        }
    }

}
