/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1632 Variations
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1632
 * @Timelimit: 1 sec
 * @Status: Accepted 04/12/2015 - 07:47:50 Runtime:0.036s
 * @Solution:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P1632_Variations {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        int t = Integer.parseInt(br.readLine());
        int i = 0;
        do {
            String input = br.readLine().toLowerCase();
            int n = input.length();
            int answer = 1;
            for (int j = 0; j < n; j++) {
                switch (input.charAt(j)) {
                    case 'a':
                        answer *= 3;
                        break;
                    case 'e':
                        answer *= 3;
                        break;
                    case 'i':
                        answer *= 3;
                        break;
                    case 'o':
                        answer *= 3;
                        break;
                    case 's':
                        answer *= 3;
                        break;
                    default:
                        answer *= 2;
                        break;
                }
            }
            out.write((answer + "\n").getBytes());
        } while (++i < t);
        out.flush();
    }

}
