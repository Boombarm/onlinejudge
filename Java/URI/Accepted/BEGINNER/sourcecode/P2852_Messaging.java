package URI.Accepted.BEGINNER.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: BEGINNER
 * @Problem: 2852 - Messaging
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2852
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory:
 * @Submission: 1/14/19, 1:06:42 PM
 * @Runtime: 0.284s
 * @Solution: Cesar cipher  by encryptTable
 * @Note: Cesar cipher
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P2852_Messaging {

    static char[][] encryptTable = new char[26][26];

    public static void main(String[] args) throws IOException {

        for (int j = 0; j < 26; j++) {
            for (int k = 0, i = j; k < 26; k++) {
                encryptTable[j][k] = (char) ('a' + i);
                if (++i == 26) i = 0;
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String keyword = br.readLine();
        int keywordSize = keyword.length();
        int n = Integer.parseInt(br.readLine());
        for (int t = 0; t < n; t++) {
            String[] text = br.readLine().split(" ");
            //repeat text by keyword
            int e = 0;
            int q = 0;
            for (String tt : text) {
                if (e > 0) bw.append(" ");
                if (!isConsonant(tt.charAt(0))) {
                    bw.append(tt);
                } else {
                    for (int k = 0; k < tt.length(); k++, q++) {
                        char c1 = tt.charAt(k);
                        if (q == keywordSize) q = 0;
                        char c2 = keyword.charAt(q);
                        int row = (int) c1 - 'a';
                        int column = (int) c2 - 'a';
                        bw.append(Character.toLowerCase(encryptTable[row][column]));
                    }
                }
                e++;
            }

            bw.newLine();
        }
        bw.flush();
    }

    static boolean isConsonant(char c) {
        return c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u';
    }

}
