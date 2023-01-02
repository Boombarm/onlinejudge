/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1945 Simulator
 * @Link: https://www.urionlinejudge.com.br/judge/problems/view/1945/rate:1945/rating:4
 * @Status: Accepted 21/10/2015 - 00:55:11 Runtime:0.160s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class P1945_Simulator {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        Map<String, Integer> variables = new TreeMap<String, Integer>();
        String instruction = "";
        String lastKey = "";
        while ((instruction = br.readLine()) != null) {
            String[] st = instruction.split(":=");

            int sum = 0;
            String[] s = st[1].split("\\+");
            for (int i = 0; i < s.length; i++) {
                s[i] = s[i].trim();
                sum += variables.get(s[i]) == null ? (isNumeric(s[i]) ? Integer.parseInt(s[i]) : 0) : variables.get(s[i]);
            }
            st[0] = st[0].trim();
            
            variables.put(st[0], sum);
            lastKey = st[0];
        }
        System.out.println(variables.get(lastKey));
    }

    static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

}
