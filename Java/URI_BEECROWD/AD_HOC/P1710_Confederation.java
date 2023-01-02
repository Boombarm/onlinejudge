/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: AD-HOC
 * @Problem: 1710 - Confederation
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1710
 * @Timelimit: 1 sec
 * @Status: Accepted 
 * @Submission: 2/9/17, 8:22:56 PM
 * @Runtime: 0.140s
 * @Solution: find region of plane with key
 * @Note:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class P1710_Confederation {

    static class Plane {

        int a, b, c, d;

        public Plane(int a, int b, int c, int d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }

    }

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        String[] st = br.readLine().split(" ");
        int m = Integer.parseInt(st[0]);
        int n = Integer.parseInt(st[1]);
        Plane[] plane = new Plane[m];
        HashMap<Long, Integer> region = new HashMap<Long, Integer>();
        int max = 0;
        for (int i = 0; i < m; i++) {
            st = br.readLine().split(" ");
            int a = Integer.parseInt(st[0]);
            int b = Integer.parseInt(st[1]);
            int c = Integer.parseInt(st[2]);
            int d = Integer.parseInt(st[3]);
            plane[i] = new Plane(a, b, c, d);
        }
        for (int i = 0; i < n; i++) {
            st = br.readLine().split(" ");
            int x = Integer.parseInt(st[0]);
            int y = Integer.parseInt(st[1]);
            int z = Integer.parseInt(st[2]);
            long hashKey = 0;
            for (Plane p : plane) {
                int equation = (p.a * x) + (p.b * y) + (p.c * z);
                hashKey = (3 * hashKey + (equation > p.d ? '1' : '0'));
            }
            Integer r = region.get(hashKey);
            if (r == null) {
                region.put(hashKey, 1);
            } else {
                region.put(hashKey, ++r);
            }
        }

        for (Map.Entry<Long, Integer> entry : region.entrySet()) {
            Integer value = entry.getValue();
            if (max < value) {
                max = value;
            }
        }
        System.out.println(max);
    }

}
