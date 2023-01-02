/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: Beginner 
 * @Problem: 2547 - Roller Coaster
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2547
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 5/9/17, 7:20:34 PM
 * @Runtime: 0.036s 
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2547_Roller_Coaster {

    static int N, Amin, Amax;
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
            Amin = Integer.parseInt(in[1]);
            Amax = Integer.parseInt(in[2]);
            int count = 0;
            while (N-- > 0) {
                int guest = Integer.parseInt(br.readLine());
                if (isAuthorize(guest)) {
                    count++;
                }
            }
            bw.append(count + "\n");
        }
        bw.flush();
    }

    static boolean isAuthorize(int g) {
        return g >= Amin && g <= Amax;
    }
}
