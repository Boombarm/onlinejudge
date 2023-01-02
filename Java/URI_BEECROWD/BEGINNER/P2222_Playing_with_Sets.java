/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online judge
 * @Problem: 2222 Playing with Sets
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2222
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 10/23/16, 8:18:06 AM
 * @Runtime: 1.424s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class P2222_Playing_with_Sets {

    static BufferedReader br;
    static OutputStream out;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new BufferedOutputStream(System.out);
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            int setAmount = Integer.parseInt(br.readLine());
            ArrayList<Set<Integer>> allSet = new ArrayList<Set<Integer>>();
            String[] st;
            for (int i = 0; i < setAmount; i++) {
                Set<Integer> b = new TreeSet<Integer>();
                st = br.readLine().split(" ");
                int amount = Integer.parseInt(st[0]);
                for (int j = 1; j <= amount; j++) {
                    b.add(Integer.parseInt(st[j]));
                }
                allSet.add(b);
            }
            int operationAmount = Integer.parseInt(br.readLine());
            for (int i = 0; i < operationAmount; i++) {
                st = br.readLine().split(" ");
                int set1 = Integer.parseInt(st[1]) - 1;
                int set2 = Integer.parseInt(st[2]) - 1;
                Set<Integer> result = new TreeSet<Integer>(allSet.get(set1));//copy set
                if (st[0].equals("1")) {
                    result.retainAll(allSet.get(set2));//intersection 
                } else {
                    result.addAll(allSet.get(set2));//union 
                }
                out.write((result.size() + "\n").getBytes());
            }
        }
        out.flush();
    }

}
