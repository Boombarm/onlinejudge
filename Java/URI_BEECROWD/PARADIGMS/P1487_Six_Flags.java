/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: PARADIGMS
 * @Problem: 1487 - Six Flags
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1487
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/30/19, 8:59:13 PM
 * @Runtime: 0.108s
 * @Solution: PD - unbounded Knapsack
 * @Note: https://www.geeksforgeeks.org/unbounded-knapsack-repetition-items-allowed/
 */
package URI.Accepted.PARADIGMS.sourcecode.Knapsack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P1487_Six_Flags {

    private static int N, T;
    private static int[] D, P;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = 0;
        String in;
        while (!(in = br.readLine()).equals("0 0")) {
            String[] st = in.split(" +");
            N = Integer.parseInt(st[0]);
            T = Integer.parseInt(st[1]);
            D = new int[N];
            P = new int[N];
            for (int i = 0; i < N; i++) {
                st = br.readLine().split(" +");
                D[i] = Integer.parseInt(st[0]);
                P[i] = Integer.parseInt(st[1]);
            }

            int maxScore = unboundedKnapsack(D, P, T, N);
            bw.append("Instancia " + (++t) + "\n" + maxScore + "\n\n");
        }
        bw.flush();
    }

    private static int unboundedKnapsack(int[] duration, int[] score, int total, int n) {
        int dp[] = new int[total + 1];
        for (int i = 0; i <= total; i++) {
            for (int j = 0; j < n; j++) {
                if (duration[j] <= i) {
                    dp[i] = max(dp[i], dp[i - duration[j]] + score[j]);
                }
            }
        }
        return dp[total];
    }

    private static int max(int a, int b) {
        return (a > b) ? a : b;
    }

}