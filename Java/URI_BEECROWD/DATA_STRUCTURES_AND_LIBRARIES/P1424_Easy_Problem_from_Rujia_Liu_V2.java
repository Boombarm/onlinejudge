/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1424 Easy Problem from Rujia Liu?
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1424
 * @Timelimit: 2 sec
 * @Status: Accepted
 * @Submission: 3/17/16, 12:46:14 PM
 * @Runtime: 0.292s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P1424_Easy_Problem_from_Rujia_Liu_V2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        String input;
        while ((input = br.readLine()) != null) {
            String[] st = input.split(" ");
            int n = Integer.parseInt(st[0]);
            int m = Integer.parseInt(st[1]);
            StringTokenizer stk = new StringTokenizer(br.readLine());
            ArrayList<Integer>[] map = new ArrayList[1000000];
            int index = 1;
            while (stk.hasMoreTokens()) {
                int key = Integer.parseInt(stk.nextToken()) - 1;
                if (map[key] == null) {
                    map[key] = new ArrayList<Integer>();
                }
                map[key].add(index);
                index++;
            }
            while (m-- > 0) {
                st = br.readLine().split(" ");
                int k = Integer.parseInt(st[0]);
                int v = Integer.parseInt(st[1]) - 1;
                int answer = 0;
                if (map[v] != null && map[v].size() >= k) {
                    answer = map[v].get(k - 1);
                }
                out.write((answer + "\n").getBytes());
            }
        }
        out.flush();
    }

}
