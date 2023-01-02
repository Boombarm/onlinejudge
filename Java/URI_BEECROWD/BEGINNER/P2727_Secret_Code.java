package URI.Accepted.BEGINNER.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2727 - Secret Code2727 - Secret Code
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2727
 * @Timelimit: 5 sec
 * @Status: Accepted
 * @Submission: 4/8/18, 11:13:28 PM
 * @Runtime: 0.024s
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2727_Secret_Code {

    public P2727_Secret_Code() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while ((input = br.readLine()) != null) {
            int n = Integer.parseInt(input);
            int index = 0;
            for (; n > 0; --n) {
                String[] st = br.readLine().split(" ");
                int size = st[0].length();
                switch (size) {
                    case 1:
                        index = -3;
                        break;
                    case 2:
                        index = -2;
                        break;
                    case 3:
                        index = -1;
                        break;
                }
                index += (st.length * 3);
                bw.append((char) ('a' + index) + "\n");
            }
        }
        bw.flush();
    }

}
