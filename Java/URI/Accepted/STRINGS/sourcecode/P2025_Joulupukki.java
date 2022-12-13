/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2025 Joulupukki
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2025
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 2/25/16, 6:31:53 PM
 * @Runtime: 0.068s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2025_Joulupukki {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            char[] text = br.readLine().toCharArray();
            int size = text.length;
            int i = 0;
            for (; i < size; i++) {
                if (i + 1 < size - 1 && text[i + 1] == 'o') {
                    if (text[i] != ' ' && i + 8 <= size - 1 && text[i + 8] != ' ') {
                        int f = isContains(text, i + 1);
                        if (f == 7) {
                            bw.append("Joulupukki");
                            i += 9;
                        } else {
                            bw.append(new String(text, i, f));
                        }
                    } else {
                        bw.append(text[i]);
                    }
                } else {
                    bw.append(text[i]);
                }
            }
            bw.newLine();
        }
        bw.flush();
    }

    private static int isContains(char[] text, int i) {
        char[] o = {'u', 'l', 'u', 'p', 'u', 'k', 'k'};
        int j = 1;
        for (; j < 7; j++) {
            if (text[i + j] != o[j - 1]) {
                break;
            }
        }
        return j;
    }
}
