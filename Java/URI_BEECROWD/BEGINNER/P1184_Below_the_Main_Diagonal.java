package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1184 Below the Main Diagonal https://www.urionlinejudge.com.br/judge/en/problems/view/1184
//Accepted 30/08/2015 - 11:44:35 Runtime:0.060s
import java.text.DecimalFormat;
import java.util.Scanner;

public class P1184_Below_the_Main_Diagonal {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");
        Scanner sc = new Scanner(System.in);
        char operation = sc.next().charAt(0);
        int last = 0;
        double sum = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                double num = sc.nextDouble();
                if (j < last) {
                    sum += num;
                }
            }
            last++;
        }

        if (operation == 'S') {
            System.out.println(df.format(sum));
        } else if (operation == 'M') {
            System.out.println(df.format(sum / 66));
        }
    }

}
