/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: AD-HOC
 * @Problem: 2922 - Classrooms
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2922
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/31/19, 4:55:29 PM
 * @Runtime: 0.048s
 * @Solution: ABS(B-U) - 1
 * @Note:
 */
package URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P2922_Classrooms {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String in;
        while ((in = br.readLine()) != null) {
            String[] st = in.split(" ");
            int B = Integer.parseInt(st[0]);
            int U = Integer.parseInt(st[1]);
            int answer = Math.abs(B - U);
            if (answer > 0) answer -= 1;
            bw.append(answer + "\n");
        }
        bw.flush();

    }

}