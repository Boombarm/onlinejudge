package AIZU.Accepted.ITP1;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: AIZU ONLINE JUDGE
 * @Categories:
 * @Problem: ITP1_2_C: Sorting_Three_Numbers
 * @Link: http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_2_C
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory: 24408 KB
 * @Submission: 2018-03-08 16:15
 * @Runtime: 00:05 s
 * @Solution: Insert Sort
 * @Note:
 */

import java.io.*;

public class ITP1_2_C_Sorting_Three_Numbers {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] st = br.readLine().split(" ");
        int[] n = new int[3];
        for (int i = 0; i < 3; i++) {
            n[i] = Integer.parseInt(st[i]);
            for (int j = i; j >= 1; j--) {
                if (n[j - 1] > n[j]) {
                    int tmp = n[j];
                    n[j] = n[j - 1];
                    n[j - 1] = tmp;
                }
            }
        }
        bw.append(n[0] + " " + n[1] + " " + n[2] + "\n");
        bw.flush();
    }


}
