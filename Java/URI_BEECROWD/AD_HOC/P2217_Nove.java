/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: Ad-Hoc
 * @Problem: 2217 Nove
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2217
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 1/17/17, 12:22:31 AM
 * @Runtime: 0.044s
 * @Solution: 9^number the last digit = [1 or 9]
 * @Note:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2217_Nove {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            bw.append((n % 2 == 0 ? "1" : "9") + "\n");
        }
        bw.flush();
    }

}
