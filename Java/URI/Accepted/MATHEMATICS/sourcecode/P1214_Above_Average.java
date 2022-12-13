/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1214 Above Average
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1214
 * @Timelimit: 1 sec
 * @Status: Accepted  05/12/2015 - 06:47:13 Runtime:0.200s
 * @Solution:
 */
package  URI.Accepted.MATHEMATICS.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class P1214_Above_Average {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        DecimalFormat df = new DecimalFormat("0.000");
        int n = Integer.parseInt(br.readLine());
        int i = 0;
        do {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(stk.nextToken());
            int[] number = new int[m];
            int sum = 0;
            for (int j = 0; j < m; j++) {
                int now = Integer.parseInt(stk.nextToken());
                number[j] = now;
                sum += now;
            }
            double x = sum / m;
            int counting = 0;
            for (int j = 0; j < m; j++) {
                if (number[j] > x) {
                    counting++;
                }
            }
            double answer = (double) (counting * 100) / m;
            out.write((df.format(answer) + "%\n").getBytes());
        } while (++i < n);
        out.flush();
    }

}
