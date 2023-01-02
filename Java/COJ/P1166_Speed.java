package COJ.Accepted;


/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: COJ
 * @Problem: 1166 - Speed
 * @Link: http://coj.uci.cu/24h/problem.xhtml?pid=1166
 * @Timelimit: 6000 MS
 * @Status: Accepted
 * @Submission: 2018-02-04 23:16:42
 * @Runtime: 194
 * @Solution:
 * @Note:
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1166_Speed {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] st = br.readLine().split(" ");
            int odd = 0, even = 0;
            for (int i = 0; i < n; i++) {
                if (Integer.parseInt(st[i]) % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            bw.append(even + " even and " + odd + " odd.\n");
        }
        bw.flush();
    }

}
