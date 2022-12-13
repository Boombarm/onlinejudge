/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: DATASTRUCTURE AND LIBRALIES
 * @Problem: 2496 - The Only Chance
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2496
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/18/17, 4:36:57 PM
 * @Runtime: 0.028s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2496_The_Only_Chance {

    static char[] sequence;

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        int t = Integer.parseInt(br.readLine());
        char[] character = new char[26];
        for (int i = 0; i < 26; i++) {
            character[i] = (char) ('A' + i);
        }
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            sequence = br.readLine().toCharArray();
            int count = 0;
            if (!isOrdered(n)) {
                int j = 0, k = 0;
                for (int i = 0; i < n; i++) {
                    char c = sequence[i];
                    if (c != character[i]) {
                        count++;
                        if (count > 2) {
                            break;
                        }
                        if (count == 1) {
                            j = i;
                        } else {
                            k = i;
                        }
                    }
                }
                if (count == 2) {
                    char tmp = sequence[j];
                    sequence[j] = sequence[k];
                    sequence[k] = tmp;
                }
                bw.append((count <= 2 ? "There are the chance." : "There aren't the chance.") + "\n");
            } else {
                bw.append("There are the chance.\n");
            }
        }
        bw.flush();
    }

    private static boolean isOrdered(int n) {
        for (int i = 0; i < n; i++) {
            if (sequence[i] != (char) ('A' + i)) {
                return false;
            }
        }
        return true;
    }

}
