/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: DATA STRUCTURES AND LIBRARIES
 * @Problem: 2022 - Christmas Gifts
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2022
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 3/19/17, 7:33:39 PM
 * @Runtime: 0.044s
 * @Solution: SortedMap by Level 
 * @Note:
 */
package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class P2022_Christmas_Gifts {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        DecimalFormat formatter = new DecimalFormat(".00");
        Map<String, Double>[] prefer;
        String input;
        while ((input = br.readLine()) != null) {
            String[] st = input.split(" ");
            String name = st[0];
            int n = Integer.parseInt(st[1]);
            prefer = new TreeMap[10];
            for (int i = 0; i < n; i++) {
                String objectName = br.readLine();
                st = br.readLine().split(" ");
                double cost = Double.parseDouble(st[0]);
                int preferLevel = (Integer.parseInt(st[1]) - 1);
                if (prefer[preferLevel] == null) {
                    prefer[preferLevel] = new TreeMap<String, Double>();
                }
                prefer[preferLevel].put(objectName, cost);
            }
            bw.append("Lista de " + name + "\n");
            for (int i = 9; i >= 0; i--) {
                if (prefer[i] != null) {
                    for (Map.Entry<String, Double> entry : entriesSortedByValues(prefer[i])) {
                        String objectName = entry.getKey();
                        double cost = entry.getValue();
                        bw.append(objectName + " - R$" + formatter.format(cost) + "\n");
                    }
                }
            }
            bw.newLine();
        }
        bw.flush();
    }

    static <K, V extends Comparable<? super V>>
            SortedSet<Map.Entry<K, V>> entriesSortedByValues(Map<K, V> map) {
        SortedSet<Map.Entry<K, V>> sortedEntries = new TreeSet<Map.Entry<K, V>>(
                new Comparator<Map.Entry<K, V>>() {
            @Override
            public int compare(Map.Entry<K, V> e1, Map.Entry<K, V> e2) {
                int res2 = e1.getValue().compareTo(e2.getValue());
                return res2 != 0 ? res2 : 1;
            }
        }
        );
        sortedEntries.addAll(map.entrySet());
        return sortedEntries;
    }
}
