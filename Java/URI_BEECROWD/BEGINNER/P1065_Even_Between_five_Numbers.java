package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1065 Even Between five Numbers https://www.urionlinejudge.com.br/judge/en/problems/view/1065
//Accepted 09/08/2015 - 15:42:17 Runtime:0.056s 
import java.util.Scanner;

public class P1065_Even_Between_five_Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (sc.nextInt() % 2 == 0) {
                count++;
            }
        }
        System.out.println(count + " valores pares");

    }

}
