/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: BEginner
 * @Problem: 2486 C Mais ou Menos?
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2486
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 12/23/16, 7:48:36 PM
 * @Runtime: 0.024s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2486_C_Mais_ou_Menos {

    static BufferedReader br;
    static BufferedWriter bw;

    static {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
    }

    public static void main(String[] args) throws IOException {
        String input;
        while (!(input = br.readLine()).equals("0")) {
            int result = exc(Integer.parseInt(input));
            if (result < 110) {
                bw.append("Mais " + (110 - result) + " mg\n");
            } else if (result >= 110 && result <= 130) {
                bw.append(result + " mg\n");
            } else {
                bw.append("Menos " + (result - 130) + " mg\n");
            }
        }
        bw.flush();
    }

    static int exc(int n) throws IOException {
        int vitamin = 0;
        while (n-- > 0) {
            String[] st = br.readLine().split(" ");
            int amount = Integer.parseInt(st[0]);
            if (st[1].equals("suco")) {
                vitamin += (120 * amount);

            } else if (st[1].equals("morango")) {
                vitamin += (85 * amount);

            } else if (st[1].equals("mamao")) {
                vitamin += (85 * amount);

            } else if (st[1].equals("goiaba")) {
                vitamin += (70 * amount);

            } else if (st[1].equals("manga")) {
                vitamin += (56 * amount);

            } else if (st[1].equals("laranja")) {
                vitamin += (50 * amount);

            } else if (st[1].equals("brocolis")) {
                vitamin += (34 * amount);

            }
        }
        return vitamin;
    }

}
