/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: String
 * @Problem: 2157 - Mirror Sequence 
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2157
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 1/20/17, 2:22:06 AM
 * @Runtime: 0.044s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2157_Mirror_Sequence {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int c = Integer.parseInt(br.readLine());
        while (c-- > 0) {
            String[] st = br.readLine().split(" ");
            int start = Integer.parseInt(st[0]);
            int end = Integer.parseInt(st[1]);
            StringBuffer s = new StringBuffer();
            for (int i = start; i <= end; i++) {
                s.append(i);
            }
            bw.append(s.toString() + s.reverse() + "\n");
        }
        bw.flush();
    }

}
