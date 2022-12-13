/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1024 Encryption
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1024
 * @Timelimit: 1 sec
 * @Status: Accepted 30/10/2015 - 17:53:00 Runtime:0.524s
 * @Solution:
 */
package Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1024_Encryption {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String textLine = br.readLine();
            String answer = "";

            for (int j = 0; j < textLine.length(); j++) {
                char c = textLine.charAt(j);
                if ((c >= 'A' && c <= 'z')) {
                    answer += (char) (textLine.charAt(j) + 3);
                } else {
                    answer += textLine.charAt(j);
                }

            }
            //reverse
            for (int j = textLine.length() - 1; j >= 0; j--) {
                if (j > (textLine.length() - 1) / 2) {
                    bw.append(answer.charAt(j));
                } else {
                    bw.append((char) (answer.charAt(j) - 1));
                }
            }
            bw.newLine();
        }
        bw.flush();
    }

}
