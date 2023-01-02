package AIZU.Accepted.ITP1;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: AIZU ONLINE JUDGE
 * @Categories: Computation
 * @Problem: ITP1_4_D: Min, Max and Sum
 * @Link: http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_4_D
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory: 28280 KB
 * @Submission: 2018-03-15 22:12
 * @Runtime: 00:07 s
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class ITP1_4_D_Min_Max_and_Sum {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] st = br.readLine().split(" ");
        int min = Integer.MAX_VALUE, max = 0;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int now = Integer.parseInt(st[i]);
            if (min > now) {
                min = now;
            }
            if (max == 0 || max < now) {
                max = now;
            }
            sum += now;
        }
        bw.append(min + " " + max + " " + sum + "\n");
        bw.flush();
    }


}
