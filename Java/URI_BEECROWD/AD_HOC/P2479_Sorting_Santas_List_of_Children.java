/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: AD-HOC
 * @Problem: 2479 - Sorting Santa's List of Children
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2479
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 2/21/17, 6:39:38 PM
 * @Runtime: 0.036s
 * @Solution: TreeSet and Counting
 * @Note:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.TreeSet;

public class P2479_Sorting_Santas_List_of_Children {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        int n = Integer.parseInt(br.readLine());
        int good = 0, bad = 0;
        TreeSet<String> set = new TreeSet<String>();
        while (n-- > 0) {
            String[] st = br.readLine().split(" ");
            if (st[0].equals("+")) {
                ++good;

            } else if (st[0].equals("-")) {
                ++bad;

            }
            set.add(st[1]);
        }
        for (String s : set) {
            bw.append(s + "\n");
        }
        bw.append("Se comportaram: " + good + " | Nao se comportaram: " + bad + "\n");
        bw.flush();
    }

}
