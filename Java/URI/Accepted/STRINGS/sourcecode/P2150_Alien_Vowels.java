/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: String
 * @Problem: 2150 - Alien Vowels
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2150
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 1/21/17, 11:32:42 PM
 * @Runtime: 0.036s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P2150_Alien_Vowels {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        String input, word;
        boolean[] vowel;
        while ((input = br.readLine()) != null) {
            char[] v = input.toCharArray();
            word = br.readLine();
            if (word == null) {
                break;
            }
            int count = 0;
            vowel = new boolean[(int) Character.MAX_VALUE];
            for (int i = 0; i < v.length; i++) {
                int c = v[i];
                vowel[c] = true;
            }
            int word_length = word.length();
            for (int i = 0; i < word_length; i++) {
                int c = word.charAt(i);
                if (vowel[c]) {
                    count++;
                }
            }
            out.write((count + "\n").getBytes());
        }
        out.flush();
    }

}
