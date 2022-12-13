/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1285 Different Digits
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1285
 * @Timelimit: 1 sec
 * @Status: Accepted 2/9/16, 3:48:25 PM Runtime:0.148s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P1285_Different_Digits {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        String input;
        while ((input = br.readLine()) != null) {
            String[] st = input.split(" ");
            int now = Integer.parseInt(st[0]);
            int end = Integer.parseInt(st[1]);
            int counting = 0;
            loop:
            for (; now <= end; now++) {
                char[] digit = (now + "").toCharArray();
                int size = digit.length;
                for (int i = 0; i < size; i++) {
                    char c = digit[i];
                    for (int j = i + 1; j < size; j++) {
                        if (c == digit[j]) {
                            continue loop;
                        }
                    }
                }
                counting++;

            }
            out.write((counting + "\n").getBytes());
        }
        out.flush();
    }

}
