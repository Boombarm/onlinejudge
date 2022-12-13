/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1739 Threebonacci Sequence
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1739
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 4/6/16, 4:33:42 PM
 * @Runtime: 0.048s
 * @Solution: create fibonacci number and find 3 in number 
 * @Note:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P1739_Threebonacci_Sequence {

    static long[] fibonacci = new long[100];
    static long[] threebonacci = new long[60];

    public static void main(String[] args) throws IOException {
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        int n = fibonacci.length;
        int i = 2;
        int c = 0;
        do {
            fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
            if (fibonacci[i] % 3 == 0 || findThree(fibonacci[i] + "")) {
                threebonacci[c] = fibonacci[i];
                c++;
            }
            i++;
        } while (c < 60);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        String input;
        while ((input = br.readLine()) != null) {
            int index = Integer.parseInt(input) - 1;
            out.write((threebonacci[index] + "\n").getBytes());
            out.flush();
        }
        out.flush();

    }

    private static boolean findThree(String number) {
        int size = number.length();
        for (int i = 0; i < size; i++) {
            if (number.charAt(i) == '3') {
                return true;
            }
        }
        return false;
    }

}
