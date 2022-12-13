package URI.Accepted.MATHEMATICS.sourcecode;


/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: MATHEMATICS
 * @Problem: 2596 - Xenlonguinho
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2596
 * @Timelimit: 2 sec
 * @Status: Accepted
 * @Memory:
 * @Submission: 1/1/19, 11:50:25 PM
 * @Runtime: 0.056s
 * @Solution: count number is Divisors even
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P2596_Xenlonguinho {

    static int[] count = new int[1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= 1000; i++) {
            count[i] = countDivisors(i) == 1 ? count[i - 1] + 1 : count[i - 1];
        }
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            bw.append(count[x] + "\n");
        }
        bw.flush();
    }

    static int countDivisors(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n) + 1; i++) {
            if (n % i == 0)
                count += (n / i == i) ? 1 : 2;
        }

        if (count % 2 == 0) return 1;//even
        else return 0;//odd
    }

}
