/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2162 Peaks and Valleys
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2162
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 10/2/16, 4:45:58 PM
 * @Runtime: 0.060
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2162_Peaks_and_Valleys {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String st[] = br.readLine().split(" ");
        boolean peak = true;
        char status = ' ';
        for (int i = 1; i < n; i++) {
            int number1 = Integer.parseInt(st[i - 1]);
            int number2 = Integer.parseInt(st[i]);
            if (number1 == number2) {
                peak = false;
                break;
            } else if (number1 < number2) {
                if (status == 'U') {
                    peak = false;
                    break;
                }
                status = 'U';
            } else if (number1 > number2) {
                if (status == 'D') {
                    peak = false;
                    break;
                }
                status = 'D';
            }
        }
        System.out.println(peak ? "1" : "0");
    }

}
