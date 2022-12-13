package AIZU.Accepted.ITP1;


/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: AIZU ONLINE JUDGE
 * @Categories: ITP1
 * @Problem: ITP1_4_B: Circle
 * @Link: http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_4_B
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory: 26120 KB
 * @Submission: 2018-09-13 14:30
 * @Runtime: 00:05 s
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class ITP1_4_B_Circle {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        DecimalFormat df = new DecimalFormat("0.######");
        Double r = Double.parseDouble(br.readLine());
        double area = (Math.PI * r) * r;
        double circumference = 2 * Math.PI * r;
        bw.append(df.format(area) + " " + df.format(circumference) + "\n");
        bw.flush();
    }
}
