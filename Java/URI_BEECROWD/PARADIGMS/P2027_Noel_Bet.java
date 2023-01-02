/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2027 Noel Bet
 * @Categories: PARADIGMS
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2027
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 2/26/16, 11:38:35 AM
 * @Runtime: 0.048s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.PARADIGMS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class P2027_Noel_Bet {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        LinkedList<Integer> gcd = new LinkedList<Integer>();
        while ((input = br.readLine()) != null) {
            String[] st = input.split(" ");
            int num = Integer.parseInt(st[0]);
            int den = Integer.parseInt(st[1]);
            int now = GCD(num, den);
            gcd.push(now);
            if (now > 5) {
                bw.append("Noel\n");
            } else {
                bw.append("Gnomos\n");
            }
        }

        for (Integer i : gcd) {
            bw.append(i + " ");
        }
        bw.newLine();
        bw.flush();
    }

    private static int GCD(int num, int den) {
        while (num > 0) {
            int t = den % num;
            den = num;
            num = t;
        }
        return den;
    }
}
