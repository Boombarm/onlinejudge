package URI.Accepted.BEGINNER.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: BEGINNER
 * @Problem: 2751 - Output 5
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2751
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 12/24/18, 4:19:47 PM
 * @Runtime: 0.064s
 * @Solution:
 * @Note:
 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class P2751_Output_5 {

    static int a = 15;
    static double b = a / 2;
    static double c = 15.456;
    static double d = c / 7;

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        RoundingMode r = RoundingMode.HALF_EVEN;
        DecimalFormat df1 = new DecimalFormat("0.000000");
        DecimalFormat df2 = new DecimalFormat("0.0");
        DecimalFormat df3 = new DecimalFormat("0.00");
        DecimalFormat df4 = new DecimalFormat("0.000");
        df1.setRoundingMode(r);
        df2.setRoundingMode(r);
        df3.setRoundingMode(r);
        df4.setRoundingMode(r);

        bw.append("Valores de b:\n-------------\n");
        bw.append("1) b = " + (int) b + "\n");
        bw.append("2) b = " + "                   " + (int) b + "\n");
        bw.append("3) b = " + "0000000000000000000" + (int) b + "\n");
        bw.append("4) b = " + (int) b + "                   " + "\n");
        bw.append("5) b = " + (int) b + "%\n\n");
        bw.append("Valores de d:\n-------------\n");
        bw.append("1) d = " + df1.format(d) + "\n");
        bw.append("2) d = " + (int) d + "\n");
        bw.append("3) d = " + df2.format(d) + "\n");
        bw.append("4) d = " + df3.format(d) + "\n");
        bw.append("5) d = " + df4.format(d) + "\n");
        bw.append("6) d = " + "               " + df4.format(d) + "\n");
        bw.append("7) d = " + "000000000000000" + df4.format(d) + "\n");
        bw.append("8) d = " + df4.format(d) + "               \n");
        bw.append("9) d = " + df3.format(d) + "%\n");
        bw.flush();
    }

}
