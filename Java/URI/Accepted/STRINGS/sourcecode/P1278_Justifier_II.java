/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1278 Justifier II
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1278
 * @Timelimit: 1 sec
 * @Status: Accepted 30/10/2015 - 12:51:33 Runtime:0.168s
 * @Solution:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P1278_Justifier_II {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = br.readLine();
        while (true) {
            if (line.equals("0")) {
                break;
            }
            int n = Integer.parseInt(line);
            String[] text = new String[n];
            int maxLength = 0;
            for (int i = 0; i < n; i++) {
                StringTokenizer stk = new StringTokenizer(br.readLine());
                text[i] = stk.nextToken();
                while (stk.hasMoreTokens()) {
                    text[i] += " " + stk.nextToken();
                }
                if (text[i].length() > maxLength) {
                    maxLength = text[i].length();
                }
            }
            setJustifier(text, maxLength);
            for (int i = 0; i < text.length; i++) {
                bw.append(text[i] + "\n");
            }
            line = br.readLine();
            if (!line.equals("0")) {
                bw.newLine();
            }
            bw.flush();
        }
    }

    static void setJustifier(String[] text, int length) {
        for (int i = 0; i < text.length; i++) {
            for (int j = (length - text[i].length()); j > 0; j--) {
                text[i] = " " + text[i];
            }
        }
    }

}
