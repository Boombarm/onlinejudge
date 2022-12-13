package SPOJ.Accepted.basics;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: Sphere Online Judge
 * @Categories: CPTTRN3
 * @Problem: CPTTRN3 - Character Patterns (Act 3)
 * @Link: http://www.spoj.com/problems/CPTTRN3/
 * @Timelimit: 1 sec
 * @Status: accepted
 * @Memory: 4468M
 * @Submission:  2018-04-02 12:41:26
 * @Runtime: 0.09
 * @Solution:
 * @Note:
 */

import java.io.*;

public class CPTTRN3_Character_Patterns_Act_3 {

    public CPTTRN3_Character_Patterns_Act_3() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] st = br.readLine().split(" ");
            int h = Integer.parseInt(st[0]);
            int w = Integer.parseInt(st[1]);
            bw.append("*");
            for (int j = 1; j <= w; j++) {
                bw.append("***");
            }
            bw.newLine();
            for (int i = 0; i < h; i++) {
                for (int r = 0; r < 2; r++) {
                    bw.append("*");
                    for (int j = 1; j <= w; j++) {
                        bw.append("..*");
                    }
                    bw.newLine();
                }
                bw.append("*");
                for (int j = 1; j <= w; j++) {
                    bw.append("***");
                }
                bw.newLine();
            }
            bw.newLine();
        }
        bw.flush();
    }

}
