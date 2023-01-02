/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1253 Caesar Cipher
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1253
 * @Timelimit: 1 sec
 * @Status: Accepted 11/10/2015 - 11:55:57 Runtime:0.216s
 * @Solution:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1253_Caesar_Cipher {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String caesarCipher = br.readLine();
            int encodeShift = Integer.parseInt(br.readLine());
            String plaintext = "";
            for (int j = 0; j < caesarCipher.length(); j++) {
                plaintext += (caesarCipher.charAt(j) - encodeShift >= 'A') ? (char) (caesarCipher.charAt(j) - encodeShift) : (char) ('Z' - (encodeShift - (caesarCipher.charAt(j) - ('A' - 1))));
            }
            System.out.println(plaintext);
        }
    }

}
