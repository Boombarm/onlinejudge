/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1515 Hello Galaxy
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1515
 * @Timelimit: 1 sec
 * @Status: Accepted 27/12/2015 - 17:58:32 Runtime:0.068s
 * @Solution: find out who was the first civilization to send a Hello Galaxy message
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1515_Hello_Galaxy {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n;
        while ((n = Integer.parseInt(br.readLine())) != 0) {
            String answer = "";
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                String[] st = br.readLine().split(" ");
                int a = Integer.parseInt(st[1]);
                int t = Integer.parseInt(st[2]);
                int year = a - t;
                if (year < min) {
                    answer = st[0];
                    min = year;
                }
            }
            bw.append(answer + "\n");
        }
        bw.flush();
    }

}
