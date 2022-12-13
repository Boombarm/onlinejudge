/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1249 Rot13
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1249
 * @Timelimit: 1 sec
 * @Status: Accepted 13/10/2015 - 09:46:40 Runtime:0.232s
 * @Solution:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1249_Rot13 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while ((line = br.readLine()) != null) {
            String answer = "";
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (c >= 65 && c <= 90) {
                    answer += (c - 13 >= 'A') ? (char) (c - 13) : (char) ('Z' - (13 - (c - ('A' - 1))));
                } else if (c >= 97 && c <= 122) {
                    answer += (c - 13 >= 'a') ? (char) (c - 13) : (char) ('z' - (13 - (c - ('a' - 1))));
                } else {
                    answer += c;
                }
            }
            System.out.println(answer);
        }
    }

}
