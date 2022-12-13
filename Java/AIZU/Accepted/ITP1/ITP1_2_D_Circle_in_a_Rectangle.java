package AIZU.Accepted.ITP1;
/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: AIZU ONLINE JUDGE
 * @Categories: ITP1
 * @Problem: ITP1_2_D: Circle in a Rectangle
 * @Link: http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_2_D
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory: 24428 KB
 * @Submission: 2018-09-10 11:24
 * @Runtime: 00:03 s
 * @Solution: check point +- r < Width and height area
 * @Note:
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ITP1_2_D_Circle_in_a_Rectangle {

    static int w, h, x, y, r;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] st = br.readLine().split(" ");
        w = Integer.parseInt(st[0]);
        h = Integer.parseInt(st[1]);
        x = Integer.parseInt(st[2]);
        y = Integer.parseInt(st[3]);
        r = Integer.parseInt(st[4]);

        if (x + r > w || x - r < 0 || y + r > h || y - r < 0) {
            System.out.println("No");
            return;
        }

        System.out.println("Yes");

        bw.flush();
    }

}
