/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1803 Matring
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1803
 * @Timelimit: 1 sec
 * @Status: Accepted 24/10/2015 - 10:36:38 Runtime:0.044s
 * @Solution:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1803_Matring {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = br.readLine();
        int length = line.length();
        String[] messagesCode = new String[length];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < length; j++) {
                if (i == 0) {
                    messagesCode[j] = "";
                }
                messagesCode[j] += line.charAt(j);
            }
            if (i <= 2) {
                line = br.readLine();
            }
        }

        int firstKey = Integer.parseInt(messagesCode[0]);
        int lastKey = Integer.parseInt(messagesCode[length - 1]);
        for (int i = 1; i < length - 1; i++) {
            int now = Integer.parseInt(messagesCode[i]);
            int asciiCode = ((firstKey * now) + lastKey) % 257;
            bw.append((char) asciiCode);
        }
        bw.newLine();
        bw.flush();
    }

}
