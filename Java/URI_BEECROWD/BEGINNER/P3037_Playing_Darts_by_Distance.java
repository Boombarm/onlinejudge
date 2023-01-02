/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: BEGINNER
 * @Problem: 3037 - Playing Darts by Distance
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/3037
 * @Timelimit: 1 sec
 * @Status: ACCEPTED
 * @Submission: 4/21/20, 1:02:37 PM
 * @Runtime: 0.068s
 * @Solution:
 * @Note:
 */

package URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P3037_Playing_Darts_by_Distance {

    static int i, n, x, d, john, mary;
    static String[] st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            john = mary = 0;
            for (int i = 0; i < 3; i++) {
                st = br.readLine().split(" ");
                x = Integer.parseInt(st[0]);
                d = Integer.parseInt(st[1]);
                john += (x*d);
            }
            for (int i = 0; i < 3; i++) {
                st = br.readLine().split(" ");
                x = Integer.parseInt(st[0]);
                d = Integer.parseInt(st[1]);
                mary += (x*d);
            }
            bw.append((john >= mary ? "JOAO": "MARIA")+"\n");
        }
        bw.flush();
    }

}
