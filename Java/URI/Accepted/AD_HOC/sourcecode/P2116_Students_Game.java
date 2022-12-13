/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: AD-HOC
 * @Problem: 2116 - Students Game
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2116
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 4/7/19, 5:02:47 PM
 * @Runtime: 0.056s
 * @Solution:
 * @Note:
 */
package URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P2116_Students_Game {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int n = Integer.parseInt(st[0]);
        int m = Integer.parseInt(st[1]);
        System.out.println(maximumPrime(n) * maximumPrime(m));
    }

    static int maximumPrime(int x) {
        int result = x;
        for (int i = x; i >= 2; i--) {
            int counter = 0;
            for (int num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                result = i;
                break;
            }

        }
        return result;
    }
}