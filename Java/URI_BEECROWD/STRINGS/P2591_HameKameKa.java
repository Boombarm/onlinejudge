package URI.Accepted.STRINGS.sourcecode;


/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: STRING
 * @Problem: 2591 - HameKameKa
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2591
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission:
 * @Runtime: 0.044s
 * @Solution:
 * @Note: ดูจำนวนการเกิดของ a เช่น haaaamekaaame ก็คือ h[aaaa]mek[aaa]me  4*3 = 12
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P2591_HameKameKa {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            char[] c = br.readLine().toCharArray();
            String a = "";
            int i = 1;
            while (c[i] != 'm') {
                a += c[i];
                i++;
            }
            i += 3;
            String output = "";
            while (c[i] != 'm') {
                output += a;
                i++;
            }
            bw.append("k" + output + "\n");
        }
        bw.flush();
    }

}
