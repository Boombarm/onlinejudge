/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1911 Help Girafales
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1911
 * @Status: Accepted 23/10/2015 - 07:53:30 Runtime:0.056s
 * @Solution:
 */
package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class P1911_Help_Girafales {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            Map<String, String> signature = new HashMap<String, String>();
            for (int i = 0; i < n; i++) {
                String st1 = sc.next();
                String st2 = sc.next();
                signature.put(st1, st2);
            }
            int m = sc.nextInt();
            int answer = 0;
            for (int i = 0; i < m; i++) {
                String st1 = sc.next();
                String st2 = sc.next();
                String Origial = signature.get(st1);
                if (check(Origial, st2)) {
                    answer++;
                }
            }
            bw.append(answer + "");
            bw.newLine();
            bw.flush();
        }

    }

    static boolean check(String s1, String s2) {
        int length = (s1.length() < s2.length()) ? s1.length() : s2.length();
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                if (count > 1) {
                    return true;
                }
            }
        }

        return false;
    }
}
