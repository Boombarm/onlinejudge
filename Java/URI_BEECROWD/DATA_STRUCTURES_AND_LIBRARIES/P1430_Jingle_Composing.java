/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1430 Jingle Composing
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1430
 * @Timelimit: 1 sec
 * @Status: Accepted 22/11/2015 - 11:08:37 Runtime:0.132s
 * @Solution: mapping and calculate
 */
package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public class P1430_Jingle_Composing {

    static Map<Character, Double> jingle = new HashMap<Character, Double>();

    static {
        jingle.put('W', 1.0);
        jingle.put('H', 0.5);
        jingle.put('Q', 0.25);
        jingle.put('E', 0.125);
        jingle.put('S', 0.0625);
        jingle.put('T', 0.03125);
        jingle.put('X', 0.015625);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        String input;
        while (!(input = br.readLine()).equals("*")) {
            double s = 0;
            int answer = 0;
            int n = input.length();
            for (int i = 1; i < n; i++) {
                char now = input.charAt(i);
                if (jingle.get(now) != null) {
                    s += jingle.get(now);
                } else {
                    if (s > 1) {
                        s = 0;
                    }
                    answer += s;
                    s = 0;
                }
            }
            out.write((answer + "\n").getBytes());
            answer = 0;
        }
        out.flush();
    }
}
