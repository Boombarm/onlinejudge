/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: AD-HOC
 * @Problem: 2227 - Airport
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2227
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 4/8/20, 2:12:41 PM
 * @Runtime: 0.260s
 * @Solution:
 * @Note:
 */


package URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;


public class P2227_Airport {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = "";
        int t = 0;
        while (!(line = br.readLine()).equals("0 0")) {
            String[] st = line.split(" ");
            int a = Integer.parseInt(st[0]);
            int v = Integer.parseInt(st[1]);
            int[] airport = new int[a + 1];
            int most_traffic = 0;
            for (int i = 0; i < v; i++) {
                st = br.readLine().split(" ");
                int x = Integer.parseInt(st[0]);
                int y = Integer.parseInt(st[1]);
                airport[x]++;
                airport[y]++;
                if (most_traffic < airport[x]) most_traffic = airport[x];
                if (most_traffic < airport[y]) most_traffic = airport[y];
            }
            bw.append("Teste " + (++t) + "\n");
            for (int i = 1; i <= a; i++) {
                if (airport[i] == most_traffic) {
                    bw.append(i + " ");
                }
            }
            bw.append("\n\n");
        }
        bw.flush();
    }

}
