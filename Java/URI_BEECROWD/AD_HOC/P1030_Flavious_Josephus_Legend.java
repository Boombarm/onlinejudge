
/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1030 Flavious Josephus Legend
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1030
 * @Timelimit: 1 sec
 * @Status: Accepted 28/11/2015 - 07:56:12 Runtime:0.044s
 * @Solution: josephus Algorithm
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P1030_Flavious_Josephus_Legend {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        int nc = Integer.parseInt(br.readLine());
        for (int i = 1; i <= nc; i++) {
            String[] st = br.readLine().split(" ");
            int n = Integer.parseInt(st[0]);
            int k = Integer.parseInt(st[1]);
            out.write(("Case " + i + ": " + josephus(n, k) + "\n").getBytes());
        }
        out.flush();
    }

    static int josephus(int n, int k) {
        int result = 0;	// when n = 1
        for (int i = 2; i <= n; i++) {
            result = (result + k) % i;
        }
        return result + 1;
    }

}