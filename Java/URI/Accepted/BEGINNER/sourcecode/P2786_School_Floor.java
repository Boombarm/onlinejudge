package URI.Accepted.BEGINNER.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: BEGINNER
 * @Problem: 2786 - School Floor
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2786
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory:
 * @Submission: 10/20/18, 9:51:58 PM
 * @Runtime: 0.084s
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P2786_School_Floor {

    private static int L;
    private static int C;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        L = Integer.parseInt(br.readLine());
        C = Integer.parseInt(br.readLine());
        int answer1 = (C * L) + ((C - 1) * (L - 1));
        int answer2 = ((L - 1) * 2) + ((C - 1) * 2);
        System.out.println(answer1);
        System.out.println(answer2);
    }

}
