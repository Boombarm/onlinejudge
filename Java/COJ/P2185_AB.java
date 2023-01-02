package COJ.Accepted;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: COJ
 * @Problem: 2185 - A ? B
 * @Link: http://coj.uci.cu/24h/problem.xhtml?pid=2185
 * @Timelimit: 60000 MS
 * @Status: Accepted
 * @Submission: 2018-01-29 04:39:35
 * @Runtime: 2091
 * @Solution:
 * @Note:
 */
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class P2185_AB {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] in = br.readLine().split(" ");
        int a = Integer.parseInt(in[0]);
        int b = Integer.parseInt(in[1]);
        bw.append((a + b) + "\n");
        bw.append((a - b) + "\n");
        bw.append((a * b) + "\n");
        bw.append((a / b) + "\n");
        bw.append((a % b) + "\n");
        bw.flush();
    }
}
