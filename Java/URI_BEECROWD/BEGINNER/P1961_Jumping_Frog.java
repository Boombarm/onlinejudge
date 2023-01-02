/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1961 Jumping Frog
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1961
 * @Timelimit: 1 sec
 * @Status: Accepted 06/11/2015 - 10:35:14 Runtime:0.052s
 * @Solution:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1961_Jumping_Frog {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int p = Integer.parseInt(st[0]);
        int n = Integer.parseInt(st[1]);
        st = br.readLine().split(" ");
        int now = Integer.parseInt(st[0]);
        for (int i = 1; i < st.length; i++) {
            int nextPipe = Integer.parseInt(st[i]);
            if ((now + p) < nextPipe || (now - p) > nextPipe) {
                System.out.println("GAME OVER");
                System.exit(0);
            }
            now = nextPipe;
        }
        System.out.println("YOU WIN");
    }

}
