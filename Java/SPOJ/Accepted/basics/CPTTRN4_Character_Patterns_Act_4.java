package SPOJ.Accepted.basics;
/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: Sphere Online Judge
 * @Categories: CPTTRN4
 * @Problem: CPTTRN4 - Character Patterns (Act 4)
 * @Link: www.spoj.com/problems/CPTTRN4/
 * @Timelimit: 1 sec
 * @Status: accepted
 * @Memory: 4468M
 * @Submission: 2018-04-03 06:21:23
 * @Runtime: 0.04
 * @Solution:
 * @Note:
 */
import java.io.*;

public class CPTTRN4_Character_Patterns_Act_4 {

    public CPTTRN4_Character_Patterns_Act_4() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] st = br.readLine().split(" ");
            int i = Integer.parseInt(st[0]);//the number of lines
            int c = Integer.parseInt(st[1]);//the number of columns in the grid
            int height = Integer.parseInt(st[2]);
            int width = Integer.parseInt(st[3]);

            //Print TOP
            bw.append("*");
            for (int r2 = 0; r2 < c; r2++) {//For C
                for (int r4 = 0; r4 <= width; r4++) { //For width
                    bw.append("*");
                }
            }
            bw.newLine();

            for (int r1 = 0; r1 < i; r1++) {//FOr i
                for (int r3 = 0; r3 < height; r3++) { //For heigh
                    bw.append("*");
                    for (int r2 = 0; r2 < c; r2++) {//For C
                        for (int r4 = 0; r4 <= width; r4++) { //For width
                            if (r4 == width) {
                                bw.append("*");
                                continue;
                            }
                            bw.append(".");
                        }
                    }
                    bw.newLine();
                }

                //Print Bottom
                bw.append("*");
                for (int r2 = 0; r2 < c; r2++) {//For C
                    for (int r4 = 0; r4 <= width; r4++) { //For width
                        bw.append("*");
                    }
                }
                bw.newLine();

            }
            bw.newLine();
        }
        bw.flush();
    }

}
