/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1266 Tornado!
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1266
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/2/16, 4:53:45 PM
 * @Runtime: 0.124s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P1266_Tornado {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        int n;
        while ((n = Integer.parseInt(br.readLine())) != 0) {
            String[] st = br.readLine().split(" ");
            int[] gate = new int[n];
            boolean isAll = true;
            for (int i = 0; i < n; i++) {
                gate[i] = Integer.parseInt(st[i]);
                if (isAll && gate[i] == 1) {
                    isAll = false;
                }
            }
            int wooden = 0;
            if (isAll) {
                wooden += Math.ceil((double) n / 2);
            } else {
                int front = 0;
                int end = n - 1;
                int k = 0;
                loop:
                while (front < end) {
                    k = 0;
                    while (front < n && gate[front] == 0) {
                        front++;
                        k++;
                    }
                    while (gate[end] == 0) {
                        end--;
                        k++;
                    }
                    wooden += k / 2;
                    while (gate[front] == 1) {
                        front++;
                        if (front > end) {
                            break loop;
                        }
                    }
                }
            }
            out.write((wooden + "\n").getBytes());
        }
        out.flush();
    }

}
