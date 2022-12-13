/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1615 Insatisfaction on Elections
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1615
 * @Timelimit: 1 sec
 * @Status: Accepted 27/12/2015 - 07:54:54 Runtime:0.144s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P1615_Insatisfaction_on_Elections {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String[] st = br.readLine().split(" ");
            int n = Integer.parseInt(st[0]);
            int m = Integer.parseInt(st[1]);
            int[] scoreBoard = new int[n];
            st = br.readLine().split(" ");
            int winner = -1;
            for (int j = 0; j < m; j++) {
                int vote = Integer.parseInt(st[j]);
                scoreBoard[vote - 1]++;
                if (scoreBoard[vote - 1] > m / 2) {
                    winner = vote;
                }
            }

            out.write((winner + "\n").getBytes());
        }
        out.flush();
    }

}
