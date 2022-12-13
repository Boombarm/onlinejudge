package SPOJ.Accepted.basics;
/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: Sphere Online Judge
 * @Categories: CPTTRN2
 * @Problem: CPTTRN2 - Character Patterns (Act 2)
 * @Link: http://www.spoj.com/problems/CPTTRN2/
 * @Timelimit: 1 sec
 * @Status: accepted
 * @Memory: 4468M
 * @Submission: 2018-04-02 11:37:29
 * @Runtime: 0.09
 * @Solution:
 * @Note:
 */

import java.io.*;

public class CPTTRN2_Character_Patterns_Act_2 {

    public CPTTRN2_Character_Patterns_Act_2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] st = br.readLine().split(" ");
            int h = Integer.parseInt(st[0]);
            int w = Integer.parseInt(st[1]);
            for (int i = 0; i < h; i++) {
                if (i == 0 || i == h - 1) {
                    for (int j = 0; j < w; j++) {
                        bw.append("*");
                    }
                } else {
                    for (int j = 0; j < w; j++) {
                        bw.append(j == 0 || j == w - 1 ? "*" : ".");
                    }
                }
                bw.newLine();
            }
            bw.newLine();
        }
        bw.flush();
    }

}
