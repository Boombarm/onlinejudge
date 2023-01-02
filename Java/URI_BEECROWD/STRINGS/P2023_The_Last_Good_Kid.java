/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2023 The Last Good Kid
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2023
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 2/25/16, 1:37:23 PM
 * @Runtime: 0.064s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class P2023_The_Last_Good_Kid {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        ArrayList<String> names = new ArrayList();
        while ((input = br.readLine()) != null) {
            names.add(input);
        }
        Collections.sort(names, ALPHABETICAL_ORDER);
        bw.append(names.get(0) + "\n");
        bw.flush();
    }

    private static Comparator<String> ALPHABETICAL_ORDER = new Comparator<String>() {
        public int compare(String str1, String str2) {
            int res = String.CASE_INSENSITIVE_ORDER.compare(str2, str1);
            if (res == 0) {
                res = str2.compareTo(str1);
            }
            return res;
        }
    };

}
