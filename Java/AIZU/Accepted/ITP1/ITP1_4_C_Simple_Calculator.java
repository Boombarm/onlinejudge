package AIZU.Accepted.ITP1;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: AIZU ONLINE JUDGE
 * @Categories: Computation
 * @Problem: ITP1_4_C: Simple Calculator
 * @Link: http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_4_C
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory: 24356 KB
 * @Submission: 2018-03-15 21:42
 * @Runtime: 00:05 s
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class ITP1_4_C_Simple_Calculator {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        loop:
        while ((input = br.readLine()) != null) {
            String[] st = input.split(" ");
            int a = Integer.parseInt(st[0]);
            int b = Integer.parseInt(st[2]);
            switch (st[1]) {
                case "+":
                    bw.append((a + b) + "\n");
                    break;
                case "-":
                    bw.append((a - b) + "\n");
                    break;
                case "*":
                    bw.append((a * b) + "\n");
                    break;
                case "/":
                    if (a > 0 && b > 0) {
                        bw.append((a / b) + "\n");
                    }
                    else{
                        bw.append("0\n");
                    }
                    break;
                case "?":
                    break loop;
            }
        }
        bw.flush();

    }


}
