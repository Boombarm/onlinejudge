/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: AD-HOC
 * @Problem: 1225 - Perfect choir
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1225
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/1/17, 8:36:29 PM
 * @Runtime: 0.072s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1225_Perfect_Choir {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        String input;
        while ((input = br.readLine()) != null) {
            int n = Integer.parseInt(input);
            int sum = 0;
            String[] st = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                sum += Integer.parseInt(st[i]);
            }
            int answer = -1;
            if (sum % n == 0) {
                answer = 1;
                int x = sum / n;
                int j;
                for (int i = 0; i < n && (j = Integer.parseInt(st[i])) < x; ++i) {
                    answer += (x - j);
                }
            }
            bw.append(answer + "\n");
        }
        bw.flush();
    }

}
