/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1276 Letter Range
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1276
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 2/16/16, 5:44:14 PM
 * @Runtime: 0.140s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1276_Letter_Range {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while ((input = br.readLine()) != null) {
            if (input.isEmpty()) {
                bw.newLine();
                continue;
            }
            boolean[] found = new boolean[26];
            input = input.replaceAll("\\s", "");
            char[] letter = input.toCharArray();
            int size = input.length();
            int i = 0;
            do {//find
                found[(letter[i] - 97)] = true;//a = 97
            } while (++i < size);

            i = 0;
            boolean hasPrinted = false;
            do {
                if (found[i]) {
                    char start = (char) (i + 97);
                    i++;
                    for (; i < 26; i++) {
                        if (!found[i]) {
                            break;
                        }
                    }
                    char end = (char) (i + 96);
                    if (!hasPrinted) {
                        bw.append(start + ":" + end);
                        hasPrinted = true;
                    } else {
                        bw.append(", " + start + ":" + end);
                    }
                }
            } while (++i < 26);
            bw.newLine();
        }
        bw.flush();
    }

}
