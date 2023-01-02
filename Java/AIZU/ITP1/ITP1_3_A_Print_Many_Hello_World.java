package AIZU.Accepted.ITP1;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: AIZU ONLINE JUDGE
 * @Categories:
 * @Problem: ITP1_3_A: Print Many Hello World
 * @Link: http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_3_A
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory: 24044 KB
 * @Submission: 2018-03-08 16:27
 * @Runtime: 00:04 s
 * @Solution:
 * @Note:
 */

import java.io.*;

public class ITP1_3_A_Print_Many_Hello_World {

    public static void main(String args[]) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = 1000;
        while (n-- > 0){
            bw.append("Hello World\n");
        }
        bw.flush();
    }


}
