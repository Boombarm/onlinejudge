package AIZU.Accepted.ITP1;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: AIZU ONLINE JUDGE
 * @Categories: ITP1
 * @Problem: ITP1_7_B - How many ways?
 * @Link: http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_7_B
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory: 25472 KB
 * @Submission: 2018-10-08 14:40
 * @Runtime: 00:05 s
 * @Solution: nested loop find sum of tree
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class ITP1_7_B_How_many_ways {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int n, answer;
    static int counting;

    public static void main(String[] args) throws IOException {
        String input;
        while (!(input = br.readLine()).equals("0 0")) {
            String[] st = input.split(" ");
            n = Integer.parseInt(st[0]);
            answer = Integer.parseInt(st[1]);
            counting = 0;

            for (int i = 1; i <= n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    for (int k = j + 1; k <= n; k++) {
                        if (i + j + k == answer) {
                            counting++;
                        }
                    }
                }
            }

            bw.append(counting + "\n");
        }
        bw.flush();
    }


}
