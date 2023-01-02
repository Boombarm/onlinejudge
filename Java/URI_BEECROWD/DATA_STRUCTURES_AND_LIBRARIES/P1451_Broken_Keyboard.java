/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: Data Structure and Libraries
 * @Problem: 1451 - Broken Keyboard
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1451
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/5/17, 12:35:38 AM
 * @Runtime: 0.204s
 * @Solution: [ = insert fist , ] = insert last
 * @Note:
 */
package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1451_Broken_Keyboard {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        String input;
        while ((input = br.readLine()) != null) {
            char[] in = input.toCharArray();
            boolean home = true;
            StringBuilder tmp = new StringBuilder();
            StringBuilder answer = new StringBuilder();
            for (char c : in) {
                switch (c) {
                    case '[':
                        if (tmp.length() > 0) {
                            answer.insert(0, tmp);
                            tmp.setLength(0);
                        }
                        home = true;
                        break;
                    case ']':
                        if (tmp.length() > 0) {
                            answer.insert(0, tmp);
                            tmp.setLength(0);
                        }
                        home = false;
                        break;
                    default:
                        if (home) {
                            tmp.append(c);
                        } else {
                            answer.append(c);
                        }
                        break;
                }
            }
            if (tmp.length() > 0) {
                answer.insert(0, tmp);
            }
            bw.append(answer.toString() + "\n");
        }
        bw.flush();
    }
}
