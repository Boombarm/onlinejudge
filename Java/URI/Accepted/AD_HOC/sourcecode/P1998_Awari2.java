/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1998 Awari 2.0
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1998
 * @Timelimit: 1 sec
 * @Status: Accepted 28/11/2015 - 07:34:49 Runtime:0.136s
 * @Solution: Simulation
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.StringTokenizer;

public class P1998_Awari2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        int n;
        while ((n = Integer.parseInt(br.readLine())) != -1) {
            int[] box = new int[n];
            StringTokenizer stk = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                box[i] = Integer.parseInt(stk.nextToken());
            }
            out.write(((win(box) ? "S" : "N") + "\n").getBytes());
        }
        out.flush();
    }

    static boolean win(int[] box) {
        int last = box.length;
        for (int i = last - 1; i >= 0; i--) {
            if (box[i] > 0 && box[i] % (i + 1) == 0) {
                last = i + 1;
                break;
            }
        }

        boolean runAgian;
        do {
            runAgian = false;
            for (int i = 1; i < last; i++) {
                if (box[i] > 0 && box[i] % (i + 1) == 0) {
                    runAgian = true;
                    box[i] = 0;
                    for (int j = i - 1; j > 0; j--) {
                        box[j]++;
                    }
                    break;
                }
            }
        } while (runAgian);
        for (int i = 1; i < box.length; i++) {
            if (box[i] != 0) {
                return false;
            }
        }
        return true;
    }

}
