package AIZU.Accepted.ITP1;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: AIZU ONLINE JUDGE
 * @Categories:
 * @Problem: ITP1_9_A: Finding_a_Word
 * @Link: http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_9_A
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory: 24360 KB
 * @Submission: 2018-03-15 17:29
 * @Runtime: 00:05 s
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class ITP1_9_A_Finding_a_Word {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String T = br.readLine().toLowerCase();

        int count = 0;
        String input;
        while (!(input = br.readLine()).equals("END_OF_TEXT")) {
            String[] word = input.toLowerCase().split(" ");
            for (String w : word) {
                if (T.equals(w)) {
                    count++;
                }
            }
        }

        bw.append(count + "\n");
        bw.flush();
    }

}
