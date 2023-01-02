package AIZU.Accepted.ITP1;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: AIZU ONLINE JUDGE
 * @Categories: Structured Program I
 * @Problem: ITP1_5_A: Print a Rectangle
 * @Link: http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_5_A
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory: 26132 KB
 * @Submission: 2018-03-15 21:51
 * @Runtime: 00:07 sec
 * @Solution:
 * @Note:
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;


public class ITP1_5_A_Print_a_Rectangle {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while (!(input = br.readLine()).equals("0 0")) {
            String[] st = input.split(" ");
            int y = Integer.parseInt(st[0]);
            int x = Integer.parseInt(st[1]);
            for (int i = 0; i < y; i++) {
                for (int j = 0; j < x; j++) {
                    bw.append("#");
                }
                bw.newLine();
            }
            bw.newLine();
        }
        bw.flush();
    }


}
