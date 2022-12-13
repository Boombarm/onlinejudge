package URI.Accepted.BEGINNER.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: BEGINNER
 * @Problem: 2896 - Enjoy the Offer
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2896
 * @Timelimit: 2 sec
 * @Status: Accepted
 * @Memory:
 * @Submission: 2/7/19, 1:18:28 AM
 * @Runtime: 0.104s
 * @Solution:
 * @Note:
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P2896_Enjoy_the_Offer {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] st = br.readLine().split(" ");
            int N = Integer.parseInt(st[0]);
            int K = Integer.parseInt(st[1]);
            int A = N / K;

            int answer = A + (N - (A * K));
            bw.append(answer + "\n");
        }
        bw.flush();
    }

}
