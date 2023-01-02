/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: BEGINNER
 * @Problem: 2502 - Deciphering the Encrypted Card
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2502
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/14/17, 2:09:11 PM
 * @Runtime: 0.036s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2502_Deciphering_the_Encrypted_Card {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        String input;
        char[] decode;
        while ((input = br.readLine()) != null) {
            String[] st = input.split(" ");
            int csize = Integer.parseInt(st[0]);
            int n = Integer.parseInt(st[1]);
            decode = new char[256];
            char[] c1 = br.readLine().toCharArray();
            char[] c2 = br.readLine().toCharArray();
            for (int i = 0; i < 256; i++) {
                decode[i] = (char) i;
            }
            for (int i = 0; i < csize; i++) {
                char c1Upper = Character.toUpperCase(c1[i]);
                char c1Lower = Character.toLowerCase(c1[i]);
                char c2Upper = Character.toUpperCase(c2[i]);
                char c2Lower = Character.toLowerCase(c2[i]);
                //uppercase
                decode[c1Upper] = c2Upper;
                decode[c2Upper] = c1Upper;
                //lowercase
                decode[c1Lower] = c2Lower;
                decode[c2Lower] = c1Lower;
            }
            while (n-- > 0) {
                char[] text = br.readLine().toCharArray();
                for (char c : text) {
                    bw.append(decode[c]);
                }
                bw.newLine();
            }
            bw.newLine();
        }
        bw.flush();
    }

}
