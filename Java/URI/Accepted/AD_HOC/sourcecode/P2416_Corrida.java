/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: AD-HOC
 * @Problem: 2416 - Corrida
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2416
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 4/6/19, 12:38:59 AM
 * @Runtime: 0.060s
 * @Solution:
 * @Note:
 */
package URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P2416_Corrida {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int C = Integer.parseInt(st[0]);
        int N = Integer.parseInt(st[1]);
        System.out.println(C % N);
    }

}