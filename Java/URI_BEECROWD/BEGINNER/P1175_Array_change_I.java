package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1175 Array change I https://www.urionlinejudge.com.br/judge/en/problems/view/1175
//Accepted 11/08/2015 - 17:14:09 Runtime:0.048s 
import java.util.Scanner;

public class P1175_Array_change_I {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[20];
        for (int i = 0; i < 20; i++) {
            if (sc.hasNext()) {
                num[i] = sc.nextInt();
            }
        }
        int first = 0, last = 19;
        while (first != 10) {
            int tmp = num[first];
            num[first] = num[last];
            num[last] = tmp;
            first++;
            last--;
        }

        for (int i = 0; i < 20; i++) {
            System.out.println("N[" + i + "] = " + num[i]);
        }
    }

}
