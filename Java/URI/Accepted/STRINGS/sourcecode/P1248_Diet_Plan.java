/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1248 Diet Plan
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1248
 * @Timelimit: 1 sec
 * @Status: Accepted 27/12/2015 - 19:13:17 Runtime:0.116s
 * @Solution:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class P1248_Diet_Plan {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            Set<Character> set = new TreeSet();
            String foodPlan = br.readLine();
            String breakfast = br.readLine();
            String lunch = br.readLine();
            for (int i = 0; i < foodPlan.length(); i++) {
                set.add(foodPlan.charAt(i));
            }

            boolean cheater = false;
            for (int i = 0; i < breakfast.length(); i++) {
                if (!set.remove(breakfast.charAt(i))) {
                    cheater = true;
                    break;
                }
            }

            if (!cheater) {
                for (int i = 0; i < lunch.length(); i++) {
                    if (!set.remove(lunch.charAt(i))) {
                        cheater = true;
                        break;
                    }
                }
            }

            if (cheater) {
                bw.append("CHEATER");
            } else {
                Iterator<Character> s = set.iterator();
                while (s.hasNext()) {
                    bw.append((char) s.next());
                }
            }
            bw.newLine();
        }
        bw.flush();
    }
}
