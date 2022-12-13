/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: AD-HOC
 * @Problem: 1321 - Jollo
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1321
 * @Timelimit: 1 sec
 * @Status: Accepted 
 * @Submission: 3/3/17, 10:24:50 PM
 * @Runtime: 0.088s
 * @Solution: sort and permutation compare
 * @Note:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class P1321_Jollo {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        String input;
        int a, b, c, x, y, z;
        boolean[] deck;
        while (!(input = br.readLine()).equals("0 0 0 0 0")) {
            String[] st = input.split(" ");
            a = Integer.parseInt(st[0]);
            b = Integer.parseInt(st[1]);
            c = Integer.parseInt(st[2]);
            x = Integer.parseInt(st[3]);
            y = Integer.parseInt(st[4]);
            z = -1;
            deck = new boolean[52];
            deck[a - 1] = deck[b - 1] = deck[c - 1] = deck[x - 1] = deck[y - 1] = true;
            int[] Princess = {a, b, c};
            Arrays.sort(Princess);
            for (int i = 0; i < 52; i++) {
                if (!deck[i]) {
                    int[] Prince = {x, y, (i + 1)};
                    Arrays.sort(Prince);
                    int win = 0;
                    if (Prince[2] > Princess[0]) {
                        win++;
                    }
                    if (Prince[1] > Princess[2]) {
                        win++;
                    }
                    if (Prince[0] > Princess[1]) {
                        win++;
                    }
                    if (win >= 2) {
                        z = i + 1;
                        break;
                    }
                }
            }

            bw.append(z + "\n");
        }
        bw.flush();
    }

}
