/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1424 Easy Problem from Rujia Liu?
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1424
 * @Timelimit: 2 sec
 * @Status: Accepted
 * @Submission: 3/17/16, 12:44:33 PM
 * @Runtime: 0.304
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
import java.util.HashMap;
import java.util.StringTokenizer;

public class P1424_Easy_Problem_from_Rujia_Liu_V1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        String input;
        while ((input = br.readLine()) != null) {
            String[] st = input.split(" ");
            int n = Integer.parseInt(st[0]);
            int m = Integer.parseInt(st[1]);
            StringTokenizer stk = new StringTokenizer(br.readLine());
            HashMap<Integer, ArrayList> map = new HashMap<Integer, ArrayList>();
            int index = 1;
            while (stk.hasMoreTokens()) {
                int key = Integer.parseInt(stk.nextToken());
                ArrayList<Integer> temp = map.get(key);
                if (temp == null) {
                    temp = new ArrayList<Integer>();
                }
                temp.add(index);
                map.put(key, temp);
                index++;
            }
            while (m-- > 0) {
                st = br.readLine().split(" ");
                int k = Integer.parseInt(st[0]);
                int v = Integer.parseInt(st[1]);
                ArrayList<Integer> num = map.get(v);
                out.write(((num == null ? "0" : (num.size() < k ? "0" : num.get(k - 1))) + "\n").getBytes());
            }
        }
        out.flush();
    }

}