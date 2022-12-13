/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: Beginner
 * @Problem: 2520 - The Last Analógimôn
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2520
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/29/17, 4:58:48 AM
 * @Runtime: 0.052s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2520_The_Last_Analogimon {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        int m, n, sr = 0, sc = 0, er = 0, ec = 0;
        String[][] map;
        String input;
        while ((input = br.readLine()) != null) {
            String[] st = input.split(" ");
            n = Integer.parseInt(st[0]);
            m = Integer.parseInt(st[1]);
            map = new String[n][];
            for (int i = 0; i < n; i++) {
                map[i] = br.readLine().split(" ");
                int j = 0;
                for (String s : map[i]) {
                    if (s.equals("1")) {
                        sr = i;
                        sc = j;
                    } else if (s.equals("2")) {
                        er = i;
                        ec = j;
                    }
                    j++;
                }
            }
            int answer = 0;
            if (sr == er) {
                answer = (max(sc, ec) == sc ? sc - ec : ec - sc);
            } else if (sc == ec) {
                answer = (max(sr, er) == sr ? sr - er : er - sr);
            } else {
                answer = ((max(sr, er) == sr ? sr - er : er - sr) + (max(sc, ec) == sc ? sc - ec : ec - sc));
            }
            bw.append(answer + "\n");
        }
        bw.flush();
    }

    static int max(int a, int b) {
        return a > b ? a : b;
    }
}
