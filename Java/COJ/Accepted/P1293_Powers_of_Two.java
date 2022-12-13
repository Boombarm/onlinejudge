package COJ.Accepted;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: COJ
 * @Problem: 1293 - Powers of Two
 * @Link: http://coj.uci.cu/24h/problem.xhtml?pid=1293
 * @Timelimit: 60000 MS
 * @Status: Accepted
 * @Submission: 2018-01-29 04:30:32
 * @Runtime: 1759
 * @Solution:
 * @Note:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class P1293_Powers_of_Two {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigDecimal bd = new BigDecimal("2");
        bd = bd.pow(Integer.parseInt(br.readLine()));
        System.out.println(bd);
    }
}
