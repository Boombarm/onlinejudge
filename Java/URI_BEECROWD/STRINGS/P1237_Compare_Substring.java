/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1237 Compare Substring
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1237
 * @Timelimit: 1 sec
 * @Status: Accepted 24/11/2015 - 05:41:00 Runtime:0.164s
 * @Solution:LCS(Longest Common Subsequent)
 */
package Accepted.STRINGS.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class P1237_Compare_Substring {

    static int longest, maxLongest;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        String text1, text2;
        while ((text1 = br.readLine()) != null) {
            text2 = br.readLine();
            maxLongest = 0;
            for (int i = 0; i < text1.length(); i++) {
                for (int j = 0; j < text2.length(); j++) {
                    if (text1.charAt(i) == text2.charAt(j)) {
                        longest = 0;
                        int k = i, l = j;
                        while (k < text1.length() && l < text2.length()) {
                            if (text1.charAt(k) == text2.charAt(l)) {
                                longest++;
                            } else {
                                break;
                            }
                            k++;
                            l++;
                        }
                        if (longest > maxLongest) {
                            maxLongest = longest;
                        }
                    }
                }
            }
            out.write((maxLongest + "\n").getBytes());
        }
        out.flush();
    }

}
