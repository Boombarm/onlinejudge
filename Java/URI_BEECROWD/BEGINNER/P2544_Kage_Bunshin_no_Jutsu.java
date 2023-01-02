/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: Beginner 
 * @Problem: 2544 - Kage Bunshin no Jutsu
 * @Link:  https://www.urionlinejudge.com.br/judge/en/problems/view/2544
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 5/9/17, 6:37:17 PM
 * @Runtime:  0.032s 
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2544_Kage_Bunshin_no_Jutsu {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        String input;
        while ((input = br.readLine()) != null) {
            int n = Integer.parseInt(input);
            bw.append(solve(n) + "\n");
        }
        bw.flush();
    }

    @SuppressWarnings("empty-statement")
    static int solve(int n) {
        int c = 0;
        for (int i = 1; i < n; i *= 2, c++);
        return c;
    }

}
