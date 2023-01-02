/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2143 The Return of Radar
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2143
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 10/2/16, 3:30:35 AM
 * @Runtime: 0.020 
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2143_The_Return_of_Radar {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while (!(input = br.readLine()).equals("0")) {
            int n = Integer.parseInt(input), number;
            for (int i = 0; i < n; i++) {
                number = Integer.parseInt(br.readLine());

                bw.append(((number * 2) - (number % 2 == 0 ? 2 : 1)) + "\n");
            }
        }
        bw.flush();
    }

}
