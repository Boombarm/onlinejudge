package AIZU.Accepted.ITP1;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: AIZU ONLINE JUDGE
 * @Categories: Character
 * @Problem: ITP1_8_A - Toggling Cases
 * @Link: http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_8_A
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory: 24468 KB
 * @Submission: 2018-03-15 11:41
 * @Runtime: 00:06 s
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class ITP1_8_A_Toggling_Cases {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while ((input = br.readLine()) != null) {
            for (char c : input.toCharArray()) {
                if (c >= 'A' && c <= 'Z') {
                    bw.append((char) (c + 32));
                } else if (c >= 'a' && c <= 'z') {
                    bw.append((char) (c - 32));
                } else {
                    bw.append(c);
                }
            }
            bw.newLine();
        }
        bw.flush();
    }

}
