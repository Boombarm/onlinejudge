/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1211 Economic Phonebook
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1211
 * @Timelimit: 3 sec
 * @Status: Accepted
 * @Submission: 4/4/16, 9:41:55 PM
 * @Runtime: 0.248s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class P1211_Economic_Phonebook {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        String input;
        while ((input = br.readLine()) != null) {
            int n = Integer.parseInt(input);
            ArrayList<String> phonebook = new ArrayList<String>();
            for (int i = 0; i < n; i++) {
                phonebook.add(br.readLine());
            }
            Collections.sort(phonebook, ALPHABETICAL_ORDER);
            String base = phonebook.get(0);
            int l = base.length();
            int maximum = 0;
            for (int i = 1; i < n; i++) {
                String c = phonebook.get(i);
                for (int j = 0; j < l; j++) {
                    if (base.charAt(j) == c.charAt(j)) {
                        maximum++;
                        continue;
                    }
                    break;
                }
                base = c;
            }
            out.write((maximum + "\n").getBytes());
        }
        out.flush();
    }

    private static Comparator<String> ALPHABETICAL_ORDER = new Comparator<String>() {
        public int compare(String str1, String str2) {
            int res = String.CASE_INSENSITIVE_ORDER.compare(str1, str2);
            return (res != 0) ? res : str1.compareTo(str2);
        }
    };

}
