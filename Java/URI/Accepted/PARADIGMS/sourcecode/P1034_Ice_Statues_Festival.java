package URI.Accepted.PARADIGMS.sourcecode;


/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: PARADIGMS
 * @Problem: 1034 - Ice Statues Festival
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1034
 * @Timelimit: 3 sec
 * @Status: Accepted
 * @Submission: 2/26/19, 11:03:08 PM
 * @Runtime: 1.020s
 * @Solution: minimumBlockBottomUp
 * @Note:  https://www.youtube.com/watch?v=Y0ZqKpToTic&feature=youtu.be
 */

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1034_Ice_Statues_Festival {


    static int N, M;
    static int[] block;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String[] st = br.readLine().split(" ");
            N = Integer.parseInt(st[0]);
            M = Integer.parseInt(st[1]);
            st = br.readLine().split(" ");
            block = new int[N];
            for (int j = 0; j < N; j++) {
                block[j] = Integer.parseInt(st[j]);
            }
            bw.append(minimumBlockBottomUp(M, block) + "\n");
        }
        bw.flush();
    }

    static int minimumBlockBottomUp(int total, int[] block) {
        int T[] = new int[total + 1];
        int R[] = new int[total + 1];
        T[0] = 0;
        for (int i = 1; i <= total; i++) {
            T[i] = Integer.MAX_VALUE - 1;
            R[i] = -1;
        }
        for (int j = 0; j < block.length; j++) {
            for (int i = 1; i <= total; i++) {
                if (i >= block[j]) {
                    if (T[i - block[j]] + 1 < T[i]) {
                        T[i] = 1 + T[i - block[j]];
                        R[i] = j;
                    }
                }
            }
        }
        return T[total];
    }

}


