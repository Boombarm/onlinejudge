/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1800 Where Are My Keys
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1800
 * @Status: Accepted 19/10/2015 - 15:16:02 Runtime:0.048s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class P1800_Where_Are_My_Keys {
                    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st1 = br.readLine().split(" ");
        int n = Integer.parseInt(st1[0]);
        int keyAmount = Integer.parseInt(st1[1]);
        String[] st2 = br.readLine().split(" ");
        Map<String, String> keys = new TreeMap<String, String>();
        for (int i = 0; i < st2.length; i++) {
            keys.put(st2[i], st2[i]);
        }
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (keys.get(s) != null) {
                System.out.println("0");
            } else {
                keys.put(s, s);
                System.out.println("1");
            }
        }
    }

}
