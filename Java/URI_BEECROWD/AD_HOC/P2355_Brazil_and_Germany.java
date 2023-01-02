/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: Ad-Hoc
 * @Problem: 2355 - Brazil and Germany
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2355
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 1/26/17, 12:51:25 PM
 * @Runtime: 0.072s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2355_Brazil_and_Germany {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while (!(input = br.readLine()).equals("0")) {
            int minutes = Integer.parseInt(input);
            double bazil = minutes / 90.0;
            int germany = (int) Math.ceil(bazil * 7);
            bw.append("Brasil " + (int) bazil + " x Alemanha " + germany + "\n");
        }
        bw.flush();
    }

}
