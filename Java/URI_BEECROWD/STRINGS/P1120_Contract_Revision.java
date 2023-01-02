/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1120 Contract Revision
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1120
 * @Timelimit: 1 sec
 * @Status: Accepted 24/10/2015 - 11:08:27 Runtime:0.152s
 * @Solution:
 */
package Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class P1120_Contract_Revision {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = "";
        while ((line = br.readLine()) != null) {
            if (line.startsWith("0")) {
                break;
            }
            String[] st = line.split(" ");
            st[1] = st[1].replaceAll(st[0], "");
            bw.write(st[1].isEmpty() ? "0" : new BigInteger(st[1]).toString());
            bw.newLine();
            bw.flush();
        }

    }

}
