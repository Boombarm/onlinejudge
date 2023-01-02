package COJ.Accepted;


/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: COJ
 * @Problem: 1023 - Financial Management
 * @Link: http://coj.uci.cu/24h/problem.xhtml?pid=1023
 * @Timelimit: 6000 MS
 * @Status: Accepted
 * @Submission: 2018-01-29 04:12:34
 * @Runtime: 250
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class P1023_Financial_Management {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("0.00");
        double answer = 0.00;
        for (int i = 0; i < 12; i++) {
            answer += Double.parseDouble(br.readLine());
        }
        answer = answer / 12;
        System.out.println("$" + df.format(answer));
    }
}
