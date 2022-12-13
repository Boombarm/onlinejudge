package URI.Accepted.BEGINNER.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: BEGINNER
 * @Problem: 2770 - Board Size
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2770
 * @Timelimit: 2 sec
 * @Status: Accepted
 * @Memory:
 * @Submission: 12/31/18, 11:37:14 PM
 * @Runtime: 0.396s
 * @Solution:
 * @Note:
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2770_Board_Size {

    static int x1, y1, x2, y2, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String in;
        while ((in = br.readLine()) != null) {
            String[] st = in.split(" ");
            x1 = Integer.parseInt(st[0]);
            y1 = Integer.parseInt(st[1]);
            m = Integer.parseInt(st[2]);
            for (int i = 0; i < m; i++) {
                st = br.readLine().split(" ");
                x2 = Integer.parseInt(st[0]);
                y2 = Integer.parseInt(st[1]);
                if ((x2 <= x1 && y2 <= y1) || (y2 <= x1 && x2 <= y1)) {
                    bw.append("Sim\n");
                } else {
                    bw.append("Nao\n");
                }
            }
        }
        bw.flush();
    }


}
