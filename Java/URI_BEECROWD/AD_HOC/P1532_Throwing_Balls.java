/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1532 Throwing Balls
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1532
 * @Timelimit: 1 sec
 * @Status: Accepted 15/01/2016 - 14:34:08  Runtime:0.036s
 * @Solution: Simulation throw a ball at an integer speed less than or equal to V
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1532_Throwing_Balls {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while (!(input = br.readLine()).equals("0 0")) {
            String[] st = input.split(" ");
            int hold = Integer.parseInt(st[0]);
            int speed = Integer.parseInt(st[1]);
            boolean posible = false;
            loop:
            while (speed > 0 && !posible) {
                int cur = 0;
                for (int i = speed; i > 0; i--) {
                    for (int j = 0; j < i; j++) {
                        cur += i;
                        if (cur == hold) {
                            posible = true;
                            break loop;
                        }
                    }
                }
                speed--;
            }

            bw.append((posible ? "possivel" : "impossivel") + "\n");
        }
        bw.flush();
    }

}
