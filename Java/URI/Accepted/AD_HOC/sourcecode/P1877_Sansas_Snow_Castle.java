/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1877 Sansa's Snow Castle
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1877
 * @Timelimit: 1 sec
 * @Status: Accepted 30/10/2015 - 09:00:07 Runtime:0.056s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1877_Sansas_Snow_Castle {

    final static String INCREASE = "increase", DECREASE = "decrease";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int n = Integer.parseInt(st[0]);
        int k = Integer.parseInt(st[1]);
        int[] number = new int[n];
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int c = 0;
        while (stk.hasMoreTokens()) {
            number[c] = Integer.parseInt(stk.nextToken());
            c++;
        }
        System.out.println(peakCounting(number) == k ? "beautiful" : "ugly");
    }

    static int peakCounting(int[] number) {
        int peak = 0;
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

            if (beforeStatus.equals(INCREASE) && status.equals(DECREASE)) {
                peak++;
            }

            beforeStatus = status;

        }
        return peak;
    }

}
