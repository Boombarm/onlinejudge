/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: AD-HOC
 * @Problem: 2219 - Passing By The PokeStops
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2219
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 5/4/17, 2:11:51 PM
 * @Runtime: 0.220s
 * @Solution: sort and find max distance
 * @Note:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class P2219_Passing_By_The_PokeStops {

    static SortedSet<Integer> pokeStops, distance;

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        int t = Integer.parseInt(br.readLine());
        int n;
        int m;
        while (t-- > 0) {
            String[] st = br.readLine().split(" ");
            n = Integer.parseInt(st[0]);
            m = Integer.parseInt(st[1]);
            pokeStops = new TreeSet<Integer>();
            st = br.readLine().split(" ");
            int shop = 0;
            for (int i = 0; i < m; i++) {
                shop = Integer.parseInt(st[i]);
                if (shop < n) {
                    pokeStops.add(shop);
                }
            }
            if (pokeStops.isEmpty()) {
                bw.append(shop + "\n");
                continue;
            }
            pokeStops.add(n);
            distance = new TreeSet<Integer>();
            Iterator iterator = pokeStops.iterator();
            int last = (Integer) iterator.next();
            distance.add(last - 0);
            for (; iterator.hasNext(); ) {
                int now = (Integer) iterator.next();
                int d = now - last;
                distance.add(d);
                last = now;
            }
            bw.append(distance.last() + "\n");
        }
        bw.flush();
    }
}
