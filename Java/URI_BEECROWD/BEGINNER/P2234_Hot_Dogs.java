/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2234 Hot Dogs
 * @Link:  https://www.urionlinejudge.com.br/judge/en/problems/view/2234
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 10/20/16, 7:25:56 PM
 * @Runtime: 0.076s
 * @Solution: 
 * @Note: 
 */

package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;


public class P2234_Hot_Dogs {
    
    static BufferedReader br;
    static DecimalFormat formatter;
    
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        formatter = new DecimalFormat("0.00");
        formatter.setRoundingMode(RoundingMode.HALF_EVEN);
        String[] st = br.readLine().split(" ");
        int m = Integer.parseInt(st[0]);
        int p = Integer.parseInt(st[1]);
        System.out.println(formatter.format((double)m/p));
    }

}
