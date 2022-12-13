package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1064 Positives and Average https://www.urionlinejudge.com.br/judge/en/problems/view/1064
//Accepted 11/08/2015 - 08:15:23 Runtime:0.064s 
import java.util.Scanner;

public class P1064_Positives_and_Average {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countPositive = 0;
        float sum = 0;
        for (int i = 0; i < 6; i++) {
            float num = sc.nextFloat();
            if (num > 0) {
                countPositive++;
                sum += num;
            }
        }
        System.out.println(countPositive + " valores positivos");
        System.out.println(sum / countPositive);
    }

}
