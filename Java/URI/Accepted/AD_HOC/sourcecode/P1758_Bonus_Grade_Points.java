/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1758 Bonus Grade Points
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1758
 * @Timelimit: 2 sec
 * @Status: Accepted 29/11/2015 - 02:56:49 Runtime:0.424s
 * @Solution: calculate average & set max7 if average between 4 and 7 or average > 7 then set average = max
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class P1758_Bonus_Grade_Points {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.HALF_UP);
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String[] st = br.readLine().split(" ");
            int p = Integer.parseInt(st[0]);
            int n = Integer.parseInt(st[1]);
            for (int j = 0; j < n; j++) {
                st = br.readLine().split(" ");
                double max7 = 0.0, max10 = 0.0;
                double sum = 0;
                for (int k = 0; k < p; k++) {
                    double number = Double.parseDouble(st[k]);
                    sum += number;
                    if (number < 7 && max7 < number) {
                        max7 = number;
                    }
                    if (max10 < number) {
                        max10 = number;
                    }
                }
                double average = sum / p;
                if (average < 4) {
                    out.write((df.format(average) + "\n").getBytes());
                } else if (average >= 4 && average < 7) {
                    if (max7 > average) {
                        out.write((df.format(max7) + "\n").getBytes());
                    } else {
                        out.write((df.format(average) + "\n").getBytes());
                    }
                } else {
                    out.write((df.format(max10) + "\n").getBytes());
                }
            }
        }
        out.flush();
    }

}
