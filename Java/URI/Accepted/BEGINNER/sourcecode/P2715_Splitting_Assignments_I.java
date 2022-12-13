package URI.Accepted.BEGINNER.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: BEGINNER
 * @Problem: 2715 - Splitting Assignments I
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2715
 * @Level: 2
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 10/20/18, 3:20:22 PM
 * @Runtime: 1.448s
 * @Solution: optimum difference left and right
 * @Note:
 */

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Scanner;

public class P2715_Splitting_Assignments_I {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (sc.hasNext()) {
            int n = sc.nextInt();
            long rangelsum = 0;
            long guguSum = 0;
            int[] work = new int[n];
            for (int i = 0; i < n; i++) {
                work[i] = sc.nextInt();
            }
            int i = -1;
            int j = n - 1;
            while (i < j) {
                if (rangelsum <= guguSum) {
                    rangelsum += work[++i];
                } else {
                    guguSum += work[j--];
                }
            }
            bw.append(Math.abs(rangelsum - guguSum) + "\n");
        }
        bw.flush();
    }
}
