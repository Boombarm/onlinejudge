package COJ.Accepted;


/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: COJ
 * @Problem: 1306 - Div 4
 * @Link: http://coj.uci.cu/24h/problem.xhtml?pid=1306
 * @Timelimit: 6000 MS
 * @Status: Accepted
 * @Submission: 2018-02-01 23:31:54
 * @Runtime: 233
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;

public class P1306_DIV4 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            BigDecimal b = new BigDecimal(br.readLine());
            bw.append(b.remainder(new BigDecimal("4")).compareTo(BigDecimal.ZERO) == 0 ? "YES\n" : "NO\n");
        }
        bw.flush();
    }
}
