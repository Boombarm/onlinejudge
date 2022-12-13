/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1255 Letter Frequency
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1255
 * @Timelimit: 1 sec
 * @Status: Accepted 12/10/2015 - 13:37:33 Runtime:0.112s
 * @Solution:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1255_Letter_Frequency {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int[] characterFrequency = new int[26];
            int maxFrequency = 0;
            String letter = br.readLine().toLowerCase();
            for (int j = 0; j < letter.length(); j++) {
                char c = letter.charAt(j);
                if (isLetter(c)) {
                    characterFrequency[c - 'a']++;
                    if (characterFrequency[c - 'a'] > maxFrequency) {
                        maxFrequency = characterFrequency[c - 'a'];
                    }
                }
            }
            for (int j = 0; j < characterFrequency.length; j++) {
                if (characterFrequency[j] == maxFrequency) {
                    System.out.print((char) (j + 'a'));
                }
            }
            System.out.println("");
        }

    }

    static boolean isLetter(char c) {
        return (c >= 97 && c <= 122);
    }

}
