/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1940 Strategy Game
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1940
 * @Timelimit: 1 sec
 * @Status: Accepted 28/10/2015 - 18:41:34 Runtime:0.172s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1940_Strategy_Game {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int j = Integer.parseInt(st[0]);
        int r = Integer.parseInt(st[1]);
        int[] player = new int[j];
        st = br.readLine().split(" ");
        for (int i = 0; i < st.length; i++) {
            player[i % j] += Integer.parseInt(st[i]);
        }
        int winner = 1;
        int highestScore = 0;
        for (int i = 0; i < j; i++) {
            if (player[i] >= highestScore) {
                highestScore = player[i];
                winner = i + 1;
            }
        }
        System.out.println(winner);
    }
}
