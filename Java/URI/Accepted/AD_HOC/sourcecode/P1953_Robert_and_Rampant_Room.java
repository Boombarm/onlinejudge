/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1953 Robert and Rampant Room
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1953
 * @Timelimit: 1 sec
 * @Status: Accepted 07/11/2015 - 09:42:43 Runtime:0.072s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1953_Robert_and_Rampant_Room {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = "";
        while ((line = br.readLine()) != null) {
            int EPR = 0, EHD = 0, intruders = 0;
            int n = Integer.parseInt(line);
            for (int i = 0; i < n; i++) {
                String student = br.readLine();
                if (student.endsWith("EPR")) {
                    EPR++;
                } else if (student.endsWith("EHD")) {
                    EHD++;

                } else {
                    intruders++;
                }
            }
            bw.append("EPR: " + EPR + "\n");
            bw.append("EHD: " + EHD + "\n");
            bw.append("INTRUSOS: " + intruders + "\n");
        }
        bw.flush();
    }

}
