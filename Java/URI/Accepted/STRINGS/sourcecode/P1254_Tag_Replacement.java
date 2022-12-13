/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1254 Tag Replacement
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1254
 * @Timelimit: 1 sec
 * @Status: Accepted 01/12/2015 - 15:51:31 Runtime:0.148s
 * @Solution: searching and replace String
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1254_Tag_Replacement {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String findText;
        while ((findText = br.readLine()) != null) {
            String replaceText = br.readLine();
            String text = br.readLine();
            int i = 0;
            do {
                char now = text.charAt(i);
                switch (now) {
                    case '<':
                        int s = i + 1;
                        int e = s;
                        boolean isTag = false;
                        String temp = "";
                        while (e < text.length()) {
                            char c = text.charAt(e);
                            if (c == '>') {
                                isTag = true;
                                break;
                            }
                            temp += c;
                            e++;
                        }
                        if (isTag) {
                            String output = "<" + temp.replaceAll("(?i)" + findText, replaceText) + ">";
                            bw.append(output);
                            i = e;
                        } else {
                            bw.append(now);
                        }
                        break;
                    default:
                        bw.append(now);
                        break;
                }
            } while (++i < text.length());
            bw.newLine();
        }
        bw.flush();
    }

}
