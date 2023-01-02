package URI.Accepted.BEGINNER.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: BEGINNER
 * @Problem: 2787 - Chess
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2787
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory:
 * @Submission: 6/29/18, 12:32:18 PM
 * @Runtime: 0.052s
 * @Solution:
 * @Note:
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2787_Chess {

    public P2787_Chess() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        if ((a % 2 == 0 && b % 2 == 0) || (a % 2 == 1 && b % 2 == 1)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

}
