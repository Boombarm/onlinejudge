/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: AD-HOC
 * @Problem: 2339 -
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2339
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 4/5/19, 2:15:43 AM
 * @Runtime: 0.080s
 * @Solution:
 * @Note:
 */
package URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P2339_Avioes_de_Papel {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int C = Integer.parseInt(st[0]);
        int P = Integer.parseInt(st[1]);
        int F = Integer.parseInt(st[2]);
        boolean isSufficient = true;
        if (C * F > P) isSufficient = false;
        System.out.println(isSufficient ? "S" : "N");
    }

}