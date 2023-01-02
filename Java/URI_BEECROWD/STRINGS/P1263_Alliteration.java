/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1263 Alliteration
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1263
 * @Status: Accepted 19/10/2015 - 10:05:48 Runtime:0.140s
 * @Solution:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1263_Alliteration {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while ((line = br.readLine()) != null) {
            String[] st = line.split(" ");
            int count = 0;
            char before = ' ';
            for (int i = 0; i < st.length; i++) {
                char c = setLowerCase(st[i].charAt(0));
                if (c == before) {
                    continue;
                }
                before = ' ';
                if (i < st.length - 1 && c == setLowerCase(st[i + 1].charAt(0))) {
                    before = c;
                    count++;
                    i++;
                }
            }

            System.out.println(count);
        }
    }

    static char setLowerCase(char c) {
        return c >= 97 && c <= 122 ? c : Character.toLowerCase(c);
    }

}
