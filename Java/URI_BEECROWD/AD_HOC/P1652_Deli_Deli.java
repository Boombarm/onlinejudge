/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1652 Deli Deli
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1652
 * @Timelimit: 1 sec
 * @Status: Accepted 28/12/2015 - 10:46:21 Runtime:0.032s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class P1652_Deli_Deli {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] st = br.readLine().split(" ");
        int l = Integer.parseInt(st[0]);
        int n = Integer.parseInt(st[1]);
        HashMap<String, String> plural = new HashMap<String, String>();
        while (l-- > 0) {
            st = br.readLine().split(" ");
            plural.put(st[0], st[1]);
        }

        while (n-- > 0) {
            String word = br.readLine();
            String answer = word;

            if (plural.get(answer) != null) {
                answer = plural.get(word);
            } else if (word.endsWith("y") && !word.endsWith("ay") && !word.endsWith("ey") && !word.endsWith("iy") && !word.endsWith("oy") && !word.endsWith("uy")) {
                answer = answer.substring(0, answer.length() - 1) + "ies";
            } else if (word.endsWith("o") || word.endsWith("s") || word.endsWith("ch") || word.endsWith("sh") || word.endsWith("x")) {
                answer += "es";
            } else {
                answer += "s";
            }
            bw.append(answer + "\n");
        }
        bw.flush();

    }
}
