package URI.Accepted.BEGINNER.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2791 - Bean
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2791
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 7/2/18, 11:05:06 AM
 * @Runtime: 0.056s
 * @Solution:
 * @Note:
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2791_Bean {

    public P2791_Bean() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int i = 1;
        for (String s : st) {
            if (s.equals("1")) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
