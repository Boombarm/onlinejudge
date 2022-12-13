package URI.Accepted.BEGINNER.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: BEGINNER
 * @Problem: 2846 : Fibonot
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2846
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory: 960 Bytes
 * @Submission: 9/27/18, 11:52:40 PM
 * @Runtime: 0.100s
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2846_Fibonot {

    static int start, end;
    static int[] fibonaci = new int[31];

    static {
        fibonaci[0] = 1;
        fibonaci[1] = 1;
        for (int i = 2; i <= 30; i++) {
            fibonaci[i] = fibonaci[i - 1] + fibonaci[i - 2];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int index = Integer.parseInt(br.readLine());
        int answer = 0;
        start = end = 0;
        for (int i = 4; i <= 30; i++) {
            start = fibonaci[i - 1];
            end = fibonaci[i];
            index -= (end - start) - 1;
            if (index <= 0) {
                answer = (end + index) - 1;
                break;
            }

        }
        System.out.println(answer);
    }
}
