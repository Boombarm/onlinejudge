package URI.Accepted.AD_HOC.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: AD-HOC
 * @Problem: 1378 - Isosceles Triangles
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1378
 * @Level:
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 4/4/19, 4:43:35 PM
 * @Runtime: 0.076s
 * @Solution: formula = (L * K) + ((L / D) * P)
 * @Note:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2377_Pedagio {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int L = Integer.parseInt(st[0]);
        int D = Integer.parseInt(st[1]);
        st = br.readLine().split(" ");
        int K = Integer.parseInt(st[0]);
        int P = Integer.parseInt(st[1]);
        System.out.println((L * K) + ((L / D) * P));

    }

}
