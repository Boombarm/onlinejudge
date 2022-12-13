/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1980 Shuffling
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1980
 * @Timelimit: 1 sec
 * @Status: Accepted 28/10/2015 - 11:03:32 Runtime:0.028s
 * @Solution: factorial
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1980_Shuffling {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String line = br.readLine();
            if (line.equals("0")) {
                break;
            }
            if (line.length() > 15) {
                bw.write("0");
            } else {
                int length = line.length();
                long output = 1;
                for (int i = 2; i <= length; i++) {
                    output *= i;
                }
                bw.write(output+"");
            }
            bw.newLine();
            bw.flush();
        }
    }

}
