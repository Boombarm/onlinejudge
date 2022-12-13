package URI.Accepted.AD_HOC.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: AD-HOC
 * @Problem: 2590 - Seven
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2590
 * @Level: 2
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 10/19/18, 1:06:51 AM
 * @Runtime: 0.596s
 * @Solution: ดูลำดับการเกิด ของตัวท้ายเลขหลังสุด หลังยกกำลัง
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P2590_Seven {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] answer = new int[]{1, 7, 9, 3};
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            int x = Integer.parseInt(br.readLine());
            bw.append(answer[x % 4] + "\n");
        }
        bw.flush();
    }
}
