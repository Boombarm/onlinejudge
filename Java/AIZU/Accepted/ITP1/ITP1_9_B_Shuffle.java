package AIZU.Accepted.ITP1;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: AIZU ONLINE JUDGE
 * @Categories: ITP1
 * @Problem: ITP1_9_B : Shuffle
 * @Link: http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_9_B
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory: 24324 KB
 * @Submission: 2018-09-10 12:24
 * @Runtime: 00:03 s
 * @Solution: substring
 * @Note:
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class ITP1_9_B_Shuffle {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String text = "";
        while (!(text = br.readLine()).equals("-")) {
            int n = Integer.parseInt(br.readLine());
            while (n-- > 0) {
                int i = Integer.parseInt(br.readLine());
                text = text.substring(i) + text.substring(0, i);
            }
            bw.append(text + "\n");
        }

        bw.flush();
    }

}
