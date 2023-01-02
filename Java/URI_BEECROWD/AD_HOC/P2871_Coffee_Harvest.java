package URI.Accepted.AD_HOC.sourcecode;


/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2871 - Coffee Harvest
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2871
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 11/28/18, 3:53:09 PM
 * @Runtime: 0.168s
 * @Solution: SUM then split answer
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2871_Coffee_Harvest {

    static int M, N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while ((input = br.readLine()) != null) {
            String[] st = input.split(" ");
            M = Integer.parseInt(st[0]);
            N = Integer.parseInt(st[1]);
            int bag = 0;
            double leftover = 0;
            for (int i = 0; i < M; i++) {
                st = br.readLine().split(" ");
                for (int j = 0; j < N; j++) {
                    leftover += Integer.parseInt(st[j]);
                }
            }
            if (leftover >= 60) {
                bag = (int) leftover / 60;
                leftover = leftover - (bag * 60);
            }
            bw.append(bag + " saca(s) e " + (int) leftover + " litro(s)\n");
        }
        bw.flush();
    }
}
