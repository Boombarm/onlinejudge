/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: MATHEMATICS
 * @Problem: 2218 - The Fearful Evil-Son
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2218
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 2/22/17, 10:18:13 PM
 * @Runtime: 0.064s
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

public class P2218_The_Fearful_Evil_Son {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        TreeMap<Integer, Integer> memory = new TreeMap<Integer, Integer>();
        int max = 0;
        int lastMax = 1;
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Math.abs(Integer.parseInt(br.readLine()));
            if (max <= n) {
                for (int i = max; i <= n; i++) {
                    lastMax = i + lastMax;
                    memory.put(i, lastMax);
                }
                bw.append(lastMax + "\n");
                max = n + 1;
            } else {
                bw.append(memory.get(n) + "\n");
            }
        }
        bw.flush();
    }

}
