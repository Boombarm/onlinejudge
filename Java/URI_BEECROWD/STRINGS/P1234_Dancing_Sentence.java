/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1234 Dancing Sentence
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1234
 * @Timelimit: 1 sec
 * @Status: Accepted 16/10/2015 - 15:16:29 Runtime:0.132s
 * @Solution:
 */
package Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class P1234_Dancing_Sentence {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = "";
        ArrayList<String> text = new ArrayList<String>();
        while ((line = br.readLine()) != null) {
            text.add(line);
        }

        for (int i = 0; i < text.size(); i++) {
            boolean big = true;
            String s = text.get(i).toLowerCase();
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c >= 97 && c <= 122) {
                    if (big) {
                        bw.append(Character.toUpperCase(c));
                        big = false;
                    } else {
                        bw.append(c);
                        big = true;
                    }
                } else {
                    bw.append(c);
                }
            }
            bw.newLine();
            bw.flush();
        }

    }

}
