/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1287 Friendly Int Parser
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1287
 * @Timelimit: 1 sec
 * @Status: Accepted 23/11/2015 - 12:39:05 Runtime:0.108s
 * @Solution:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P1287_Friendly_Int_Parser {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        String input;
        while ((input = br.readLine()) != null) {
            int n = input.length();
            String number = "";
            for (int i = 0; i < n; i++) {
                char now = input.charAt(i);
                if (now == ',' || now == ' ') {
                    continue;
                }
                if (now == 'l') {
                    number += '1';
                } else if (now == 'o' || now == 'O') {
                    number += '0';
                } else if (Character.isDigit(now)) {
                    number += now;
                } else {
                    number = "";
                    break;
                }

            }
            try {
                if (number.isEmpty() || Long.parseLong(number) > 2147483647) {
                    out.write("error\n".getBytes());
                } else {
                    out.write((Integer.parseInt(number) + "\n").getBytes());
                }
            } catch (NumberFormatException e) {
                out.write("error\n".getBytes());
            }
            out.flush();
        }
        out.flush();
    }

}
