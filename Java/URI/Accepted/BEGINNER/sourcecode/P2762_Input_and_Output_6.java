package URI.Accepted.BEGINNER.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: BEGINNER
 * @Problem: 2762 - Input and Output 6
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2762
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory: 454 Bytes
 * @Submission: 9/27/18, 9:32:22 PM
 * @Runtime: 0.080s
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2762_Input_and_Output_6 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split("\\.");
        int a = Integer.parseInt(st[0]);
        int b = Integer.parseInt(st[1]);
        System.out.println(b + "." + a);
    }
}
