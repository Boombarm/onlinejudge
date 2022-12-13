/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1310 Profit
 * @Categories: PARADIGMS
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1310
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 2/26/16, 1:11:50 PM
 * @Runtime: 0.080s
 * @Solution: search maximum subArray (Kadane's algorithm)
 * @Note:
 */
package  URI.Accepted.PARADIGMS.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P1310_Profit {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        String input;
        while ((input = br.readLine()) != null) {
            int n = Integer.parseInt(input);
            int[] revenue = new int[n];
            int perDayCost = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                revenue[i] = Integer.parseInt(br.readLine());
            }
            int profit = 0;
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = i; j < n; j++) {
                    sum = (sum + revenue[j]) - perDayCost;
                    if (sum > profit) {
                        profit = sum;
                    }
                }
            }
            out.write((profit + "\n").getBytes());
        }
        out.flush();
    }

}
