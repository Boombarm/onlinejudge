/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1540 Energy Planning
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1540
 * @Timelimit: 1 sec
 * @Status: Accepted 03/12/2015 - 03:10:41 Runtime:0.056s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.text.DecimalFormat;

public class P1540_Energy_Planning {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        DecimalFormat df = new DecimalFormat("0.00");
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] st = br.readLine().split(" ");
            double year1 = Double.parseDouble(st[0]);
            double gwh1 = Double.parseDouble(st[1]);
            double year2 = Double.parseDouble(st[2]);
            double gwh2 = Double.parseDouble(st[3]);
            double answer = Math.floor(100 * (Math.abs(gwh2 - gwh1) / Math.abs(year2 - year1))) / 100.0;
            out.write((df.format(answer).replace(".", ",") + "\n").getBytes());
        }
        out.flush();
    }

}
