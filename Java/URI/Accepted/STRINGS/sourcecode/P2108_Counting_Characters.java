/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: String
 * @Problem: 2108 - Counting Characters
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2108
 * @Timelimit: 3 sec
 * @Status: Accepted
 * @Submission: 1/20/17, 11:35:32 PM
 * @Runtime: 0.044s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2108_Counting_Characters {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String biggest = "";
        int maxLength = 0;
        String input;
        while (!(input = br.readLine()).equals("0")) {
            String[] st = input.split(" ");
            boolean hasPrint = false;
            for (String s : st) {
                int length = s.length();
                if (maxLength <= length) {
                    maxLength = length;
                    biggest = s;
                }
                if (hasPrint) {
                    bw.append("-" + length);
                } else {
                    bw.append("" + length);
                    hasPrint = true;
                }
            }
            bw.newLine();
        }
        bw.append("\nThe biggest word: " + biggest + "\n");
        bw.flush();
    }

}
