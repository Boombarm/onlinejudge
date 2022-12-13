/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: DATA STRUCTURES AND LIBRARIES
 * @Problem: 2136 - Friends of Habay
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2136
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/20/17, 1:42:49 AM
 * @Runtime: 0.028s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class P2136_Friends_of_Habay {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        SortedSet set1 = new TreeSet();
        SortedSet set2 = new TreeSet();
        String input;
        String theFriend = "";
        int big = 0;
        while (!(input = br.readLine()).equals("FIM")) {
            String[] st = input.split(" ");
            if (st[1].equals("YES")) {
                set1.add(st[0]);
                int length = st[0].length();
                if (length > big) {
                    big = length;
                    theFriend = st[0];
                }
            } else {
                set2.add(st[0]);
            }
        }
        for (Iterator iterator = set1.iterator(); iterator.hasNext();) {
            String next = (String) iterator.next();
            bw.append(next + "\n");
        }
        for (Iterator iterator = set2.iterator(); iterator.hasNext();) {
            String next = (String) iterator.next();
            bw.append(next + "\n");
        }
        bw.append("\nAmigo do Habay:\n");
        bw.append(theFriend + "\n");
        bw.flush();
    }

}
