/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1217 Getline Two - Fruits
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1217
 * @Timelimit: 1 sec
 * @Status: Accepted 25/10/2015 - 11:19:05 Runtime:0.076s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class P1217_Getline_Two_Fruits {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.HALF_EVEN);
        int n = Integer.parseInt(br.readLine());
        double sumSpent = 0.0, sumfruit = 0.0;
        for (int i = 1; i <= n; i++) {
            double spent = Double.parseDouble(br.readLine());
            int fruitAmount = br.readLine().split(" ").length;
            bw.append("day " + i + ": " + fruitAmount + " kg\n");
            bw.flush();
            sumSpent += spent;
            sumfruit += fruitAmount;
        }
        bw.append(df.format(sumfruit / n) + " kg by day\n");
        bw.append("R$ " + df.format(sumSpent / n) + " by day\n");
        bw.flush();
    }

}
