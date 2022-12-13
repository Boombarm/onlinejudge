package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1172 Array Replacement I https://www.urionlinejudge.com.br/judge/en/problems/view/1172
//Accepted 13/08/2015 - 16:51:41 Runtime:0.044s
import java.util.Scanner;

public class P1172_Array_Replacement_I {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number[] = new int[10];
        for (int i = 0; i < 10; i++) {
            number[i] = sc.nextInt();
            if (number[i] <= 0) {
                number[i] = 1;
            }
            System.out.println("X[" + i + "] = " + number[i]);
        }
    }

}
