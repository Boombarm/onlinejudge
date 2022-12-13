package AIZU.Accepted.ITP1;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: AIZU ONLINE JUDGE
 * @Categories:
 * @Problem: ITP1_2_B: Range
 * @Link: http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_2_B
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory: 24500 KB
 * @Submission: 2018-03-08 15:55
 * @Runtime: 00:05 s
 * @Solution:
 * @Note:
 */

import java.io.*;

public class ITP1_2_B_Range {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] st = br.readLine().split(" ");
        int a = Integer.parseInt(st[0]);
        int b = Integer.parseInt(st[1]);
        int c = Integer.parseInt(st[2]);
        bw.append(a < b && b < c ? "Yes\n" : "No\n");
        bw.flush();
    }


}
