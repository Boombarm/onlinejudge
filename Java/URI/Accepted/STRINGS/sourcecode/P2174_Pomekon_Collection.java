/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: String
 * @Problem: 2174 - Pomekon Collection
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2174
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 1/20/17, 1:09:02 PM
 * @Runtime: 0.056s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class P2174_Pomekon_Collection {

    static Set<String> pomekon_Collection;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        pomekon_Collection = new HashSet<String>();
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            pomekon_Collection.add(br.readLine());
        }
        System.out.println("Falta(m) " + (151 - pomekon_Collection.size()) + " pomekon(s).");
    }

}
