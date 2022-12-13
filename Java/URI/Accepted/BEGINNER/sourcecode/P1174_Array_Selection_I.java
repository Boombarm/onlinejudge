package  URI.Accepted.BEGINNER.sourcecode;

import java.util.Scanner;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1174 Array Selection I https://www.urionlinejudge.com.br/judge/en/problems/view/1174
//Accepted 11/08/2015 - 17:25:33 Runtime:0.060s


public class P1174_Array_Selection_I {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] num = new float[100];
        for (int i = 0; i < 100; i++) {
            if (sc.hasNext()) {
                num[i] = sc.nextFloat();
                if (num[i] <= 10) {
                    System.out.println("A[" + i + "] = " + num[i]);
                }
            }
        }
    }

}
