package URI.Accepted.BEGINNER.sourcecode;


/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: BEGINNER
 * @Problem: 2754 - Output 8
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2754
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 12/24/18, 5:27:54 PM
 * @Runtime: 0.072s
 * @Solution:
 * @Note:
 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.Format;

public class P2754_Output_8 {

    static double a = 234.345, b = 45.698;


    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        DecimalFormat df0 = new DecimalFormat("0");
        DecimalFormat df1 = new DecimalFormat("0.000000");
        DecimalFormat df2 = new DecimalFormat("0.0");
        DecimalFormat df3 = new DecimalFormat("0.00");
        DecimalFormat df4 = new DecimalFormat("0.000");

        Format f1 = new DecimalFormat("0.000000E0");
        RoundingMode r = RoundingMode.HALF_EVEN;
        df0.setRoundingMode(r);
        df1.setRoundingMode(r);
        df2.setRoundingMode(r);
        df3.setRoundingMode(r);
        df4.setRoundingMode(r);


        bw.append(df1.format(a) + " - " + df1.format(b) + "\n");
        bw.append(df0.format(a) + " - " + df0.format(b) + "\n");
        bw.append(df2.format(a) + " - " + df2.format(b) + "\n");
        bw.append(df3.format(a) + " - " + df3.format(b) + "\n");
        bw.append(df4.format(a) + " - " + df4.format(b) + "\n");
        bw.append(String.format("%1.6e", a) + " - " + String.format("%1.6e", b) + "\n");
        bw.append(String.format("%1.6E", a) + " - " + String.format("%1.6E", b) + "\n");
        bw.append(df4.format(a) + " - " + df4.format(b) + "\n");
        bw.append(df4.format(a) + " - " + df4.format(b) + "\n");
        bw.flush();
    }

}
