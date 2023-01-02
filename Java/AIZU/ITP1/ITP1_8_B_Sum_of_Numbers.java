package AIZU.Accepted.ITP1;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: AIZU ONLINE JUDGE
 * @Categories: Character
 * @Problem: ITP1_8_B: Sum of Numbers
 * @Link: http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_8_B
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory: 24260 KB
 * @Submission: 2018-03-15 22:02
 * @Runtime: 00:05 s
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class ITP1_8_B_Sum_of_Numbers {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while (!(input = br.readLine()).equals("0")) {
            int count = 0;
            for (char c : input.toCharArray()) {
                count += (c - '0');
            }
            bw.append(count + "\n");
        }
        bw.flush();
    }


}
