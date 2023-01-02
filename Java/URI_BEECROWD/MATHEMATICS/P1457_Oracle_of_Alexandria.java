/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge 
 * @Problem: 1457 Oracle of Alexandria
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1457
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/27/16, 11:54:17 AM
 * @Runtime: 0.052s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.MATHEMATICS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1457_Oracle_of_Alexandria {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String input = br.readLine();
            int size = input.length();
            int i = 0;
            for (; i < size; i++) {
                if (input.charAt(i) == '!') {
                    break;
                }
            }
            int totalFac = (size - i);
            int number = Integer.parseInt(input.substring(0, i));
            long answer = number;
            int count = 1;
            while (number - (count * totalFac) >= 1) {
                answer *= (number - (count * totalFac));
                count++;
            }
            bw.append(answer + "\n");
        }
        bw.flush();
    }

}
