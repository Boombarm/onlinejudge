/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: String
 * @Problem: 1629 - UnzipFACE
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1629
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 2/13/17, 1:02:13 PM
 * @Runtime: 0.036s
 * @Solution: counting one and zero digit -> find checksum
 * @Note:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P1629_UnzipFACE {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        int n;
        char[] input;
        while ((n = Integer.parseInt(br.readLine())) != 0) {
            while (n-- > 0) {
                int length_one = 0;
                int length_zero = 0;
                input = br.readLine().toCharArray();
                int i = 0;
                for (char c : input) {
                    int length = c - '0';
                    if (i++ % 2 == 0) {
                        length_zero += length;
                    } else {
                        length_one += length;
                    }
                }
                int checksum = calculate(length_zero) + calculate(length_one);
                out.write((checksum + "\n").getBytes());
            }
        }
        out.flush();

    }

    static int calculate(int n) {
        int result = 0;
        while (n >= 1) {
            result += n % 10;
            n /= 10;
        }
        return result;
    }

}
