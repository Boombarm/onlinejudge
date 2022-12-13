package AIZU.Accepted.ITP1;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: AIZU ONLINE JUDGE
 * @Categories: ITP1
 * @Problem: ITP1_4_A : A / B Problem
 * @Link: http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_4_A
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory: 26120 KB
 * @Submission: 2018-09-13 11:42
 * @Runtime: 00:05 s
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;

public class ITP1_4_A_AB_Problem {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        DecimalFormat df = new DecimalFormat("0.########");
        int a, b, d, r;
        double f;
        String[] st = br.readLine().split(" ");
        a = Integer.parseInt(st[0]);
        b = Integer.parseInt(st[1]);
        d = a / b;
        r = (a - ((a / b) * b));
        f = (double) a / b;
        bw.append(d + " " + r + " " + df.format(f) + "\n");
        bw.flush();
    }
}
