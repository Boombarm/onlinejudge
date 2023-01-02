/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1667 HTML
 * @Timelimit: 3 sec
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1667
 * @Status: Accepted 13/10/2015 - 10:14:21 Runtime:0.044s
 * @Solution:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1667_HTML {

    static String hr = "--------------------------------------------------------------------------------";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String reciveLine = "";
        String line = "";
        String word = "";
        while ((reciveLine = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(reciveLine);
            boolean checkElement = false;
            while (st.hasMoreTokens()) {
                word = st.nextToken();
                line += " " + word;
                line = line.trim();
                if (word.equals("<br>")) {
                    System.out.println();
                    line = "";
                    checkElement = true;
                    continue;
                } else if (word.equals("<hr>")) {
                    System.out.println((checkElement ? hr : "\n" + hr));
                    line = "";
                    checkElement = true;
                    continue;
                } else if (line.length() > 80) {
                    System.out.print("\n" + word);
                    line = word;
                } else {
                    System.out.print((line.contains(" ") ? " " + word : word));
                }
                checkElement = false;
            }
        }
        System.out.println();
    }

}
