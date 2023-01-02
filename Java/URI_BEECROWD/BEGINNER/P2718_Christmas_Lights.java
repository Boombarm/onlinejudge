package URI.Accepted.BEGINNER.sourcecode;


/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1119 The Dole Queue
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1119
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 2/19/18, 11:32:53 PM
 * @Runtime: 0.048s
 * @Solution: Doubly linked list
 * @Note: find large bit group of large binary String
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.math.BigInteger;

public class P2718_Christmas_Lights {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            BigInteger d = new BigInteger(br.readLine());
            char[] binary = d.toString(2).toCharArray();
            int size = binary.length;
            int count = 0;
            int max = 0;
            loop:
            for (int i = 0; i < size; i++) {
                if (binary[i] == '1') {
                    count++;
                    if (count == 50) {
                        max = 50;
                        break loop;
                    }
                    if (max < count) {
                        max = count;
                    }
                } else {
                    count = 0;
                }
            }

            bw.append(max + "\n");
        }
        bw.flush();

    }
}
