package AIZU.Accepted.ALDS1;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: AIZU ONLINE JUDGE
 * @Categories: Getting Started
 * @Problem: ALDS1_1_B: Greatest Common Divisor
 * @Link: http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_1_B
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory: 24368 KB
 * @Submission: 2018-03-17 17:21
 * @Runtime: 00:06 s
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class ALDS1_1_B_Greatest_Common_Divisor {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] st = br.readLine().split(" ");
        int a = Integer.parseInt(st[0]);
        int b = Integer.parseInt(st[1]);
        bw.append(gcd(a, b) + "\n");
        bw.flush();
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }


}
