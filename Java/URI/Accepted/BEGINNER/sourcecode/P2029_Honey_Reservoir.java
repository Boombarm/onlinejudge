/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2029 Honey Reservoir
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2029
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/13/16, 10:12:23 PM
 * @Runtime: 0.064s
 * @Solution: หาพื้นที่และความสูงทรงกระบอก (area = (Math.pow((d / 2), 2)) * 3.14), height = v / area;
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;

public class P2029_Honey_Reservoir {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        DecimalFormat df = new DecimalFormat("0.00");
        String input;
        while ((input = br.readLine()) != null) {
            double v = Double.parseDouble(input);
            double d = Double.parseDouble(br.readLine());
            double area = (Math.pow((d / 2), 2)) * 3.14;
            double height = v / area;
            bw.write("ALTURA = " + df.format(height) + "\n");
            bw.write("AREA = " + df.format(area) + "\n");
        }
        bw.flush();
    }

}
