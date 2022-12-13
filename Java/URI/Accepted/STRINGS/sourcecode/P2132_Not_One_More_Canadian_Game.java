package URI.Accepted.STRINGS.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2132 - Not One More Canadian Game!
 * @Category: STRING
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2132
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 6/29/18, 3:40:38 PM
 * @Runtime: 0.040s
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.math.BigInteger;

class P2132_Not_One_More_Canadian_Game {

    public P2132_Not_One_More_Canadian_Game() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        int t = 1;
        BigInteger answer;
        while ((input = br.readLine()) != null) {
            answer = new BigInteger("0");
            char[] c = input.toCharArray();
            int size = c.length;
            for (int i = size - 1, k = 0; i >= 0; i--, k++) {
                if (c[i] == 'b') {
                    BigInteger now = new BigInteger("2");
                    now = now.pow(k);
                    answer = answer.add(now);
                }
            }
            bw.append("Palavra " + (t++) + "\n");
            bw.append(answer + "\n");
            bw.newLine();
        }
        bw.flush();
    }
}
