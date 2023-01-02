package AIZU.Accepted.ITP1;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: AIZU ONLINE JUDGE
 * @Categories:
 * @Problem: ITP1_3_B: Print Test Cases
 * @Link: http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_3_B
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory: 29060 KB
 * @Submission: 2018-03-08 16:28
 * @Runtime: 00:09 s
 * @Solution:
 * @Note:
 */

import java.io.*;

public class ITP1_3_B_Print_Test_Cases {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int c = 1;
        String input;
        while (!(input = br.readLine()).equals("0")) {
            bw.append("Case " + (c++) + ": " + input + "\n");
        }
        bw.flush();
    }


}
