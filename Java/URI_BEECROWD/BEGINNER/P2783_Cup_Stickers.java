package URI.Accepted.BEGINNER.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: BEGINNER
 * @Problem: 2783 - Cup Stickers
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2783
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory:
 * @Submission: 1/1/19, 1:28:50 AM
 * @Runtime: 0.076s
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P2783_Cup_Stickers {

    static int n, c, m;
    static boolean card[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        n = Integer.parseInt(st[0]);
        c = Integer.parseInt(st[1]);
        m = Integer.parseInt(st[2]);
        st = br.readLine().split(" ");
        card = new boolean[n + 1];
        int answer = c;
        for (int i = 0; i < c; i++) {
            int x = Integer.parseInt(st[i]);
            card[x] = true;
        }
        st = br.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            int x = Integer.parseInt(st[i]);
            if (x <= n && card[x]) {
                answer--;
                card[x] = false;
            }
        }
        System.out.println(answer);
    }
}
