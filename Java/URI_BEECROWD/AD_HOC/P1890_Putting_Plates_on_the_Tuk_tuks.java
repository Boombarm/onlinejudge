/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: AD-HOC
 * @Problem: 1890 - Putting Plates on the Tuk-tuks 
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1890
 * @Timelimit: 1 sec
 * @Status: Accepted 
 * @Submission: 4/25/17, 5:17:25 AM 
 * @Runtime: 0.028s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1890_Putting_Plates_on_the_Tuk_tuks {

    static int C, D;
    static long anwer;

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);

        int t = Integer.parseInt(br.readLine());
        String input;
        while (t-- > 0) {
            input = br.readLine();
            if (input.equals("0 0")) {
                bw.append("0\n");
                continue;
            }
            String[] in = input.split(" ");
            C = Integer.parseInt(in[0]);
            D = Integer.parseInt(in[1]);
            anwer = (long) (pow(26, C) * pow(10, D));
            bw.append(anwer + "\n");
        }
        bw.flush();
    }

    public static double pow(double a, int b) {
        double result = 1;
        while (b > 0) {
            if (b % 2 != 0) {
                result *= a;
                b--;
            }
            a *= a;
            b /= 2;
        }

        return result;

    }

}
