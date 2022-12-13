/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: PARADIGMS
 * @Problem: 1288 - Destruction Cannon
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1288
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/30/19, 11:41:28 PM
 * @Runtime: 0.248s
 * @Solution: DP knapsack
 * @Note: https://www.youtube.com/watch?v=Nj0AB6el5Kk&list=PL0ROnaCzUGB65_YkASLAEmcW_mtxFtq4m&index=11
 */
package URI.Accepted.PARADIGMS.sourcecode.Knapsack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P1288_Destruction_Cannon {

    private static int T, N, K, R;
    private static int[] power, weight;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());
            power = new int[N + 1];
            weight = new int[N + 1];
            for (int j = 1; j <= N; j++) {
                String[] st = br.readLine().split(" ");
                int x = Integer.parseInt(st[0]);
                int y = Integer.parseInt(st[1]);
                power[j] = x;
                weight[j] = y;
            }
            K = Integer.parseInt(br.readLine());
            R = Integer.parseInt(br.readLine());
            int totalDamage = knapsack(power, weight, K, N);
            if (totalDamage >= R) {
                bw.append("Missao completada com sucesso\n");
            } else {
                bw.append("Falha na missao\n");
            }
        }
        bw.flush();
    }

    static int knapsack(int[] power, int[] weight, int totalWeight, int n) {
        int[][] memory = new int[N + 1][totalWeight + 1];
        return knapsackTopDown(power, weight, n, totalWeight, memory);
    }

    static int knapsackTopDown(int[] power, int[] weight, int i, int j, int[][] memory) {
        if (i == 0 || j == 0) return 0;
        if (memory[i][j] > 0) return memory[i][j];
        if (j < weight[i]) {
            memory[i][j] = knapsackTopDown(power, weight, i - 1, j, memory);
            return memory[i][j];
        }
        memory[i][j] = max(
                knapsackTopDown(power, weight, i - 1, j, memory),
                knapsackTopDown(power, weight, i - 1, j - weight[i], memory) + power[i]
        );
        return memory[i][j];
    }

    static int max(int a, int b) {
        return a > b ? a : b;
    }

}