/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: AD-HOC
 * @Problem: 2508 - Fortune Teller 
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2508
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/15/17, 2:32:34 AM
 * @Runtime: 0.040s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2508_Fortune_Teller {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        int[] valueCharacter = new int[26];
        for (int i = 0; i < 26; i++) {
            valueCharacter[i] = (i % 9) + 1;
        }
        String input;
        int sum, lucky_number;
        while ((input = br.readLine()) != null) {
            char[] st = input.toCharArray();
            sum = 0;
            for (char c : st) {
                if (c == ' ') {
                    continue;
                }
                sum += valueCharacter[(c & 0x5f) - 65];
            }
            while (true) {
                st = (sum + "").toCharArray();
                int size = st.length;
                if (size == 1) {
                    lucky_number = sum;
                    break;
                }
                sum = 0;
                for (int i = 0; i < size; i++) {
                    sum += st[i] - '0';
                }
            }
            bw.append(lucky_number + "\n");
        }
        bw.flush();
    }

}
