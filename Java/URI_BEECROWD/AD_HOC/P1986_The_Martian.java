package URI.Accepted.AD_HOC.sourcecode;


/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1984 - The Martian
 * @Link: https://www.urionlinejudge.com.br/repository/UOJ_1986_en.html
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 11/28/18, 2:52:09 PM
 * @Runtime: 0.052s
 * @Solution: Calculate HEX to ASCII
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P1986_The_Martian {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        br.readLine();
        String[] st = br.readLine().split(" ");
        for (String s : st) {
            bw.append((char) Integer.parseInt(s, 16));
        }
        bw.newLine();
        bw.flush();
    }

}
