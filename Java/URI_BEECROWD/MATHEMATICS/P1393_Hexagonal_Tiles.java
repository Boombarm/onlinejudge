package  URI.Accepted.MATHEMATICS.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1393 Hexagonal Tiles
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1393
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/27/16, 1:01:07 PM
 * @Runtime: 0.060s
 * @Solution: fibonacci
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1393_Hexagonal_Tiles {

    private static long[] fibonacci = new long[40];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        fibonacci[0] = 1;
        fibonacci[1] = 2;
        for (int i = 2; i < 40; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        String input;
        while (!(input = br.readLine()).equals("0")) {
            int n = Integer.parseInt(input);
            bw.append(fibonacci[n - 1] + "\n");
        }
        bw.flush();
    }

}
