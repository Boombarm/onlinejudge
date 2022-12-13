package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1181 Line in Array https://www.urionlinejudge.com.br/judge/en/problems/view/1181
//Accepted 30/08/2015 - 11:16:12 Runtime:0.072s
import java.text.DecimalFormat;
import java.util.Scanner;

public class P1181_Line_in_Array {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        char operation = sc.next().charAt(0);
        double sum = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                double num = sc.nextDouble();
                if (L == i) {
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
