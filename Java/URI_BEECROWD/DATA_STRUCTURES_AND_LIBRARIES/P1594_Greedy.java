/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1594 Greedy
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1594
 * @Timelimit: 1 sec
 * @Status: Accepted 19/12/2015 - 19:00:34 Runtime:1.232s
 * @Solution:
 */
package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.LinkedList;

public class P1594_Greedy {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        int t = Integer.parseInt(br.readLine());
        int i = 0;
        do {
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int k = Integer.parseInt(input[1]);
            int s = Integer.parseInt(input[2]);
            long[] number = new long[n];
            number[0] = s;
            for (int j = 1; j < n; ++j) {
                number[j] = ((1L * number[j - 1] * 1103515245 + 12345) % (2147483648L));
            }

            LinkedList<Integer> deque = new LinkedList<Integer>();
            long sum = 0;

            int x = 0;
            for (; x < k; ++x) {
                while (!deque.isEmpty() && number[x] >= number[deque.getLast()]) {
                    deque.removeLast();
                }
                deque.addLast(x);
            }

            for (; x < number.length; ++x) {
                sum += number[deque.getFirst()];

                while (!deque.isEmpty() && deque.getFirst() <= x - k) {
                    deque.removeFirst();
                }

                while (!deque.isEmpty() && number[x] >= number[deque.getLast()]) {
                    deque.removeLast();
                }

                deque.addLast(x);
            }
            sum += number[deque.getFirst()];

            out.write((sum + "\n").getBytes());
        } while (++i < t);
        out.flush();
    }

}
