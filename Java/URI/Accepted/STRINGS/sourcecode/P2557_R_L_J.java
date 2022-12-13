/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: String 
 * @Problem: 2557 - R+L=J
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2557
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 5/9/17, 8:20:48 PM
 * @Runtime: 0.048s 
 * @Solution:
 * @Note:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2557_R_L_J {

    static String[] in;
    static int R, L, J;

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        String input;
        while ((input = br.readLine()) != null) {
            in = input.split("[+=]");
            if (in[0].equals("R")) {
                R = 0;
                L = Integer.parseInt(in[1]);
                J = Integer.parseInt(in[2]);
                int tmp = 0;
                while (true) {
                    if ((R + tmp) + L == J) {
                        bw.append(tmp + "\n");
                        break;
                    }
                    if ((R - tmp) + L == J) {
                        bw.append((R - tmp) + "\n");
                        break;
                    }
                    tmp++;
                }

            } else if (in[1].equals("L")) {
                R = Integer.parseInt(in[0]);
                L = 0;
                J = Integer.parseInt(in[2]);
                int tmp = 0;
                while (true) {
                    if (R + (L + tmp) == J) {
                        bw.append(tmp + "\n");
                        break;
                    }
                    if (R + (L - tmp) == J) {
                        bw.append((L - tmp) + "\n");
                        break;
                    }
                    tmp++;
                }
            } else if (in[2].equals("J")) {
                R = Integer.parseInt(in[0]);
                L = Integer.parseInt(in[1]);
                bw.append((R + L) + "\n");
            }
        }
        bw.flush();

    }

}
