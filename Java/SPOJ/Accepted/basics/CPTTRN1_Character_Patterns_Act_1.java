package SPOJ.Accepted.basics;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: Sphere Online Judge
 * @Categories: CPTTRN1
 * @Problem: CPTTRN1 - Character Patterns (Act 1)
 * @Link: http://www.spoj.com/problems/CPTTRN1/
 * @Timelimit: 1 sec
 * @Status: accepted
 * @Memory: 4468M
 * @Submission: 2018-04-02 11:20:13
 * @Runtime: 0.10
 * @Solution:
 * @Note:
 */

import java.io.*;

public class CPTTRN1_Character_Patterns_Act_1 {

    public CPTTRN1_Character_Patterns_Act_1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] st = br.readLine().split(" ");
            int h = Integer.parseInt(st[0]);
            int w = Integer.parseInt(st[1]);
            for (int i = 0; i < h; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < w; j++) {
                        bw.append(j % 2 == 0 ? "*" : ".");
                    }
                } else {
                    for (int j = 0; j < w; j++) {
                        bw.append(j % 2 == 0 ? "." : "*");
                    }
                }
                bw.newLine();
            }
            bw.newLine();
        }
        bw.flush();
    }
}
