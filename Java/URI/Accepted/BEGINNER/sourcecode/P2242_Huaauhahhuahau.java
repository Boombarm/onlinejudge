/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2242 Huaauhahhuahau
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2242
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 12/13/16, 11:01:40 AM
 * @Runtime: 0.052s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2242_Huaauhahhuahau {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String laugh = br.readLine();
        String vowelPattern1 = "", vowelPattern2 = "";
        for (int i = 0; i < laugh.length(); i++) {
            char c = laugh.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelPattern1 += c;
                vowelPattern2 = c + vowelPattern2;
            }
        }
        System.out.println(vowelPattern1.length() == 0 ? "N" : (vowelPattern1.equals(vowelPattern2) ? "S" : "N"));

    }

}
