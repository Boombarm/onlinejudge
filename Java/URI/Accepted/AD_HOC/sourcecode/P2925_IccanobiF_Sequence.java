/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: AD-HOC
 * @Problem: 2925 - IccanobiF Sequence
 * @Link: https://www.urionlinejudge.com.br/judge/en/runs/code/13474417
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/31/19, 8:09:18 PM
 * @Runtime: 0.064s
 * @Solution:
 * @Note:
 */
package URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P2925_IccanobiF_Sequence {


    private static int size = 62;
    private static long[] fib = new long[size + 1];

    static {
        fib[0] = 0;
        fib[1] = 1;
        fib[2] = 1;

        for (int i = 3; i <= size; i++) {
            fib[i] = reverse(fib[i - 1]) + reverse(fib[i - 2]);
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String in;
        while ((in = br.readLine()) != null) {
            int n = Integer.parseInt(in);
            if (n == 0) bw.append("0\n");
            else bw.append(fib[n + 1] + "\n");
        }
        bw.flush();
    }

    static Long reverse(long n) {
        long reverse = 0;
        while (n != 0) {
            reverse = reverse * 10;
            reverse = reverse + n % 10;
            n = n / 10;
        }
        return reverse;
    }


}