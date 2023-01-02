/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1495 Football
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1495
 * @Timelimit: 2 sec
 * @Status:  Accepted
 * @Submission: 4/22/17, 1:56:57 AM
 * @Runtime: 0.288s
 * @Solution: Greedy + sort
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class P1495_Football {

    static int N, G, t1, t2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        String input;
        while ((input = br.readLine()) != null) {
            String[] st = input.split(" ");
            N = Integer.parseInt(st[0]);
            G = Integer.parseInt(st[1]);
            int maximumPoint = 0;
            boolean canBuy = G > 0;
            ArrayList<Integer> Match = new ArrayList<Integer>();
            while (N-- > 0) {
                st = br.readLine().split(" ");
                t1 = Integer.parseInt(st[0]);
                t2 = Integer.parseInt(st[1]);
                if (t1 > t2) {
                    maximumPoint += 3;
                } else if (canBuy) {
                    if (t1 == t2) {
                        G--;
                        maximumPoint += 3;
                        if (G == 0) {
                            canBuy = false;
                        }
                    } else {
                        Match.add(t2 - t1);
                    }
                } else if (t1 == t2) {
                    maximumPoint++;
                }
            }
            Collections.sort(Match);
            int size = Match.size();
            for (int j = 0; j < size; j++) {
                int now = Match.get(j);
                if (G >= now + 1) {
                    G -= now + 1;
                    maximumPoint += 3;
                } else if (G >= now) {
                    G -= now;
                    maximumPoint++;
                }
            }
            out.write((maximumPoint + "\n").getBytes());
        }
        out.flush();
    }

}
