package URI.Accepted.BEGINNER.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: BEGINNER
 * @Problem: 2850 - Polyglot Parrot
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2850
 * @Timelimit: 1 sec
 * @Status:
 * @Memory:
 * @Submission:
 * @Runtime:
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P2850_Polyglot_Parrot {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = "";
        while ((input = br.readLine()) != null) {
            switch (input) {
                case "esquerda":
                    bw.append("ingles\n");
                    break;
                case "direita":
                    bw.append("frances\n");
                    break;
                case "nenhuma":
                    bw.append("portugues\n");
                    break;
                case "as duas":
                    bw.append("caiu\n");
                    break;
            }
        }
        bw.flush();
    }
}
