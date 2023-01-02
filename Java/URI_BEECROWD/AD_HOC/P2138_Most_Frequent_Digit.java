/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: Ad-Hoc
 * @Problem: 2138 - Most Frequent Digit
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2138
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 1/20/17, 5:13:08 PM
 * @Runtime: 0.032s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P2138_Most_Frequent_Digit {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        String input;
        while ((input = br.readLine()) != null) {
            int[] frequent = new int[10];
            char[] c = input.toCharArray();
            int max = 0;
            int number = 0;
            for (char s : c) {
                int index = s - '0';
                if (++frequent[index] > max) {
                    max = frequent[index];
                }
            }
            for (int i = 0; i < 10; i++) {
                if (frequent[i] == max) {
                    number = i;
                }
            }
            out.write((number + "\n").getBytes());
        }
        out.flush();
    }

}
