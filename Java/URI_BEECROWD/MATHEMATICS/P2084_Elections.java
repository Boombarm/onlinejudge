/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: MATHEMATICS
 * @Problem: 2084 - Elections
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2084
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 4/18/17, 12:26:46 PM
 * @Runtime: 0.044s
 * @Solution: bubbleSort + Check percentage
 * @Note:
 */
package  URI.Accepted.MATHEMATICS.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2084_Elections {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        int n = Integer.parseInt(br.readLine());
        int[] vote = new int[n];
        String[] st = br.readLine().split(" ");
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += vote[i] = Integer.parseInt(st[i]);
        }
        double d1 = (sum * 45) / 100;
        double d2 = (sum * 40) / 100;
        double d3 = (sum * 10) / 100;
        //sort
        while (true) {
            boolean found = false;
            for (int i = 0; i < n - 1; i++) {
                if (vote[i] < vote[i + 1]) {
                    int tmp = vote[i];
                    vote[i] = vote[i + 1];
                    vote[i + 1] = tmp;
                    found = true;
                }
            }
            if (!found) {
                break;
            }
        }
        if (vote[0] >= d1) {
            System.out.println("1");
        } else if (vote[0] >= d2) {
            System.out.println(vote[0] - vote[1] > d3 ? "1" : "2");
        } else {
            System.out.println("2");
        }
    }

}
