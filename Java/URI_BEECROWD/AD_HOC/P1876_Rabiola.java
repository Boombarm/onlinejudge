/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: AD-HOC
 * @Problem: 1876 - Rabiola
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1876
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 4/19/17, 6:23:45 PM
 * @Runtime: 0.020s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1876_Rabiola {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        String input;
        while ((input = br.readLine()) != null) {
            String[] st = input.split("x");
            int n = st.length;
            int largest = largest(st[0].length(), st[n - 1].length());
            for (int i = 1; i < n - 1; i++) {
                largest = largest(largest, (st[i].length() / 2));
            }
            bw.append(largest + "\n");
            bw.flush();
        }
        bw.flush();
    }

    static int largest(int a, int b) {
        return a > b ? a : b;
    }

}
