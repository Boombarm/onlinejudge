/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1987 Divisibility by 3
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1987
 * @Timelimit: 1 sec
 * @Status: Accepted 05/12/2015 - 05:59:40 Runtime:0.052s
 * @Solution:
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class P1987_Divisibility_by_3 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (sc.hasNext()) {
            sc.next();
            String input = sc.next();
            int sum = 0;
            for (int i = 0; i < input.length(); i++) {
                sum += input.charAt(i) - '0';
            }
            bw.append((sum % 3 == 0 ? sum + " sim" : sum + " nao") + "\n");
        }
        bw.flush();
    }

}
