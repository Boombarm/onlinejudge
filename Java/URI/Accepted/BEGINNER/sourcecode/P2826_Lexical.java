package URI.Accepted.BEGINNER.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: BEGINNER
 * @Problem: 2826 : Lexical
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2826
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory: 781 Bytes
 * @Submission: 10/1/18, 2:01:42 PM
 * @Runtime: 0.096s
 * @Solution: compare String
 * @Note:
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P2826_Lexical {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text1 = br.readLine();
        String text2 = br.readLine();
        String[] st = sort(text1, text2);
        System.out.println(st[0]);
        System.out.println(st[1]);
    }

    static String[] sort(String text1, String text2) {
        if (text1.compareTo(text2) < 0) {
            return new String[]{text1, text2};
        } else if (text1.compareTo(text2) > 0) {
            return new String[]{text2, text1};
        }
        return new String[]{text1, text2};
    }

}
