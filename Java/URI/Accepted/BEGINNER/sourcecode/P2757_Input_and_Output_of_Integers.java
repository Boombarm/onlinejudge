package URI.Accepted.BEGINNER.sourcecode;


/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: BEGINNER
 * @Problem: 2757 - Input and Output of Integers
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2757
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 12/25/18, 11:27:57 AM
 * @Runtime: 0.060s
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2757_Input_and_Output_of_Integers {

    static int a, b, c;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());
        System.out.println("A = " + a + ", B = " + b + ", C = " + c);
        System.out.println("A = " + String.format("%10s", a) + ", B = " + String.format("%10s", b) + ", C = " + String.format("%10s", c));
        System.out.println("A = " + fillLeftZero(a + "", 10) + ", B = " + fillLeftZero(b + "", 10) + ", C = " + fillLeftZero(c + "", 10));
        System.out.println("A = " + String.format("%-10s", a) + ", B = " + String.format("%-10s", b) + ", C = " + String.format("%-10s", c));
    }

    static String fillLeftZero(String number, int digit) {
        int fillSize = digit - number.length();
        if (number.startsWith("-")) {
            number = number.substring(1);
            for (int i = 0; i < fillSize; i++) {
                number = "0" + number;
            }
            number = "-" + number;
        } else {
            for (int i = 0; i < fillSize; i++) {
                number = "0" + number;
            }
        }
        return number;
    }

}
