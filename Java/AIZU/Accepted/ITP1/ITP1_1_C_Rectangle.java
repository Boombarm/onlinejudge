package AIZU.Accepted.ITP1;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: AIZU ONLINE JUDGE
 * @Categories:
 * @Problem: ITP1_1_C: Rectangle
 * @Link: http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_1_C
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory: 24192 KB
 * @Submission: 2018-03-08 12:09
 * @Runtime: 00:04 s
 * @Solution:
 * @Note: find area and perimeter of the rectangle by length a and breadth b
 */

import java.io.*;

public class ITP1_1_C_Rectangle {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] st = br.readLine().split(" ");
        int a = Integer.parseInt(st[0]);
        int b = Integer.parseInt(st[1]);
        int area = a * b;
        int perimeter = 2*(a + b);
        bw.append(area + " " + perimeter + "\n");
        bw.flush();
    }

}
