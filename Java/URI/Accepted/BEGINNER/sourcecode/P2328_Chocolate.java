/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2328 - Chocolate
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2328
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 11/3/19, 10:42:48 AM
 * @Runtime: 0.108s
 * @Solution:
 * @Note:
 */

package URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2328_Chocolate {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int total = 0;
        String[] in = br.readLine().split(" ");
        for(String x : in){
            total += Integer.parseInt(x)-1;
        }
        System.out.println(total);
    }
}
