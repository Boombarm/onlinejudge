/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: AD-HOC
 * @Problem: 2134 - Who Will Fail?
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2134
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 2/28/17, 9:44:52 PM
 * @Runtime: 0.076s
 * @Solution: List by value 
 * @Note:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.TreeSet;

public class P2134_Who_Will_Fail {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        String input;
        int t = 1;
        while ((input = br.readLine()) != null) {
            int n = Integer.parseInt(input);
            TreeSet<String>[] solved = new TreeSet[11];
            for (int i = 0; i < n; i++) {
                String[] st = br.readLine().split(" ");
                String name = st[0];
                int totalSolved = Integer.parseInt(st[1]);
                if (solved[totalSolved] == null) {
                    solved[totalSolved] = new TreeSet();
                }
                solved[totalSolved].add(name);
            }
            bw.append("Instancia " + (t++) + "\n");
            String fail = "";
            for (int i = 0; i < n; i++) {
                if (solved[i] != null) {
                    fail = solved[i].last();
                    break;
                }
            }
            bw.append(fail + "\n\n");
        }
        bw.flush();
    }

}
