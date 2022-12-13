/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1107 Laser Sculpture
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1107
 * @Timelimit: 1 sec
 * @Status: Accepted 04/01/2016 - 07:19:12 Runtime:0.064s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P1107_Laser_Sculpture {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        String input;
        while (!(input = br.readLine()).equals("0 0")) {
            String[] st = input.split(" ");
            int a = Integer.parseInt(st[0]);
            int c = Integer.parseInt(st[1]);
            st = br.readLine().split(" ");
            int tmp = a;
            int answer = 0;
            for (int i = 0; i < c; i++) {
                int now = Integer.parseInt(st[i]);
                if (now < tmp) {
                    answer += tmp - now;
                }
                tmp = now;
            }
            out.write((answer + "\n").getBytes());
        }
        out.flush();
    }

}
