package COJ.Accepted;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: COJ
 * @Problem: 1102 - You Can Say 11
 * @Link: http://coj.uci.cu/24h/problem.xhtml?pid=1102
 * @Timelimit: 6000 MS
 * @Status: Accepted
 * @Submission: 2018-01-29 05:26:47
 * @Runtime: 322
 * @Solution:
 * @Note:
 */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;

public class P1102_You_Can_Say_11 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String in;
        while (!(in = br.readLine()).equals("0")) {
            BigDecimal n = new BigDecimal(in);
            ArithmeticException e = null;
            try {
                n.divide(new BigDecimal("11"));
            } catch (ArithmeticException e2) {
                e = e2;
            }
            if (e == null) {
                bw.append(in + " is a multiple of 11.\n");
            } else {
                bw.append(in + " is not a multiple of 11.\n");
            }
        }
        bw.flush();
    }
}
