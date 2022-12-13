/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: AD-HOC
 * @Problem: 1271 - Where Are My Genes
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1271
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 5/3/17, 8:54:19 PM
 * @Runtime: 0.748s
 * @Solution: swap value
 * @Note:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1271_Where_Are_My_Genes {

    static int N, output;
    static int[] genome;
    static int[][] swap;

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        String input;
        int t = 1;
        while (!(input = br.readLine()).equals("0")) {
            bw.append("Genome " + (t++) + "\n");
            N = Integer.parseInt(input);
            genome = new int[N];
            for (int i = 1, j = 0; i <= N; i++) {
                genome[j++] = i;
            }
            int nswap = Integer.parseInt(br.readLine());
            swap = new int[nswap][2];
            int q = 0, i, j;
            while (q < nswap) {
                String[] in = br.readLine().split(" ");
                i = Integer.parseInt(in[0]);
                j = Integer.parseInt(in[1]);
                swap[q][0] = i;
                swap[q][1] = j;
                q++;
            }
            int round = nswap - 1;
            while (nswap-- > 0) {
                i = swap[round][0];
                j = swap[round][1];
                while (i < j) {
                    swap(i++, j--);
                }
                round--;
            }
            output = Integer.parseInt(br.readLine());
            while (output > 0) {
                i = Integer.parseInt(br.readLine());
                bw.append(genome[i - 1] + "\n");
                --output;
            }
        }
        bw.flush();
    }

    static void swap(int i, int j) {
        int tmp = genome[i - 1];
        genome[i - 1] = genome[j - 1];
        genome[j - 1] = tmp;
    }

}
