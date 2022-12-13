package AIZU.Accepted.ITP1;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: AIZU ONLINE JUDGE
 * @Categories: Character
 * @Problem: ITP1_8_D - Ring
 * @Link: http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_8_D
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory: 24520 KB
 * @Submission: 2018-03-15 15:28
 * @Runtime: 00:05 s
 * @Solution:
 * @Note: circular string matching
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class ITP1_8_D_Ring {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] input = br.readLine().toCharArray();
        char[] st = br.readLine().toCharArray();
        int size = input.length;
        int size2 = st.length;
        boolean answer = false;
        for (int i = 0; i < size; i++) {
            boolean chk = true;
            int j = 0;
            int k = i;
            while (j < size2 && k < size) {
                if (st[j] != input[k]) {
                    chk = false;
                    break;
                }
                if (++k == size) k %= size;
                j++;
            }
            if (chk) {
                answer = true;
                break;
            }
        }

        bw.append(answer ? "Yes\n" : "No\n");
        bw.flush();
    }


}
