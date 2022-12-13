/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1218 Getline Three - Shoes
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1218
 * @Timelimit: 1 sec
 * @Status: Accepted 25/10/2015 - 12:18:57 Runtime:0.124s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P1218_Getline_Three_Shoes {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int nowCase = 1;
        String line = br.readLine();
        while (true) {
            if (line == null) {
                break;
            }
            int matching = 0, countMale = 0, countFemale = 0;
            int sizeRequired = Integer.parseInt(line);
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                int size = Integer.parseInt(st.nextToken());
                String sex = st.nextToken();
                if (size == sizeRequired) {
                    matching++;
                    if (sex.equals("M")) {
                        countMale++;
                    } else {
                        countFemale++;
                    }
                }
            }
            bw.append("Caso " + nowCase + ":\n");
            bw.append("Pares Iguais: " + matching + "\n");
            bw.append("F: " + countFemale + "\n");
            bw.append("M: " + countMale + "\n");
            bw.flush();
            line = br.readLine();
            if (line != null) {
                bw.newLine();
                bw.flush();
            }
            nowCase++;
        }

    }
}