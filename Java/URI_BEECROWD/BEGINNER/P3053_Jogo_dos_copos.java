/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: BEGINNER
 * @Problem: 3053 -
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/3053
 * @Timelimit: 1 sec
 * @Status: ACCEPTED
 * @Submission: 4/21/20, 12:11:51 PM
 * @Runtime: : 0.108s
 * @Solution:
 * @Note:
 */

package URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P3053_Jogo_dos_copos {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char coin = br.readLine().charAt(0);
        while (n-- > 0) {
            int command = Integer.parseInt(br.readLine());
            if (command == 1) {
                if (coin == 'A') {
                    coin = 'B';
                } else if (coin == 'B') {
                    coin = 'A';
                }
            } else if (command == 2) {
                if (coin == 'B') {
                    coin = 'C';
                } else if (coin == 'C') {
                    coin = 'B';
                }
            } else if (command == 3) {
                if (coin == 'A') {
                    coin = 'C';
                } else if (coin == 'C') {
                    coin = 'A';
                }
            }
        }
        System.out.println(coin);
    }
}
