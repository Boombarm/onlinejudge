package COJ.Accepted;


/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: COJ
 * @Problem: 1059 - Numeric Parity
 * @Link: http://coj.uci.cu/24h/problem.xhtml?pid=1059
 * @Timelimit: 6000 MS
 * @Status: Accepted
 * @Submission: 2018-02-02 03:20:27
 * @Runtime: 184
 * @Solution:
 * @Note:
 */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1059_Numeric_Parity {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while (!(input = br.readLine()).equals("0")) {
            int x = Integer.parseInt(input);
            String binary = Integer.toBinaryString(x);
            int count = 0;
            for (char c : binary.toCharArray()) {
                if (c == '1') {
                    count++;
                }
            }
            bw.append("The parity of " + binary + " is " + count + " (mod 2).\n");
        }
        bw.flush();
    }
}
