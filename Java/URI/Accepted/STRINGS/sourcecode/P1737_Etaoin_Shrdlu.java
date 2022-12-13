package URI.Accepted.STRINGS.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: STRING
 * @Problem: 1737 - Etaoin Shrdlu
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1737
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory:
 * @Submission: 3/26/18, 12:58:52 PM
 * @Runtime: 0.136s
 * @Solution:
 * @Note:
 */

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.TreeMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Comparator;

class P1737_Etaoin_Shrdlu {

    TreeMap<String, Integer> map = new TreeMap<>();

    public P1737_Etaoin_Shrdlu() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        DecimalFormat df = new DecimalFormat("0.000000");
        df.setRoundingMode(RoundingMode.HALF_EVEN);
        String input = br.readLine();
        while (true) {
            int n = Integer.parseInt(input);
            String letter = "";
            while (n-- > 0) {
                letter += br.readLine();
            }
            n = letter.length() - 1;
            String pair;
            for (int i = 0; i < n; i++) {
                pair = letter.substring(i, i + 2);
                if (map.get(pair) != null) continue;
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (pair.equals(letter.substring(j, j + 2))) {
                        count++;
                    }
                }
                map.put(pair, count);
            }

            int count = 0;
            for (Map.Entry<String, Integer> entry : entriesSortedByValues(map)) {
                pair = entry.getKey();
                int frequency = entry.getValue();
                bw.append(pair + " " + frequency + " " + df.format((double) frequency / n) + "\n");
                if (++count == 5) {
                    break;
                }
            }
            bw.newLine();
            if ((input = br.readLine()).equals("0")) {
                break;
            }
            map.clear();
        }
        bw.flush();
    }

    static <K, V extends Comparable<? super V>>
    SortedSet<Map.Entry<K, V>> entriesSortedByValues(Map<K, V> map) {
        SortedSet<Map.Entry<K, V>> sortedEntries = new TreeSet<Map.Entry<K, V>>(
                new Comparator<Map.Entry<K, V>>() {
                    @Override
                    public int compare(Map.Entry<K, V> e1, Map.Entry<K, V> e2) {
                        int res = e2.getValue().compareTo(e1.getValue());
                        return res != 0 ? res : 1;
                    }
                }
        );
        sortedEntries.addAll(map.entrySet());
        return sortedEntries;
    }

}
