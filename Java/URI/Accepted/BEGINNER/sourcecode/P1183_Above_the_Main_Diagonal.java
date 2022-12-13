package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1183 Above the Main Diagonal https://www.urionlinejudge.com.br/judge/en/problems/view/1183
//Accepted 30/08/2015 - 11:34:16 Runtime:0.068s
import java.text.DecimalFormat;
import java.util.Scanner;

public class P1183_Above_the_Main_Diagonal {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");
        Scanner sc = new Scanner(System.in);
        char operation = sc.next().charAt(0);
        double sum = 0;
        int start = 1;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                double num = sc.nextDouble();
                if (j >= start) {
                    sum += num;
                }
            }
            start++;
        }

        if (operation == 'S') {
            System.out.println(df.format(sum));
        } else if (operation == 'M') {
            System.out.println(df.format(sum / 66));
        }
    }

}
