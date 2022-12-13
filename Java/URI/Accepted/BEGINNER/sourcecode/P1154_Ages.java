package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1154 Ages https://www.urionlinejudge.com.br/judge/en/problems/view/1154
//Accepted 14/08/2015 - 11:46:18 Runtime:0.052s
import java.text.DecimalFormat;
import java.util.Scanner;

public class P1154_Ages {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int sum = 0, count = 0;
        while (sc.hasNext()) {
            int num = sc.nextInt();
            if (num < 0) {
                break;
            }
            sum += num;
            count++;
        }
        System.out.println(df.format((double) sum / count));
    }

}
