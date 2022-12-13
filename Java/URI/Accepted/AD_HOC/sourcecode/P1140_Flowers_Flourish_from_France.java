/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1140 Flowers Flourish from France
 * @Link: https://www.urionlinejudge.com.br/judge/problems/view/1140/rate:1140/rating:2
 * @Timelimit: 1 sec
 * @Status: Accepted 27/12/2015 - 18:26:10 Runtime:0.056s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P1140_Flowers_Flourish_from_France {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        String input;
        while (!(input = br.readLine()).equals("*")) {
            String[] st = input.split(" ");
            int n = st.length;
            int i = 1;
            char c = Character.toLowerCase(st[0].charAt(0));
            boolean isTautogram = true;
            while (--n > 0) {
                if (Character.toLowerCase(st[i].charAt(0)) != c) {
                    isTautogram = false;
                    break;
                }
                i++;
            }
            out.write((isTautogram ? "Y\n" : "N\n").getBytes());
        }
        out.flush();
    }

}
