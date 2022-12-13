/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1212 Primary Arithmetic
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1212
 * @Timelimit: 1 sec
 * @Status: Accepted 30/10/2015 - 12:19:25 Runtime:0.088s
 * @Solution:counting carry
 */
package  URI.Accepted.MATHEMATICS.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P1212_Primary_Arithmetic {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        while (true) {
            String line = br.readLine();
            if (line.equals("0 0")) {
                break;
            }
            String[] st = line.split(" ");

            if (st[0].length() < st[1].length()) {
                for (int c = st[0].length(); c < st[1].length(); c++) {
                    st[0] = "0" + st[0];
                }
            }
            if (st[1].length() < st[0].length()) {
                for (int d = st[1].length(); d < st[0].length(); d++) {
                    st[1] = "0" + st[1];
                }
            }
            char a[] = st[0].toCharArray();
            char b[] = st[1].toCharArray();
            int carry = countingCarry(a, b);
            out.write(carry == 0 ? ("No carry operation.\n").getBytes() : (carry == 1 ? (carry + " carry operation.\n").getBytes() : (carry + " carry operations.\n").getBytes()));
        }
        out.flush();
    }

    static int countingCarry(char[] a, char[] b) {
        int carries = 0;
        int carry = 0;
        for (int i = b.length; i > 0; i--) {
            if ((a[i - 1] + b[i - 1]) + carry > 9 + 48 + 48) {
                carry = 1;
                carries++;
            } else {
                carry = 0;
            }
        }
        return carries;
    }

}
