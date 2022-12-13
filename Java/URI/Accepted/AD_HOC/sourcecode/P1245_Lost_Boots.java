/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1245 Lost Boots
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1245
 * @Timelimit: 1 sec
 * @Status: Accepted 25/10/2015 - 16:45:40 Runtime:0.128s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class P1245_Lost_Boots {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while ((line = br.readLine()) != null) {
            int n = Integer.parseInt(line);
            int pairs = 0;

            Map<String, Integer> left = new TreeMap<String, Integer>();
            Map<String, Integer> right = new TreeMap<String, Integer>();
            for (int i = 0; i < n; i++) {
                String[] st = br.readLine().split(" ");
                if (st[1].endsWith("D")) {
                    left.put(st[0], left.get(st[0]) == null ? 1 : left.get(st[0]) + 1);
                } else {
                    right.put(st[0], right.get(st[0]) == null ? 1 : right.get(st[0]) + 1);
                }
            }

            if (left.size() == 0 || right.size() == 0) {
                System.out.println("0");
                continue;
            }

            for (Map.Entry<String, Integer> boot : left.entrySet()) {
                String size = boot.getKey();
                Integer amount = boot.getValue();
                if (right.get(size) != null) {
                    pairs += left.get(size) <= right.get(size) ? left.get(size) : right.get(size);
                }
            }
            System.out.println(pairs);
        }
    }

}
