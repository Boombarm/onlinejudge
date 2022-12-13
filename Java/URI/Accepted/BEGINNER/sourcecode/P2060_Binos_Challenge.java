/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2060 Bino's Challenge
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2060
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 6/4/16, 10:57:34 PM 
 * @Runtime: 0.048s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2060_Binos_Challenge {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int countTwo = 0, countThree = 0, countFour = 0, countFive = 0;
        int list = Integer.parseInt(br.readLine());
        String[] number = br.readLine().split(" ");
        while (list-- > 0) {
            int n = Integer.parseInt(number[list]);
            if ((double) (n % 2) == 0) {
                countTwo++;
            }
            if ((double) (n % 3) == 0) {
                countThree++;
            }
            if ((double) (n % 4) == 0) {
                countFour++;
            }
            if ((double) (n % 5) == 0) {
                countFive++;
            }
        }
        bw.append(countTwo + " Multiplo(s) de 2\n");
        bw.append(countThree + " Multiplo(s) de 3\n");
        bw.append(countFour + " Multiplo(s) de 4\n");
        bw.append(countFive + " Multiplo(s) de 5\n");
        bw.flush();
    }

}
