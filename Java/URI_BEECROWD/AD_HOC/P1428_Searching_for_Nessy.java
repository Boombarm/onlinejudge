/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1428 Searching for Nessy
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1428
 * @Timelimit: 1 sec
 * @Status: Accepted 27/12/2015 - 19:35:24 Runtime:0.100s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P1428_Searching_for_Nessy {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] st = br.readLine().split(" ");
            int n = Integer.parseInt(st[0]);
            int m = Integer.parseInt(st[1]);
            out.write((((n / 3) * (m / 3)) + "\n").getBytes());
        }
        out.flush();
    }

}
