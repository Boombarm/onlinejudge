/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1414 World Cup
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1414
 * @Timelimit: 1 sec
 * @Status: Accepted 26/12/2015 - 17:43:48 Runtime:0.068s
 * @Solution:  when a team wins a game, it gets 3 points if the game ends in a draw, both teams get 1 point, and the loser no points.
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P1414_World_Cup {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        String input;
        while (!(input = br.readLine()).equals("0 0")) {
            String[] st = input.split(" ");
            int t = Integer.parseInt(st[0]);
            int n = Integer.parseInt(st[1]);
            int answer = 0;
            int sum = 0;
            for (int i = 0; i < t; i++) {
                st = br.readLine().split(" ");
                int score = Integer.parseInt(st[1]);
                sum += score;
            }
            out.write((sum == n * 3 ? "0\n" : (n * 3 - sum) + "\n").getBytes());
        }
        out.flush();
    }
}
