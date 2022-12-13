/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: Beginner 
 * @Problem: 2542 - Iu-Di-Oh!
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2542
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 5/9/17, 6:19:06 PM 
 * @Runtime: 0.104s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2542_Iu_Di_Oh {

    static int N, M, L, CM, CL, A;
    static int[][] deckM, deckL;
    static String[] in;

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        String input;
        while ((input = br.readLine()) != null) {
            N = Integer.parseInt(input);
            in = br.readLine().split(" ");
            M = Integer.parseInt(in[0]);
            L = Integer.parseInt(in[1]);
            deckM = new int[M][N];
            deckL = new int[L][N];
            for (int i = 0; i < M; i++) {
                in = br.readLine().split(" ");
                for (int j = 0; j < N; j++) {
                    deckM[i][j] = Integer.parseInt(in[j]);
                }
            }

            for (int i = 0; i < L; i++) {
                in = br.readLine().split(" ");
                for (int j = 0; j < N; j++) {
                    deckL[i][j] = Integer.parseInt(in[j]);
                }
            }
            in = br.readLine().split(" ");
            CM = Integer.parseInt(in[0]) - 1;
            CL = Integer.parseInt(in[1]) - 1;
            A = Integer.parseInt(br.readLine()) - 1;
            int marcos = deckM[CM][A];
            int leonardo = deckL[CL][A];
            if (marcos == leonardo) {
                bw.append("Empate\n");
            } else if (marcos > leonardo) {
                bw.append("Marcos\n");
            } else {
                bw.append("Leonardo\n");
            }
        }
        bw.flush();
    }

}
