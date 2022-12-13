/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: Data Structure and Libraries
 * @Problem: 1704 - Arranging Tasks
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1704
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/5/17, 10:59:33 PM
 * @Runtime: 0.320s
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

public class P1704_Arranging_Tasks {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        String line;
        while ((line = br.readLine()) != null) {
            String[] st = line.split(" ");
            int n = Integer.parseInt(st[0]);
            int h = Integer.parseInt(st[1]);
            int task[][] = new int[n][2];
            int total = 0;
            for (int i = 0; i < n; i++) {
                st = br.readLine().split(" ");
                int val = Integer.parseInt(st[0]);
                int time = Integer.parseInt(st[1]);
                task[i] = new int[]{val, time};
                total += val;
            }
            //2d sort
            Arrays.sort(task, new java.util.Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    int c = Double.compare(o1[0], o2[0]);
                    if (c == 0) {
                        return Double.compare(o1[1], o2[1]);
                    }
                    return c;
                }
            });
            int cost = 0;
            boolean[] ready = new boolean[h];
            for (int i = n - 1; i >= 0; --i) {
                for (int j = (task[i][1] - 1); j >= 0; --j) {
                    if (!ready[j]) {
                        ready[j] = true;
                        cost += task[i][0];
                        break;
                    }
                }
            }
            out.write(((total - cost) + "\n").getBytes());
        }
        out.flush();
    }

}
