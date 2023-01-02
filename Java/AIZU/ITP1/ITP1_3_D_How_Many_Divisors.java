package AIZU.Accepted.ITP1;
/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: AIZU ONLINE JUDGE
 * @Categories: ITP1
 * @Problem: ITP1_3_D: How Many Divisors?
 * @Link: http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_3_D
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory: 24448 KB
 * @Submission: 2018-09-11 12:19
 * @Runtime: 00:04 s
 * @Solution: counting divisor between a and b
 * @Note:
 */


import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ITP1_3_D_How_Many_Divisors {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] st = br.readLine().split(" ");
        int a = Integer.parseInt(st[0]);
        int b = Integer.parseInt(st[1]);
        int c = Integer.parseInt(st[2]);
        int counting = 0;
        for (; a <= b; a++) {
            if (c % a == 0) {
                counting++;
            }
        }
        bw.append(counting + "\n");
        bw.flush();
    }


}
