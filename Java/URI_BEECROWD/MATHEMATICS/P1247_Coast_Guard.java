/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1247 Coast Guard
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1247
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/27/16, 9:24:35 AM
 * @Runtime: 0.052s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.MATHEMATICS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1247_Coast_Guard {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while ((input = br.readLine()) != null) {
            String[] st = input.split(" ");
            int d = Integer.parseInt(st[0]);
            int vf = Integer.parseInt(st[1]);
            int vg = Integer.parseInt(st[2]);
            bw.append(executing(d, vf, vg) ? "S\n" : "N\n");
        }
        bw.flush();
    }

    private static boolean executing(int d, int vf, int vg) {
        double val = Math.sqrt(Math.pow(12.0, 2.0) + Math.pow(d, 2.0));
        if ((12.0 / vf) >= (val / vg)) {
            return true;
        }
        return false;
    }

}
