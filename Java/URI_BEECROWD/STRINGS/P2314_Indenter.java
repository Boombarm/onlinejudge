/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: Ad-Hoc
 * @Problem: 2314 Indenter
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2314
 * @Timelimit: 1 sec
 * @Status: Accepted 
 * @Submission: 2/20/17, 10:50:13 PM
 * @Runtime: 0.036s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2314_Indenter {

    static BufferedWriter bw;
    static BufferedReader br;

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in, "ISO-8859-1");
        OutputStreamWriter ow = new OutputStreamWriter(System.out, "ISO-8859-1");
        br = new BufferedReader(ir);
        bw = new BufferedWriter(ow);
        String line;
        while ((line = br.readLine()) != null) {
            if (line.charAt(0) == '#') {
                bw.write(line + "\n");
                continue;
            }
            int level = 0;
            boolean newLine = false;
            int length = line.length();
            for (int i = 0; i < length; i++) {
                char c = line.charAt(i);
                if (newLine) {
                    if (c != '}') {
                        bw.newLine();
                        tab(level);

                    }
                    newLine = false;
                }

                switch (c) {
                    case '{':
                        bw.newLine();
                        tab(level);
                        bw.append(c + "\n");
                        tab(++level);
                        break;
                    case '}':
                        bw.newLine();
                        tab(--level);
                        bw.append(c);
                        newLine = true;
                        break;
                    case ';':
                        bw.append(c);
                        newLine = true;
                        break;
                    case '(':
                        int l = 0;
                        for (; i < length; i++) {
                            char p = line.charAt(i);
                            bw.append(p);
                            if (p == '(') {
                                l++;
                            } else if (p == ')') {
                                l--;
                                if (l == 0) {
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        bw.append(c);
                        break;
                }
            }
            bw.newLine();
        }
        bw.flush();
    }

    static void tab(int level) throws IOException {
        while (level-- > 0) {
            bw.append("....");
        }
    }
}
