/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2004 Enisvaldo's Hunger
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2004
 * @Timelimit: 1 sec
 * @Status: Accepted 01/12/2015 - 08:01:35 Runtime: 0.060s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

public class P2004_Enisvaldos_Hunger {

    static TreeMap<Integer, Integer> food;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            food = new TreeMap<Integer, Integer>();
            for (int j = 0; j < n; j++) {
                String[] st = br.readLine().split(" ");
                int type = Integer.parseInt(st[0]);
                int consume = Integer.parseInt(st[1]);
                Integer get = food.get(type);
                if (get == null) {
                    food.put(type, consume);
                } else if ((get.compareTo(10) >= 0 && get.compareTo(100) <= 0)) {
                    if ((consume >= 10 && consume <= 100) && get.compareTo(consume) < 0) {
                        food.put(type, consume);
                    }
                } else if (consume >= 10 && consume <= 100) {
                    food.put(type, consume);
                } else if (get.compareTo(consume) < 0) {
                    food.put(type, consume);
                }
            }
            int amount = 0;
            Collection c = food.values();
            Iterator itr = c.iterator();
            while (itr.hasNext()) {
                amount += (Integer) itr.next();
            }
            out.write((amount + "\n").getBytes());
        }
        out.flush();
    }

}
