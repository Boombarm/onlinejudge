package COJ.Accepted;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: COJ
 * @Problem: 1003 - General Election
 * @Link: http://coj.uci.cu/24h/problem.xhtml?pid=1003
 * @Timelimit: 6000 MS
 * @Status: Accepted
 * @Submission: 2018-02-19 14:59:52
 * @Runtime: 7
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1003_General_Election {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] in = br.readLine().split(" ");
            int n = Integer.parseInt(in[0]);
            int m = Integer.parseInt(in[1]);
            int[] score = new int[n];

            for (int i = 0; i < m; i++) {
                in = br.readLine().split(" ");
                for (int j = 0; j < n; j++) {
                    score[j] += Integer.parseInt(in[j]);
                }
            }
            int max = 0;
            int winner = 0;
            for (int i = 0; i < n; i++) {
                if (max < score[i]) {
                    max = score[i];
                    winner = i + 1;
                }
            }
            bw.append(winner + "\n");
        }
        bw.flush();
    }
}
