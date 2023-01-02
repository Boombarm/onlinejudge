package AIZU.Accepted.ITP1;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: AIZU ONLINE JUDGE
 * @Categories: Character
 * @Problem: ITP1_8_C - Counting Characters
 * @Link: http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_8_C
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory: 24400 KB
 * @Submission: 2018-03-15 11:29
 * @Runtime: 00:06 s
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class ITP1_8_C_Counting_Characters {

    public static void main(String args[]) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in, "ISO-8859-1");
        OutputStreamWriter ow = new OutputStreamWriter(System.out, "ISO-8859-1");
        BufferedWriter bw = new BufferedWriter(ow);
        BufferedReader br = new BufferedReader(ir);
        int[] count = new int[26];
        String input;
        while ((input = br.readLine()) != null) {
            for (char c : input.toCharArray()) {
                if (c >= 'a' && c <= 'z') {
                    count[c - 'a']++;
                } else if (c >= 'A' && c <= 'Z') {
                    count[c - 'A']++;
                }
            }
        }
        for (int i = 'a'; i <= 'z'; i++) {
            bw.append((char) i + " : " + count[i - 'a'] + "\n");
        }
        bw.flush();
    }

}
