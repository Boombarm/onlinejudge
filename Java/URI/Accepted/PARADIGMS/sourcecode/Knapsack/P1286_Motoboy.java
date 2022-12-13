package URI.Accepted.PARADIGMS.sourcecode.Knapsack;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: PARADIGMS
 * @Problem: 1286 - Motoboy
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1286
 * @Level: 4
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/3/19, 2:00:21 AM
 * @Runtime: 0.140s
 * @Solution: 0/1 Knapsack TOP-DOWN
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P1286_Motoboy {
    private static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String in;
        while (!(in = br.readLine()).equals("0")) {
            N = Integer.parseInt(in);
            int total = Integer.parseInt(br.readLine());//W
            int[] time = new int[N + 1];//w
            int[] pizza = new int[N + 1];//v
            for (int i = 1; i <= N; i++) {
                String[] st = br.readLine().split(" ");
                int a = Integer.parseInt(st[0]);
                int b = Integer.parseInt(st[1]);
                time[i] = a;
                pizza[i] = b;
            }
            int answer = knapsackTopDown(time, pizza, total, N);
            bw.append(answer + " min.\n");
        }
        bw.flush();
    }

    static int knapsackTopDown(int[] time, int[] pizza, int total, int n) {
        int[][] memory = new int[n + 1][total + 1];
        return knapsackTopDown(time, pizza, n, total, memory);
    }

    static int knapsackTopDown(int[] v, int[] w, int i, int j, int[][] memory) {
        if (i == 0 || j == 0) return 0;
        if (memory[i][j] > 0) return memory[i][j];
        if (j < w[i]) {
            memory[i][j] = knapsackTopDown(v, w, i - 1, j, memory);
            return memory[i][j];
        }
        memory[i][j] = max(knapsackTopDown(v, w, i - 1, j, memory), knapsackTopDown(v, w, i - 1, j - w[i], memory) + v[i]);
        return memory[i][j];
    }

    static int max(int a, int b) {
        return a > b ? a : b;
    }

}
