/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1089 Musical Loop
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1089
 * @Timelimit: 1 sec
 * @Status: Accepted 30/10/2015 - 05:54:09 Runtime:0.060s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.StringTokenizer;

public class P1089_Musical_Loop {

    final static String INCREASE = "increase", DECREASE = "decrease";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        String line = "";
        while (!(line = br.readLine()).equals("0")) {
            int n = Integer.parseInt(line);
            int[] numberList = new int[n + 1];
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(stk.nextToken());
            numberList[0] = first;
            for (int i = 1; i < n; i++) {
                numberList[i] = Integer.parseInt(stk.nextToken());
            }
            numberList[n] = first;
            out.write((peakCounting(numberList) + "\n").getBytes());
        }
        out.flush();
    }

    static int peakCounting(int[] number) {
        int count = 0;
        String beforeStatus = "";
        for (int i = 1; i < number.length; i++) {

            if (number[i - 1] == number[i]) {
                continue;
            }

            String status;
            if (number[i - 1] < number[i]) {
                status = INCREASE;
            } else {
                status = DECREASE;
            }

            if (!status.equals(beforeStatus)) {
                count++;
            }
            beforeStatus = status;

        }
        return (count / 2) * 2;
    }

}
