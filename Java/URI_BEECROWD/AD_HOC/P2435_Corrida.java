/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: AD-HOC
 * @Problem: 2435 - Corrida
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2435
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 7/7/19, 7:30:12 PM
 * @Runtime: 0.096s
 * @Solution: s = Vt
 * @Note:
 */
package URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P2435_Corrida {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int id1 = Integer.parseInt(input[0]);
        int v1 = Integer.parseInt(input[1]);
        int t1 = Integer.parseInt(input[2]);
        double value1 = (double)v1/t1;
        input = br.readLine().split(" ");
        int id2 = Integer.parseInt(input[0]);
        int v2 = Integer.parseInt(input[1]);
        int t2 = Integer.parseInt(input[2]);
        double value2 = (double) v2/t2;

        System.out.println(value1 < value2 ? id1 : id2);
    }

}