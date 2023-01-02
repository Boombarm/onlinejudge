/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 2139 Pedrinho's Christmas
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2139
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 7/18/16, 3:43:37 PM
 * @Runtime:  0.032s
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2139_Pedrinhos_Christmas {

    static int[] month = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while ((input = br.readLine()) != null) {
            String[] sp = input.split(" ");
            int a = Integer.parseInt(sp[0]);
            int b = Integer.parseInt(sp[1]);
            if (a == 12) {
                if (b > 25) {
                    bw.append("Ja passou!\n");
                } else if (b == 24) {
                    bw.append("E vespera de natal!\n");
                } else if (b == 25) {
                    bw.append("E natal!\n");
                } else {
                    bw.append("Faltam " + (25 - b) + " dias para o natal!\n");
                }
            } else {
                int result = (month[a - 1] - b) + 25;
                for (int i = 10; i > a - 1; i--) {
                    result += month[i];
                }
                bw.append("Faltam " + result + " dias para o natal!\n");
            }
        }
        bw.flush();
    }

}
