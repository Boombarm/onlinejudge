/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: Beginner
 * @Problem: 2292 - LED Panel
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2292
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 1/27/17, 6:11:42 PM
 * @Runtime: 0.104s
 * @Solution: Binary Addition
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2292_LED_Panel {

    public static void main(String[] args) throws IOException {
        long[] binaryValue = new long[61];
        for (int i = 0; i <= 60; i++) {
            binaryValue[i] = (long) Math.pow(2, i);
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input;
        boolean[] binary;
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            input = br.readLine().split(" ");
            int length = input[0].length();
            char[] lamps = input[0].toCharArray();
            binary = new boolean[61];
            long last = Long.parseLong(input[1]);
            long sum = 0;
            for (int i = 0; i < length; i++) {
                if (lamps[i] == 'O') {
                    sum += (long) Math.pow(2, i);
                }
            }
            sum += last;
            //set Binary
            int i = 60;
            while (i >= 0) {
                if (sum >= binaryValue[i]) {
                    binary[i] = true;
                    sum -= binaryValue[i];
                }
                i--;
            }
            for (int j = 0; j < length; j++) {
                bw.append(binary[j] ? "O" : "X");
            }
            bw.newLine();
        }
        bw.flush();
    }

}
