/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2140 - Two Bills 
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2140
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 7/18/16, 4:10:30 PM
 * @Runtime: 0.032s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2140_Two_Bills {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while (!(input = br.readLine()).equals("0 0")) {
            String[] st = input.split(" ");
            int buyPrice = Integer.parseInt(st[0]);
            int pricePaid = Integer.parseInt(st[1]);

            int result = pricePaid - buyPrice;
            if (result <= 200 || result >= 7) {
                boolean c = true;
                int counting = 0;
                while (result != 0) {
                    if (result >= 100) {
                        result -= 100;
                    } else if (result >= 50) {
                        result -= 50;
                    } else if (result >= 20) {
                        result -= 20;
                    } else if (result >= 10) {
                        result -= 10;
                    } else if (result >= 5) {
                        result -= 5;
                    } else if (result >= 2) {
                        result -= 2;
                    } else {
                        c = false;
                        break;
                    }
                    counting++;
                }
                bw.append((counting == 2 ? "possible" : "impossible") + "\n");
            } else {
                bw.append("impossible\n");
            }
        }
        bw.flush();
    }

}
