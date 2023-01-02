/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: Beginner
 * @Problem: 2534 - General Exam
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2534
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 5/9/17, 2:41:07 PM 
 * @Runtime: 0.048s
 * @Solution: shellSort
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2534_General_Exam {

    static int N, Q;
    static String[] in;
    static int[] ranked;

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        String input;
        while ((input = br.readLine()) != null) {
            in = input.split(" ");
            N = Integer.parseInt(in[0]);
            Q = Integer.parseInt(in[1]);
            ranked = new int[N];
            for (int i = 0; i < N; i++) {
                ranked[i] = Integer.parseInt(br.readLine());
            }
            shellsort(ranked);
            while (Q-- > 0) {
                int i = Integer.parseInt(br.readLine()) - 1;
                bw.append(ranked[i] + "\n");
            }
        }
        bw.flush();
    }

    private static void shellsort(int[] a) {
        for (int gap = a.length / 2; gap > 0;
                gap = gap == 2 ? 1 : (int) (gap / 2.2)) {
            for (int i = gap; i < a.length; i++) {
                int tmp = a[i];
                int j = i;
                for (; j >= gap && tmp > a[j - gap]; j -= gap) {
                    a[j] = a[j - gap];
                }
                a[j] = tmp;
            }
        }
    }

}
