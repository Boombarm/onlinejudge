package  URI.Accepted.MATHEMATICS.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1170 Blobs https://www.urionlinejudge.com.br/judge/en/problems/view/1170
//Accepted 26/09/2015 - 02:20:29 Runtime:0.124s
import java.util.Scanner;

public class P1170_Blobs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int day = 0;
            float food = sc.nextFloat();
            while (food > 1) {
                food /= 2;
                day++;
            }
            System.out.println(day + " dias");
        }
    }
}
