/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1262 Multiple Reading
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1262
 * @Timelimit: 1 sec
 * @Status: Accepted 02/12/2015 - 16:56:14 Runtime:0.072s
 * @Solution: W = clock +1 , RW = clock +2 ,p = 3 RRR = Clock +1
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P1262_Multiple_Reading {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        String input;
        while ((input = br.readLine()) != null) {
            int process = Integer.parseInt(br.readLine());
            int i = 0, counting = 0;
            int clock = 0;
            do {
                switch (input.charAt(i)) {
                    case 'R':
                        counting++;
                        if (counting == process) {
                            clock++;
                            counting = 0;
                        }
                        break;
                    case 'W':
                        if (counting > 0) {
                            clock++;
                            counting = 0;
                        }
                        clock++;
                        break;
                }

            } while (++i < input.length());
            if (counting > 0) {
                clock++;
            }
            out.write((clock + "\n").getBytes());
        }
        out.flush();
    }

}
