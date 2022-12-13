package URI.Accepted.BEGINNER.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: BEGINNER
 * @Problem: 2867 : Digits
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1790
 * @Level: 5
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 9/27/18, 7:46:41 PM
 * @Runtime: 0.484s
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;

public class P2867_Digits {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String[] st = br.readLine().split(" ");
            int answer = new BigDecimal(st[0]).pow(Integer.parseInt(st[1])).toString().length();
            bw.append(answer + "\n");
        }
        bw.flush();
    }


}
