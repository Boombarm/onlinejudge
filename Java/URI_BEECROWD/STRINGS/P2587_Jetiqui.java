package URI.Accepted.STRINGS.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: STRING
 * @Problem: 2587 - Jetiqui
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2587
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @LANGUAGE: JAVA 7
 * @Submission: 3/25/18, 10:03:32 PM
 * @Runtime: 0.024s
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;

class P2587_Jetiqui {

    public P2587_Jetiqui() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            char[] c1 = br.readLine().toCharArray();
            char[] c2 = br.readLine().toCharArray();
            char[] c3 = br.readLine().toCharArray();
            int[] index = new int[2];
            boolean[] letter = new boolean[26];
            int count = 0;
            int i = 0, j = 0;
            for (char c : c3) {
                if (c == '_') {
                    int p1 = c1[i] - 'a';
                    int p2 = c2[i] - 'a';
                    index[j++] = i;
                    if (!letter[p1]) {
                        letter[p1] = true;
                        count++;
                    }
                    if (!letter[p2]) {
                        letter[p2] = true;
                        count++;
                    }
                }
                i++;
            }
            if (count < 3 || (c2[index[0]] == c1[index[1]] || c1[index[0]] == c2[index[1]])) {
                bw.append("Y\n");
            } else {
                bw.append("N\n");
            }
        }
        bw.flush();
    }

}



