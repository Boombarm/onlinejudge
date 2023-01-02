package URI.Accepted.STRINGS.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: STRING
 * @Problem: 2815 - Stutterer Digitizer
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2815
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory:
 * @Submission: 8/3/18, 12:56:56 PM
 * @Runtime: 0.068s
 * @Solution:
 * @Note:
 */

import java.io.*;

public class P2815_Stutterer_Digitizer {

    public P2815_Stutterer_Digitizer() {
        BufferedReader br;
        BufferedWriter bw;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String[] st = br.readLine().split(" ");

            boolean setSpace = false;
            for (String s : st) {
                boolean doReplace = true;
                while (doReplace) {
                    doReplace = false;
                    char f = s.charAt(0);
                    int lenght = s.length();
                    for (int i = 1; i < lenght; i++) {
                        if (s.charAt(i) == f) {
                            int now = i + 1;
                            int end = now + i;
                            int k = 0;
                            if (end > lenght) {
                                doReplace = false;
                                break;
                            }
                            while (now < end && s.charAt(now) == s.charAt(k)) {
                                now++;
                                k++;
                            }
                            if (now != end) {
                                s = s.substring(i);
                                doReplace = true;
                            }
                            break;
                        }
                    }
                }
                bw.append((setSpace ? " " : "") + s);
                setSpace = true;
            }
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
