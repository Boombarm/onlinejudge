package AIZU.Accepted.ITP1;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: AIZU ONLINE JUDGE
 * @Categories: ITP1
 * @Problem: ITP1_1_B: X Cubic
 * @Link: http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_1_B
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory: 24316 KB
 * @Submission: 2018-03-08 11:22
 * @Runtime: 00:04 s
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITP1_1_B_X_Cubic {

    public static void main(String a[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(getAnswer(n));
    }

    static long getAnswer(int n) {
        int a = 1;
        for (int i = 1; i <= 2; i++) {
            a *= n;
        }
        return a * n;
    }

}
