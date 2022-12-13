package URI.Accepted.PARADIGMS.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: PARADIGMS
 * @Problem: 1033 - How Many Calls?
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1033
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/2/19, 8:25:05 PM
 * @Runtime: 0.448s
 * @Solution:  pattern คือ ตัวก่อนหน้า2ตัว + ตัวก่อนหน้า1ตัว + 1
 * @Note:
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class P1033_How_Many_Calls {

    private static long N;
    private static int B;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String in;
        int t = 0;
        while (!(in = br.readLine()).equals("0 0")) {
            String[] st = in.split(" ");
            N = Long.parseLong(st[0]);
            B = Integer.parseInt(st[1]);
            Map<Long, Integer> pattern = new HashMap<>();
            pattern.put(0L, 1);
            pattern.put(1L, 1);
            int a = 1;
            int b = 1;
            long c = 2;
            for (long i = 2; i <= N + 1; i++) {
                int tmp = b;
                b = (a + b + 1) % B;
                a = tmp;
                if (a == 1 && b == 1) break;

                pattern.put(c++, b);
            }
            bw.append("Case " + (++t) + ": " + N + " " + B + " " + (N >= 2 ? pattern.get(N % (c - 1)) : 1) + "\n");
        }
        bw.flush();
    }


}
