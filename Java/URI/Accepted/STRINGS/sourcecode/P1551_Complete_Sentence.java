/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: Complete Sentence
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1551
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 2/16/16, 6:57:09 PM
 * @Runtime: 0.060s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class P1551_Complete_Sentence {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            char[] c = br.readLine().toCharArray();
            HashSet<Character> set = new HashSet<Character>();
            int size = c.length;
            int i = 0;
            do {
                switch (c[i]) {
                    case ' ':
                    case ',':
                        break;
                    default:
                        set.add(c[i]);
                        break;
                }
            } while (++i < size);
            int amount = set.size();
            if (amount < 13) {
                bw.append("frase mal elaborada\n");
            } else if (amount < 26) {
                bw.append("frase quase completa\n");
            } else {
                bw.append("frase completa\n");
            }
        }
        bw.flush();
    }

}
