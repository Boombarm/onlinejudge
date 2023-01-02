/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Problem: 1643 - Convert Kilometers to Miles
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1643
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/6/19, 12:39:33 PM
 * @Runtime: 0.088s
 * @Solution: fibonacci + greedy
 * @Note:
 */

package URI.Accepted.PARADIGMS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class P1643_Convert_Kilometers_to_Miles {

    static int size = 21;
    static int[] fibonaci = new int[size];

    static {
        fibonaci[0] = 1;
        fibonaci[1] = 1;
        for (int i = 2; i <= size - 1; i++) {
            fibonaci[i] = fibonaci[i - 2] + fibonaci[i - 1];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            bw.append(calculate(n) + "\n");
        }
        bw.flush();
    }

    static int calculate(int n) {
        int result = 0;

        for (int i = size - 1; i >= 2; i--) {
            if (n - fibonaci[i] >= 0) {
                n -= fibonaci[i];
                result += fibonaci[i - 1];
                if (n == 0) break;
            }
        }
        return result;
    }

}
