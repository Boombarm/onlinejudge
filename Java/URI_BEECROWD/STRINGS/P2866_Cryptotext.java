package URI.Accepted.STRINGS.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2866 - Cryptotext
 * @Link: https://www.urionlinejudge.com.br/repository/UOJ_2866_en.html
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 10/3/18, 10:53:14 AM
 * @Runtime: 0.072s
 * @Memory: 868 Bytes
 * @Solution: find lower letter stack
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P2866_Cryptotext {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            char[] c = br.readLine().toCharArray();
            int size = c.length;
            String text = "";
            for (int i = size - 1; i >= 0; i--) {
                if (Character.isLowerCase(c[i])) {
                    text += c[i];
                }
            }
            bw.append(text + "\n");
        }
        bw.flush();
    }
}
