/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1171 Number Frequence
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1171
 * @Status: Accepted 18/10/2015 - 10:24:31 Runtime:0.072s
 * @Solution: Mapping and Counting Value Structure by TreeMap *** TreeMap Sort by Key
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.TreeMap;

public class P1171_Number_Frequence {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> numberFrequence = new TreeMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(br.readLine());
            if (numberFrequence.get(number) == null) {
                numberFrequence.put(number, 1);
            } else {
                numberFrequence.put(number, numberFrequence.get(number) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> e : numberFrequence.entrySet()) {
            bw.write(e.getKey() + " aparece " + e.getValue() + " vez(es)\n");
            bw.flush();
        }
    }

}
