/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2221 Pomekons Battle
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2221
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 10/20/16, 6:01:52 PM
 * @Runtime: 0.032s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2221_Pomekons_Battle {

    static BufferedReader br;
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        double Dabriel, Guarte;
        String[] st;
        while (t-- > 0) {
            int bonus = Integer.parseInt(br.readLine());
            st = br.readLine().split(" ");
            Dabriel = ((Integer.parseInt(st[0]) + Integer.parseInt(st[1])) / 2.0) + (Integer.parseInt(st[2]) % 2 == 0 ? bonus : 0);
            st = br.readLine().split(" ");
            Guarte = ((Integer.parseInt(st[0]) + Integer.parseInt(st[1])) / 2.0) + (Integer.parseInt(st[2]) % 2 == 0 ? bonus : 0);
            bw.append((Dabriel == Guarte ? "Empate" : (Dabriel > Guarte ? "Dabriel" : "Guarte")) + "\n");
        }
        bw.flush();
    }

}
