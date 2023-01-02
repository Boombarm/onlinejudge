/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1973
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1973
 * @Timelimit: 1 sec
 * @Status: Accepted 01/11/2015 - 15:23:53 Runtime:0.400s
 * @Solution: simulation
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1973_Star_Trek {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine());
        long[] fram = new long[n];
        for (int i = 0; i < n; i++) {
            fram[i] = Integer.parseInt(stk.nextToken());
        }
        simulate(fram);
    }

    static void simulate(long[] farm) {
        long sheep = 0;
        int attacked = 0;
        int i = 0;
        int next = 0;

        boolean[] farmAttacked = new boolean[farm.length];
        while (i < farm.length && i >= 0) {
            if ((farm[i]) % 2 == 0) {
                next = i - 1;
            } else {
                next = i + 1;
            }
            if (farm[i] > 0) {
                farm[i]--;
                farmAttacked[i] = true;
            }
            i = next;
        }

        for (int j = 0; j < farm.length; j++) {
            if (farmAttacked[j]) {
                attacked++;
            }
            sheep += farm[j];
        }
        System.out.println(attacked + " " + sheep);
    }

}
