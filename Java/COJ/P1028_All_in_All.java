package COJ.Accepted;


/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: COJ
 * @Categories:
 * @Problem: 1028 - All in All
 * @Link: http://coj.uci.cu/24h/problem.xhtml?pid=1028
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory:
 * @Submission: 2019-01-22 04:04:00
 * @Runtime: 210
 * @Solution:
 * @Note:
 */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1028_All_in_All {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String in;
        loop:
        while ((in = br.readLine()) != null) {
            String[] st = in.split(" ");
            char[] a = st[0].toCharArray();
            char[] b = st[1].toCharArray();
            int aSize = a.length;
            int bSize = b.length;
            int j = 0;
            for (int i = 0; i < bSize; i++) {
                if (b[i] == a[j]) {
                    if (++j == aSize) {
                        bw.append("Yes\n");
                        continue loop;
                    }
                }
            }
            bw.append("No\n");
        }
        bw.flush();
    }

}
