/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2006 Identifying Tea
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2006
 * @Timelimit: 1 sec
 * @runtime:  0.060s
 * @Status: Accepted
 * @Solution:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2006_Identifying_Tea {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int teaAnswer = Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int correct = 0;
        int i = 0;
        do {
            if (Integer.parseInt(stk.nextToken()) == teaAnswer) {
                correct++;
            }
        } while (++i < 5);
        System.out.println(correct);
    }
}
