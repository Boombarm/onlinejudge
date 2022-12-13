/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1260 Hardwood Species
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1260
 * @Status: Accepted 22/10/2015 - 19:52:19 Runtime:0.724s
 * @Solution: Counting and Calculate Average
 */
package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Map;
import java.util.TreeMap;

public class P1260_Hardwood_Species {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        DecimalFormat df = new DecimalFormat("0.0000");
        df.setRoundingMode(RoundingMode.HALF_EVEN);
        int n = Integer.parseInt(br.readLine());
        br.readLine();
        for (int i = 0; i < n; i++) {
            String specie = "";
            int countSpecie = 0;
            Map<String, Integer> species = new TreeMap();
            while ((specie = br.readLine()) != null) {
                if (specie.isEmpty()) {
                    break;
                }
                species.put(specie, species.get(specie) == null ? 1 : species.get(specie) + 1);
                countSpecie++;
            }

            for (Map.Entry<String, Integer> now : species.entrySet()) {
                String key = now.getKey();
                Integer value = now.getValue();
                bw.append(key + " " + df.format((double) (value * 100.0 / countSpecie)));
                bw.newLine();
                bw.flush();
            }
            if (i < n - 1) {
                bw.newLine();
                bw.flush();
            }
        }
    }
}
