/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: Ad-Hoc
 * @Problem: 2144 BodyBuilder
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2144
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 1/16/17, 1:40:30 PM
 * @Runtime: 0.036s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2144_Bodybuilder {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int w1, w2, r;
        double average, rm = 0;
        while (!input.equals("0 0 0")) {
            String[] st = input.split(" ");
            w1 = Integer.parseInt(st[0]);
            w2 = Integer.parseInt(st[1]);
            r = Integer.parseInt(st[2]);
            double n1 = w1 * (1 + r / 30.0);
            double n2 = w2 * (1 + r / 30.0);
            average = (n1 + n2) / 2.0;
            rm += average;
            if (average >= 1 && average < 13) {
                bw.append("Nao vai da nao\n");
            } else if (average >= 13 && average < 14) {
                bw.append("E 13\n");
            } else if (average >= 14 && average < 40) {
                bw.append("Bora, hora do show! BIIR!\n");
            } else if (average >= 40 && average <= 60) {
                bw.append("Ta saindo da jaula o monstro!\n");
            } else if (average > 60) {
                bw.append("AQUI E BODYBUILDER!!\n");
            }
            input = br.readLine();
        }
        if (rm > 40) {
            bw.append("\nAqui nois constroi fibra rapaz! Nao e agua com musculo!\n");
        }
        bw.flush();

    }

}
