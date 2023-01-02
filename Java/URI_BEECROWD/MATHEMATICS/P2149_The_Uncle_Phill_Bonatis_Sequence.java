/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: MATHEMATICS
 * @Problem: 2149 - The Uncle Phill Bonati's Sequence
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2149
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 2/23/17, 7:58:14 PM
 * @Runtime: 0.032s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.MATHEMATICS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.TreeMap;

public class P2149_The_Uncle_Phill_Bonatis_Sequence {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        TreeMap<Integer, Long> memory = new TreeMap();
        for (int i = 1; i <= 17; i++) {
            memory.put(i, PhillBonati(i));
        }
        for (String input = br.readLine(); input != null; input = br.readLine()) {
            bw.append(memory.get(Integer.parseInt(input)) + "\n");
        }
        bw.flush();
    }

    static long PhillBonati(long n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }
        int c = (int) ((long) n % 2);
        switch (c) {
            case 0:
                return PhillBonati(n - 2) * PhillBonati(n - 1);
            default:
                return PhillBonati(n - 2) + PhillBonati(n - 1);
        }
    }

}
