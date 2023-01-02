/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: Data Structures and Libraries
 * @Problem: 1548 - Canteen Queue
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1548
 * @Timelimit: 1 sec
 * @Status:  Accepted
 * @Submission: 2/17/17, 10:13:15 PM
 * @Runtime: 0.060s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Arrays;

public class P1548_Canteen_Queue {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        int c = Integer.parseInt(br.readLine());
        while (c-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] st = br.readLine().split(" ");
            int[] student = new int[n], hight = new int[n];
            for (int i = n - 1; i >= 0; i--) {
                int now = Integer.parseInt(st[i]);
                hight[i] = student[i] = now;
            }
            Arrays.sort(hight);
            int d = 0;
            for (int i = n - 1, j = 0; i >= 0; i--, j++) {
                if (hight[i] == student[j]) {
                    d++;
                }
            }
            out.write((d + "\n").getBytes());
        }
        out.flush();
    }

}
