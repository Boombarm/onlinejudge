/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1553 Frequent Asked Questions
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1553
 * @Timelimit: 1 sec
 * @Status: Accepted 28/11/2015 - 11:26:18 Runtime:0.092s
 * @Solution: Mapping & counting
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class P1553_Frequent_Asked_Questions {

    static TreeMap<Integer, Integer> frequencies;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        String input;
        while (!(input = br.readLine()).equals("0 0")) {
            frequencies = new TreeMap<Integer, Integer>();
            int counting = 0;
            String[] st = input.split(" ");
            int n = Integer.parseInt(st[0]);
            int k = Integer.parseInt(st[1]);
            StringTokenizer stk = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                int now = Integer.parseInt(stk.nextToken());
                Integer number = frequencies.get(now);
                if (number == null) {
                    frequencies.put(now, 1);
                } else {
                    frequencies.put(now, number + 1);
                }
            }
            for (Map.Entry<Integer, Integer> entrySet : frequencies.entrySet()) {
                Integer key = entrySet.getKey();
                Integer value = entrySet.getValue();
                if (value >= k) {
                    counting++;
                }
            }
            out.write((counting + "\n").getBytes());
        }
        out.flush();
    }

}
