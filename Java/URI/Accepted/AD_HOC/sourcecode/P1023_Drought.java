/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1023 Drought
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1023
 * @Timelimit: 2 sec
 * @Status: Accepted
 * @Submission: 4/29/16, 12:10:09 AM
 * @Runtime: 0.540s
 * @Solution:
 * @Note:
 */
package URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class P1023_Drought {

    public static void main(String[] args) throws IOException {
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.DOWN);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int city = 1;
        double average = 0;
        while (!input.equals("0")) {
            bw.write("Cidade# " + city + ":\n");
            int n = Integer.parseInt(input);
            double sum1 = 0, sum2 = 0;
            int a1, a2;
            int[] arr = new int[300];
            for (int i = 0; i < n; i++) {
                String[] st = br.readLine().split(" ");
                sum1 += a1 = Integer.parseInt(st[0]);
                sum2 += a2 = Integer.parseInt(st[1]);
                arr[a2 / a1] += a1;
            }
            average = sum2 / sum1;
            boolean hasPrinted = false;
            for (int i = 0; i < 300; i++) {
                if (arr[i] > 0) {
                    if (hasPrinted) {
                        bw.append(" ");
                    }
                    bw.append(arr[i] + "-" + i);
                    hasPrinted = true;
                }
            }
            bw.newLine();
            bw.write("Consumo medio: " + df.format(average) + " m3.\n");
            if (!(input = br.readLine()).equals("0")) {
                bw.newLine();
                city++;
            }
        }
        bw.flush();
    }

}
