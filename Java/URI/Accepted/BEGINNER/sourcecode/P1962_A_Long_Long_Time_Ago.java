/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge 
 * @Problem: 1962 A Long, Long Time Ago
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1962
 * @Timelimit: 1 sec
 * @Status: Accepted 06/11/2015 - 10:51:17 Runtime:0.112s
 * @Solution:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1962_A_Long_Long_Time_Ago {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int year = Integer.parseInt(br.readLine());
            if (year >= 2015) {
                bw.append(Math.abs(2014 - year) + " ");
                bw.append("A.C.\n");
            } else {
                bw.append(Math.abs(2015 - year) + " ");
                bw.append("D.C.\n");
            }
        }
        bw.flush();
    }

}
