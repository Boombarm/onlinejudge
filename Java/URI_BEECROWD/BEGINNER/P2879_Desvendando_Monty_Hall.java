package URI.Accepted.BEGINNER.sourcecode;
/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: BEGINNER
 * @Problem: 2879 - Desvendando Monty Hall
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2879
 * @Timelimit: 2 sec
 * @Status: Accepted
 * @Memory:
 * @Submission: 12/30/18, 10:39:53 PM
 * @Runtime: 0.076s
 * @Solution: order pattern
 * @Note:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2879_Desvendando_Monty_Hall {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(br.readLine()) != 1) count++;

        }
        System.out.println(count);
    }
}
