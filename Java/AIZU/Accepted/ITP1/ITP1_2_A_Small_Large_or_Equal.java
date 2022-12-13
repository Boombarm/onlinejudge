package AIZU.Accepted.ITP1;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: AIZU ONLINE JUDGE
 * @Categories:
 * @Problem: ITP1_2_A: Small, Large, or Equal
 * @Link: http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_2_A
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory: 24372 KB
 * @Submission: 2018-03-08 15:30
 * @Runtime: 00:06 s
 * @Solution:
 * @Note:
 */

import java.io.*;

public class ITP1_2_A_Small_Large_or_Equal {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] st = br.readLine().split(" ");
        int a = Integer.parseInt(st[0]);
        int b = Integer.parseInt(st[1]);
        bw.append(a == b ? "a == b\n" : (a < b ? "a < b\n" : "a > b\n"));
        bw.flush();
    }

}
