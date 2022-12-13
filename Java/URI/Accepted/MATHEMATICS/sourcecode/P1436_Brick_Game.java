/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1436 Brick Game
 * @Link: https://www.urionlinejudge.com.br/judge/en/runs/code/3063046
 * @Status: Accepted 18/10/2015 - 07:56:43 Runtime:0.040s
 * @Solution: median of numberList
 */
package  URI.Accepted.MATHEMATICS.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1436_Brick_Game {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            String[] st = br.readLine().split(" ");
            int n = Integer.parseInt(st[0]);
            int[] members = new int[n];
            for (int j = 1; j <= n; j++) {
                members[j - 1] = Integer.parseInt(st[j]);
            }
            System.out.println("Case " + i + ": " + captain(members));
        }
    }

    static int captain(int[] numberList) {
        return numberList[numberList.length / 2];
    }
}
