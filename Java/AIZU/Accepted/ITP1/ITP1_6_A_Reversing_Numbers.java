package AIZU.Accepted.ITP1;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: AIZU ONLINE JUDGE
 * @Categories:
 * @Problem: ITP1_6_A: Reversing Numbers
 * @Link: http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_6_A
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory: 24544 KB
 * @Submission: 2018-03-08 18:07
 * @Runtime: 00:05 s
 * @Solution:
 * @Note:
 */

import java.io.*;

public class ITP1_6_A_Reversing_Numbers {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] st = br.readLine().split(" ");
        for (int i = n - 1; i >= 0; i--) {
            if (i < n - 1) {
                bw.append(" ");
            }
            bw.append(st[i]);
        }
        bw.newLine();
        bw.flush();
    }


}
