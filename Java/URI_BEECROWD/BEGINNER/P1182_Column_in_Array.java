package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1182 Column in Array https://www.urionlinejudge.com.br/judge/en/problems/view/1182
//Accepted 30/08/2015 - 11:08:04 Runtime:0.076s
import java.text.DecimalFormat;
import java.util.Scanner;

public class P1182_Column_in_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        int c = sc.nextInt();
        char operation = sc.next().charAt(0);
        double sum = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                double num = sc.nextDouble();
                if (j == c) {
                    sum += num;
                }
            }
        }
        if (operation == 'S') {
            System.out.println(df.format(sum));
        } else if (operation == 'M') {
            System.out.println(df.format(sum / 12));
        }

    }

}
