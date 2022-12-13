/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2049 Numbers of Ahmoc
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2049
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 5/6/16, 5:03:53 PM
 * @Runtime: 0.048s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2049_Numbers_of_Ahmoc {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine(), text;
        int round = 1;
        while (!input.equals("0")) {
            bw.append("Instancia " + round + "\n");
            text = br.readLine();
            int i = 0;
            int inputSize = input.length();
            int textSize = text.length();
            boolean match = false;
            while (i < textSize) {
                char now = text.charAt(i);
                if (now == input.charAt(0) && (i + inputSize) <= textSize) {
                    int j = 1;
                    i += 1;
                    for (; j < inputSize; i++, j++) {
                        now = text.charAt(i);
                        if (now != input.charAt(j)) {
                            break;
                        }
                    }
                    if (j == inputSize) {
                        match = true;
                        break;
                    }
                }
                i++;
            }
            input = br.readLine();
            bw.append((match ? "verdadeira" : "falsa") + "\n" + (!input.equals("0") ? "\n" : ""));
            round++;
        }
        bw.flush();
    }

}
