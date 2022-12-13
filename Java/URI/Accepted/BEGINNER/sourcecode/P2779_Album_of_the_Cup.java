package URI.Accepted.BEGINNER.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: BEGINNER
 * @Problem: 2779 - Album of the Cup
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2779
 * @Timelimit: 2 sec
 * @Status: Accepted
 * @Memory:
 * @Submission: 12/31/18, 7:56:21 PM
 * @Runtime: 0.076s
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2779_Album_of_the_Cup {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int stored = 0;
        boolean[] collection = new boolean[n + 1];
        for (int i = 0; i < m; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x > n) continue;
            if (!collection[x]) {
                collection[x] = true;
                stored++;
            }
        }
        System.out.println(n - stored);
    }

}
