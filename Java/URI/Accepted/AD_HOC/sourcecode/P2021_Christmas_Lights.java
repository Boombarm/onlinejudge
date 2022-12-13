package URI.Accepted.AD_HOC.sourcecode;


/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: AD-HOC
 * @Problem: 2021 - Christmas Lights
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2021
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Language: Java 8 (OpenJDK 1.8.0) [+2s]
 * @Submission: 2/12/19, 2:44:23 PM
 * @Runtime: 0.040s
 * @Solution:
 * @Note: นับจำนวนหลอดไฟที่เสีย
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P2021_Christmas_Lights {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int m, n, p;
        String input;
        while (!(input = br.readLine()).equals("0 0 0")) {
            String[] st = input.split(" ");
            m = Integer.parseInt(st[0]);
            n = Integer.parseInt(st[1]);
            p = Integer.parseInt(st[2]);
            int total = 0;
            for (int i = 0; i < p; i++) {
                int position = Integer.parseInt(br.readLine());
                if (position > n) position %= n;
                if (position > 0)
                    total += (n - (position - 1));
                else {
                    total += Math.abs(position - 1);
                }
            }
            bw.append("Lights: " + total + "\n");
        }
        bw.flush();
    }

}
