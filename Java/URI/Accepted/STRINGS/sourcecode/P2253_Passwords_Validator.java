/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online judge
 * @Problem: 2253 Passwords Validator
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2253
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 12/18/16, 11:54:49 AM
 * @Runtime: 0.028s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2253_Passwords_Validator {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while ((input = br.readLine()) != null) {
            int countDigit = 0;
            int countUpperCase = 0;
            int countLowerCase = 0;
            boolean isValid = true;
            int length = input.length();
            if (length >= 6 && length <= 32) {
                for (char c : input.toCharArray()) {
                    if (!Character.isJavaIdentifierPart(c)) {
                        isValid = false;
                        break;
                    } else if (Character.isLowerCase(c)) {
                        countLowerCase++;
                    } else if (Character.isUpperCase(c)) {
                        countUpperCase++;
                    } else if (Character.isDigit(c)) {
                        countDigit++;
                    }
                }
                if (isValid && countDigit >= 1 && countLowerCase >= 1 && countUpperCase >= 1) {
                    bw.append("Senha valida.");
                } else {
                    bw.append("Senha invalida.");
                }

            } else {
                bw.append("Senha invalida.");
            }

            bw.newLine();
        }

        bw.flush();
    }
}
