/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1781 Guga and the String
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1781
 * @Timelimit: 2 sec
 * @Status: Accepted
 * @Submission: 2/25/16, 1:01:24 PM
 * @Runtime: 0.488s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class P1781_Guga_and_the_String {

    public static ArrayList<Integer> consonant, vowel;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        int i = 0;
        while (++i <= t) {
            bw.write("Caso #" + i + ":\n");
            consonant = new ArrayList<Integer>();
            vowel = new ArrayList<Integer>();
            char[] text = br.readLine().toCharArray();
            int textSize = text.length;
            for (int j = 0; j < textSize; j++) {
                if (isVowel(text[j])) {
                    vowel.add(j);
                } else {
                    consonant.add(j);
                }
            }
            int q = Integer.parseInt(br.readLine());
            int vowelMove = 0, consonantMove = 0;
            while (q-- > 0) {
                String[] command = br.readLine().split(" ");
                int count;
                if (command[0].equals("0")) {
                    vowelMove += Integer.parseInt(command[1]);

                } else if (command[0].equals("1")) {
                    consonantMove += Integer.parseInt(command[1]);

                } else if (command[0].equals("2")) {
                    char[] temp = Arrays.copyOf(text, textSize);
                    if (vowel.size() > 1) {
                        vowelMove %= vowel.size();
                        int k = 0;
                        for (int v : vowel) {
                            int index = vowel.get((k++ + vowelMove) % vowel.size());
                            text[index] = temp[v];
                        }
                        vowelMove = 0;
                    }

                    if (consonant.size() > 1) {
                        consonantMove %= consonant.size();
                        int k = 0;
                        for (int v : consonant) {
                            int index = consonant.get((k++ + consonantMove) % consonant.size());
                            text[index] = temp[v];
                        }
                        consonantMove = 0;
                    }

                    for (char c : text) {
                        bw.append(c);
                    }
                    bw.newLine();

                }
            }
        }
        bw.flush();
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

}
