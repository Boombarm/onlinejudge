/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2172 Event
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2172
 * @Timelimit: 2 sec
 * @Status: Accepted
 * @Submission: 10/20/16, 6:11:33 PM
 * @Runtime: 0.092s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P2172_Event {

    static BufferedReader br;
    static OutputStream out;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new BufferedOutputStream(System.out);
        String input;
        while (!(input = br.readLine()).equals("0 0")) {
            String[] st = input.split(" ");
            int x = Integer.parseInt(st[0]);
            int m = Integer.parseInt(st[1]);
            out.write(((m * x) + "\n").getBytes());
        }
        out.flush();
    }
}
