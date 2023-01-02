package URI.Accepted.BEGINNER.sourcecode;


/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2807 - Iccanobif
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2807
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 7/2/18, 12:16:16 PM
 * @Runtime: 0.056s
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P2807_Iccanobif {

    int[] num = new int[40];

    public P2807_Iccanobif() throws IOException {
        num[0] = 1;
        num[1] = 1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int k = 1;
        if (n > 2) {
            for (int i = 2; i < n; i++) {
                num[i] = num[i - 1] + num[i - 2];
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            bw.append(num[i] + (i > 0 ? " " : ""));
        }
        bw.newLine();
        bw.flush();
    }


}
