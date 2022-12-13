package URI.Accepted.BEGINNER.sourcecode;


/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2863 - Umil Bolt
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2863
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 9/27/18, 8:01:46 PM
 * @Runtime: 0.064s
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P2863_Umil_Bolt {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while ((input = br.readLine()) != null) {
            int n = Integer.parseInt(input);
            double minimum = Double.MAX_VALUE;
            while (n-- > 0) {
                double x = Double.parseDouble(br.readLine());
                if (minimum > x) {
                    minimum = x;
                }
            }
            bw.append(minimum + "\n");
        }
        bw.flush();

    }
}
