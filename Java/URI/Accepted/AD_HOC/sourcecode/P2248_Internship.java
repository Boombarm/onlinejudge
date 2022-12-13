/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: Ad-Hoc
 * @Problem: 2248 - Internship 
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2248
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 2/28/17, 2:41:50 PM
 * @Runtime: 0.076s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2248_Internship {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        int[][] students;
        String input;
        int t = 1;
        while (!(input = br.readLine()).equals("0")) {
            int n = Integer.parseInt(input);
            students = new int[n][2];
            int max = 0;
            for (int i = 0; i < n; i++) {
                String[] st = br.readLine().split(" ");
                int id = Integer.parseInt(st[0]);
                int score = Integer.parseInt(st[1]);
                students[i][0] = id;
                students[i][1] = score;
                if (max < score) {
                    max = score;
                }
            }

            bw.append("Turma " + (t++) + "\n");
            for (int i = 0; i < n; i++) {
                int score = students[i][1];
                if (score == max) {
                    bw.append(students[i][0] + " ");
                }
            }
            bw.append("\n\n");
        }
        bw.flush();
    }

}
