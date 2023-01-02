/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1239 Bloggo Shortcuts
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1239
 * @Timelimit: 1 sec
 * @Status: Accepted 13/10/2015 - 05:52:37 Runtime:0.308s
 * @Solution:
 */
package Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1239_Bloggo_Shortcuts {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = "";
        while ((line = br.readLine()) != null) {
            boolean openTagI = false, openTagB = false;
            String answer = "";
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (c == '_') {
                    if (!openTagI) {
                        answer += "<i>";
                        openTagI = true;
                    } else {
                        answer += "</i>";
                        openTagI = false;
                    }
                } else if (c == '*') {
                    if (!openTagB) {
                        answer += "<b>";
                        openTagB = true;
                    } else {
                        answer += "</b>";
                        openTagB = false;
                    }
                } else {
                    answer += c;
                }
            }
            System.out.println(answer);
        }
    }

}
