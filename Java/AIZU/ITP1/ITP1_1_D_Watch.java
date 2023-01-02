package AIZU.Accepted.ITP1;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: AIZU ONLINE JUDGE
 * @Categories:
 * @Problem: ITP1_1_D: Watch
 * @Link: http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_1_D
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory: 24312 KB
 * @Submission: 2018-03-08 12:27
 * @Runtime: 00:05 s
 * @Solution:
 * @Note:
 */

import java.io.*;

public class ITP1_1_D_Watch {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int h = 0, m = 0, s = 0;
        while (n >= 3600) {
            n -= 3600;
            h++;
        }
        while (n >= 60) {
            n -= 60;
            m++;
        }
        s = n;
        bw.append(h + ":" + m + ":" + s + "\n");
        bw.flush();
    }


}
