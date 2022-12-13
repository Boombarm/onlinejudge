package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1177 Array Fill II https://www.urionlinejudge.com.br/judge/en/problems/view/1177
//Accepted 14/08/2015 - 17:24:47 Runtime:0.092s
import java.util.Scanner;

public class P1177_Array_Fill_II {

    public static void main(String[] args) {
        int[] number = new int[1000];
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        if (T >= 2 && T <= 50) {
            for (int i = 0, j = 0; i < 1000; i++, j++) {
                if (j == T) {
                    j = 0;
                }
                number[i] = j;
                System.out.println("N[" + i + "] = " + number[i]);
            }
        }
    }

}
