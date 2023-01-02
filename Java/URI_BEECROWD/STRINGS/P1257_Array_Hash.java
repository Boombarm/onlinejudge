/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1257 Array Hash
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1257
 * @Timelimit: 1 sec
 * @Status: Accepted 03/12/2015 - 15:15:18 Runtime:0.080s
 * @Solution:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P1257_Array_Hash {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        int n = Integer.parseInt(br.readLine());
        int i = 0;
        do {
            int m = Integer.parseInt(br.readLine());
            int hashNumber = 0;
            for (int j = 0; j < m; j++) {
                String line = br.readLine();
                for (int k = 0; k < line.length(); k++) {
                    hashNumber += ((line.charAt(k) - 'A') + j + k);
                }
            }
            out.write((hashNumber + "\n").getBytes());
        } while (++i < n);
        out.flush();
    }

}
