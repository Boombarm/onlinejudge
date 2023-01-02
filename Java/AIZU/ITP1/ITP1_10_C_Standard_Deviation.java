package AIZU.Accepted.ITP1;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: AIZU ONLINE JUDGE
 * @Categories: Math Functions
 * @Problem: ITP1_10_C: Standard Deviation
 * @Link: http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_10_C
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory: 27604 KB
 * @Submission: 2018-03-17 18:19
 * @Runtime: 00:07 s
 * @Solution:
 * @Note: (si - m)2
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class ITP1_10_C_Standard_Deviation {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        DecimalFormat df = new DecimalFormat("0.00000000");
        String input;
        while (!(input = br.readLine()).equals("0")) {
            int n = Integer.parseInt(input);
            String[] st = br.readLine().split(" ");
            double sum = 0;
            double[] s = new double[n];
            for (int i = 0; i < n; i++) {
                sum += s[i] = Double.parseDouble(st[i]);
            }
            double m = sum / (double) n;
            double result = 0;
            for (int i = 0; i < n; i++) {
                result += Math.pow(s[i] - m, 2);
            }
            bw.append(df.format(Math.sqrt(result / (double) n)) + "\n");
        }
        bw.flush();
    }


}
