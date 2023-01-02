/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: AD-HOC
 * @Problem: 2548 - 3D Virtual Museum
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2548
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 5/10/17, 9:10:50 PM
 * @Runtime: 0.048s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2548_3D_Virtual_Museum {

    static int N, M;
    static String[] in;

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        String input;
        while ((input = br.readLine()) != null) {
            in = input.split(" ");
            N = Integer.parseInt(in[0]);
            M = Integer.parseInt(in[1]);
            in = br.readLine().split(" ");
            long answer = 0;
            for (int i = 0, j = N - 1; i < M; i++, j--) {
                answer += Integer.parseInt(in[j]);
            }
            bw.append(answer + "\n");
        }
        bw.flush();
    }

}
