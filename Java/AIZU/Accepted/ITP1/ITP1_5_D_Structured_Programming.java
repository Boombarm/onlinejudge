package AIZU.Accepted.ITP1;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: AIZU ONLINE JUDGE
 * @Categories: Structured Program I
 * @Problem: ITP1_5_D -  Structured Programming
 * @Link: http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_5_D#
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory: 26024 KB
 * @Submission: 2018-03-15 10:55
 * @Runtime: 00:07 s
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class ITP1_5_D_Structured_Programming {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int i = 1;

        do {
            int x = i;
            if (CHECK_NUM(x) != -1) {
                bw.append(" " + i);
            } else {
                loop:
                while (x > 0) {
                    if (INCLUDE3(x) != -1) {
                        bw.append(" " + i);
                        break;
                    }
                    x /= 10;
                }
            }
        }
        while (++i <= n);
        bw.newLine();
        bw.flush();
    }

    static int INCLUDE3(int x) {
        if (x % 10 == 3) {
            return x;
        }
        return -1;
    }

    static int CHECK_NUM(int x) {
        if (x % 3 == 0) {
            return x;
        }
        return -1;
    }

}
