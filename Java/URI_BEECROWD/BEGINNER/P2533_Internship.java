/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: BEGINNER
 * @Problem: 2533 - Internship
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2533
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 4/13/17, 3:46:08 PM
 * @Runtime: 0.044s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;

public class P2533_Internship {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        DecimalFormat formatter = new DecimalFormat("0.0000");
        String input;
        int n, c;
        while ((input = br.readLine()) != null) {
            int m = Integer.parseInt(input);
            double sumC = 0, sumNC = 0;
            while (m-- > 0) {
                String[] st = br.readLine().split(" ");
                n = Integer.parseInt(st[0]);
                c = Integer.parseInt(st[1]);
                sumNC += (n * c);
                sumC += c;
            }
            double answer = sumNC / (sumC * 100);
            bw.append(formatter.format(answer) + "\n");
        }
        bw.flush();
    }

}
