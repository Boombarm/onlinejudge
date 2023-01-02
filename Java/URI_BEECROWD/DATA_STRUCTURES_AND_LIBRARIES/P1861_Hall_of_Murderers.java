/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: DATA STRUCTURES AND LIBRARIES
 * @Problem: 1861 - Hall of Murderers 
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1861
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/19/17, 4:08:48 PM 
 * @Runtime: 0.632s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class P1861_Hall_of_Murderers {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        String input;
        TreeMap<String, Integer> murderers = new TreeMap<String, Integer>();
        HashMap<String, Integer> dead = new HashMap<String, Integer>();
        while ((input = br.readLine()) != null) {
            String[] st = input.split(" ");
            String killer = st[0];
            String victim = st[1];
            Integer m = murderers.get(killer);
            if (m == null) {
                murderers.put(killer, 1);
            } else {
                murderers.put(killer, m + 1);
            }
            dead.put(victim, -1);
        }
        bw.append("HALL OF MURDERERS\n");
        for (Map.Entry<String, Integer> entry : murderers.entrySet()) {
            String murdererName = entry.getKey();
            if (dead.get(murdererName) == null) {
                Integer killed = entry.getValue();
                bw.append(murdererName + " " + "" + killed + "\n");
            }
        }
        bw.flush();
    }

}
