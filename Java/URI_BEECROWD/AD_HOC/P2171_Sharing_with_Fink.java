/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: Ad-Hoc
 * @Problem: 2171 - Sharing with Fink
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2171
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 1/22/17, 6:49:44 PM
 * @Runtime: 0.080s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P2171_Sharing_with_Fink {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        int[] fink = new int[100000];
        int[] woody = new int[100000];
        int steal = 2;
        int i = 1, j = i, k;
        while (i <= 100000) {
            k = 0;
            while (j <= 100000 && k < steal) {
                fink[j - 1] = i;
                woody[j - 1] = k;
                k++;
                j++;
            }
            i = j;
            steal++;
        }
        String input;
        while (!(input = br.readLine()).equals("0")) {
            int n = Integer.parseInt(input);
            out.write((fink[n - 1] + " " + woody[n - 1] + "\n").getBytes());
        }
        out.flush();
    }

}
