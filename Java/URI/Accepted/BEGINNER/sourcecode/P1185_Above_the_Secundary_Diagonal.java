package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1185 Above the Secundary Diagonal https://www.urionlinejudge.com.br/judge/en/problems/view/1185
//Accepted 30/08/2015 - 11:51:45 Runtime:0.064s
import java.text.DecimalFormat;
import java.util.Scanner;

public class P1185_Above_the_Secundary_Diagonal {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");
        Scanner sc = new Scanner(System.in);
        char operation = sc.next().charAt(0);
        int end = 10;
        double sum = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                double num = sc.nextDouble();
                if (j <= end) {
                    sum += num;
                }
            }
            end--;
        }

        if (operation == 'S') {
            System.out.println(df.format(sum));
        } else if (operation == 'M') {
            System.out.println(df.format(sum / 66));
        }
    }

}
